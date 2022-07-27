package com.example.loudncloud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonForMission;
    private Button buttonForCommunity;
    private Button buttonForMentor;
    private Button buttonForEvents;
    private Button buttonForStudyResources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonForMission = (Button) findViewById(R.id.buttonForMission);
        buttonForCommunity = (Button) findViewById(R.id.buttonForCommunity);
        buttonForMentor = (Button) findViewById(R.id.buttonForMentor);
        buttonForEvents = (Button) findViewById(R.id.buttonForEvents);
        buttonForStudyResources = (Button) findViewById(R.id.buttonForStudyResources);


        buttonForMission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMission();
            }
        });


        buttonForCommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCommunity();
            }
        });


        buttonForMentor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMentor();
            }
        });

        buttonForEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEvents();
            }
        });

        buttonForStudyResources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStudyResources();
            }
        });

        }

        public void openMission(){
            Intent intent=new Intent(this, Mission.class);
            startActivity(intent);
        }

        public void openCommunity(){
            Intent intent=new Intent(this, Community_Archives.class);
            startActivity(intent);
        }

        public void openMentor(){
            Intent intent=new Intent(this, Find_Mentor.class);
            startActivity(intent);
        }

        public void openEvents(){
            Intent intent=new Intent(this, calendar.class);
            startActivity(intent);
        }

        public void openStudyResources(){
            Intent intent=new Intent(this, ACT_SAT.class);
            startActivity(intent);
        }
}