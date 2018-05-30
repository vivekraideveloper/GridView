package com.vijayjaidewan01vivekrai.gridview_github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);
        CustomAdapter adapter = new CustomAdapter(MainActivity.this);
        gridView.setAdapter(adapter);
    }
}
