package com.example.loudncloud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Community_Archives extends AppCompatActivity {
    private Button buttonForScience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_archives);

        buttonForScience=(Button) findViewById(R.id.buttonForScience);
        buttonForScience.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openScience();
            }
        });
    }

    public void openScience(){
        Intent intent=new Intent(this, Community_Science.class);
        startActivity(intent);
    }

}