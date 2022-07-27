package com.example.loudncloud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mission extends AppCompatActivity {
    private Button buttonForTatiana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission);

        buttonForTatiana=(Button) findViewById(R.id.buttonForTatiana);
        buttonForTatiana.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openTatiana();
            }
        });
    }

    public void openTatiana(){
        Intent intent=new Intent(this, Tatiana.class);
        startActivity(intent);
    }

}