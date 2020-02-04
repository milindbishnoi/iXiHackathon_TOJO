package org.tensorflow.yolo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.tensorflow.yolo.view.ClassifierActivity;

public class Main2Activity extends AppCompatActivity {

    TextView next;
    TextView parents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        next=(TextView) findViewById(R.id.click);
        parents=(TextView) findViewById(R.id.parents);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
