package com.example.kylemiller.list_practise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TopAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_album);

        Chart chart = new Chart();
        ArrayList topTenChart = chart.getChart();

        TopAlbumAdapter albumAdapter = new TopAlbumAdapter(this, topTenChart);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(albumAdapter);


    }
}
