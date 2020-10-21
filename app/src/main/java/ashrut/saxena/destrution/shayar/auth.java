package ashrut.saxena.destrution.shayar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class auth extends AppCompatActivity {
    EditText firstName, lastName, email;
    Button saveBtn;
    FirebaseAuth firebaseAuth;
    FirebaseFirestore fstore;
    String userid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        email = findViewById(R.id.emailAddress);
        saveBtn = findViewById(R.id.saveBtn);

        firebaseAuth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();

        userid = firebaseAuth.getCurrentUser().getUid();

        final DocumentReference docref = fstore.collection("users").document(userid);


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!firstName.getText().toString().isEmpty() && !lastName.getText().toString().isEmpty() && !email.getText().toString().isEmpty()) {
                    String first = firstName.getText().toString();
                    String last = lastName.getText().toString();
                    String useremail = email.getText().toString();

                    Map<String, Object> user = new HashMap<>();
                    user.put("firstName", first);
                    user.put("lastName", last);
                    user.put("emailAddress", useremail);

                    docref.set(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                startActivity(new Intent(getApplicationContext(), mainactivity2.class));
                                finish();
                            } else {
                                Toast.makeText(auth.this, "Data is not inserted..", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                } else {
                    Toast.makeText(auth.this, "All fields are required..", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });


    }

}
