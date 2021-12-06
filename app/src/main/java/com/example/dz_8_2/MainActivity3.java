package com.example.dz_8_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        findViewById(R.id.button_red).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity main1 = new MainActivity();
                finishAffinity();
            }
        });
    }
}