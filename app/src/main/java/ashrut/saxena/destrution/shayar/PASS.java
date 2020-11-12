package ashrut.saxena.destrution.shayar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PASS extends AppCompatActivity {
    TextView Title;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Title = findViewById(R.id.TI);
        description = findViewById(R.id.t);

        Intent i = getIntent();
        String title = i.getStringExtra("SHAYARI");

        Title.setText(title);
    }
}
