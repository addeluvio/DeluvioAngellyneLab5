package com.deluvio.angellyne;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent i = new Intent(this, CustomService.class);
        startService(i);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.act1) {
            i = new Intent(this, Activity1.class);
            startActivity(i);
        } else if (v.getId() == R.id.map2) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("geo:13.502453,120.955032?q=puerto+galera"));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);
        }
    }
}