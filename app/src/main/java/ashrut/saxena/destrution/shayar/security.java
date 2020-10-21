package ashrut.saxena.destrution.shayar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.rilixtech.widget.countrycodepicker.CountryCodePicker;

import java.util.concurrent.TimeUnit;

public class security extends AppCompatActivity {
    FirebaseAuth fAuth;
    FirebaseFirestore fstore;
    EditText phoneNumber, codeEnter;
    Button nextBtn;
    ProgressBar progressBar;
    TextView state;
    CountryCodePicker codePicker;
    String verificationid;
    PhoneAuthProvider.ForceResendingToken Token;
    Boolean verificationinprogress = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);

        fAuth = FirebaseAuth.getInstance();
        phoneNumber = findViewById(R.id.phone);
        codeEnter = findViewById(R.id.codeEnter);
        progressBar = findViewById(R.id.progressBar);
        nextBtn = findViewById(R.id.nextBtn);
        state = findViewById(R.id.state);
        codePicker = findViewById(R.id.ccp);
        fstore = FirebaseFirestore.getInstance();


        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!verificationinprogress) {
                    if (!phoneNumber.getText().toString().isEmpty() && phoneNumber.getText().toString().length() == 10) {

                        String phoneNum = "+" + codePicker.getSelectedCountryCode() + phoneNumber.getText().toString();
                        Log.d("TAG", "onClick phone no" + phoneNum);
                        progressBar.setVisibility(View.VISIBLE);
                        state.setText("SENDING OTP..");
                        requestOTP(phoneNum);


                    } else {
                        phoneNumber.setError("Phone Number is not valid..");
                    }
                } else {

                    String userOTP = codeEnter.getText().toString();
                    if (!userOTP.isEmpty() && userOTP.length() == 6) {
                        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationid, userOTP);
                        verifyauth(credential);
                    } else {
                        codeEnter.setError("valid otp is req");

                    }
                }


            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        if (fAuth.getCurrentUser() != null) {
            progressBar.setVisibility(View.VISIBLE);
            state.setText("Checking..");
            state.setVisibility(View.VISIBLE);
            checkuserprofile();
        }
    }


    private void verifyauth(PhoneAuthCredential credential) {
        fAuth.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    checkuserprofile();
                } else {
                    Toast.makeText(security.this, "Authentication Failed..", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void checkuserprofile() {
        DocumentReference docref = fstore.collection("users").document(fAuth.getCurrentUser().getUid());
        docref.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()) {
                    startActivity(new Intent(security.this, mainactivity2.class));
                    finish();
                } else {
                    startActivity(new Intent(security.this, auth.class));
                    finish();
                }
            }
        });
    }

    private void requestOTP(String phoneNum) {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(phoneNum, 60L, TimeUnit.SECONDS, this, new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                super.onCodeSent(s, forceResendingToken);
                progressBar.setVisibility(View.GONE);
                state.setVisibility(View.GONE);
                codeEnter.setVisibility(View.VISIBLE);
                verificationid = s;
                Token = forceResendingToken;
                nextBtn.setText("Verify");
                verificationinprogress = true;
            }

            @Override
            public void onCodeAutoRetrievalTimeOut(String s) {
                super.onCodeAutoRetrievalTimeOut(s);
                Toast.makeText(security.this, "OTP expired,Re request the OTP", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
                verifyauth(phoneAuthCredential);

            }

            @Override
            public void onVerificationFailed(FirebaseException e) {
                Toast.makeText(security.this, "Cannot create Account.." + e.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}