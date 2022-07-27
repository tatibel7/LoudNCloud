package com.example.loudncloud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ACT_SAT extends AppCompatActivity {
    private Button buttonForACT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_sat);

        buttonForACT=(Button) findViewById(R.id.buttonForACT);
        buttonForACT.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openACT();
            }
        });
    }

    public void openACT(){
        Intent intent=new Intent(this, ACT_Resources.class);
        startActivity(intent);
    }

}