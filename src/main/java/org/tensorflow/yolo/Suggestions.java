package org.tensorflow.yolo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Suggestions extends Activity {

    TextView YT;
    TextView Time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestions);
        YT= (TextView) findViewById(R.id.knowmore);
        Time=(TextView) findViewById(R.id.time); 
        YT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=w77zPAtVTuI")));
            }
        });


    }
}
