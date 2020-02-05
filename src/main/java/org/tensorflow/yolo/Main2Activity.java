package org.tensorflow.yolo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.tensorflow.yolo.view.ClassifierActivity;

public class Main2Activity extends AppCompatActivity {

    TextView Search;
    TextView Riddle;
    TextView Logical;
    TextView Puzzle;
    TextView Random;
    TextView Science;

    TextView parents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Search=(TextView) findViewById(R.id.Searching);
        parents=(TextView) findViewById(R.id.parents);
        Riddle=(TextView) findViewById(R.id.Riddles);
        Logical=(TextView) findViewById(R.id.Logical);
        Puzzle=(TextView) findViewById(R.id.puzzle);
        Random=(TextView) findViewById(R.id.Random);
        Science=(TextView) findViewById(R.id.Science);
        ClassifierActivity.Question="";
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassifierActivity.Question="Find Bottle";
                ClassifierActivity.Tag=1;
                startActivity(new Intent(Main2Activity.this, ClassifierActivity.class));
            }
        });

        Riddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassifierActivity.Question="Something Green which gives us food";
                ClassifierActivity.Tag=2;
                startActivity(new Intent(Main2Activity.this, ClassifierActivity.class));
            }
        });

        Logical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassifierActivity.Question="Best Mode of transport";
                ClassifierActivity.Tag=3;
                startActivity(new Intent(Main2Activity.this, ClassifierActivity.class));
            }
        });

        Puzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassifierActivity.Question="Its to heavy , but we need to carry it";
                ClassifierActivity.Tag=4;
                startActivity(new Intent(Main2Activity.this, ClassifierActivity.class));
            }
        });

        Random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassifierActivity.Question="Search Human";
                ClassifierActivity.Tag=5;
                startActivity(new Intent(Main2Activity.this, ClassifierActivity.class));
            }
        });

        Science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassifierActivity.Question="Find a tree";
                ClassifierActivity.Tag=6;
                startActivity(new Intent(Main2Activity.this, ClassifierActivity.class));
            }
        });

        parents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this,MainActivity.class));
            }
        });

    }
}
