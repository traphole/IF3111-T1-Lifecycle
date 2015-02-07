package com.vogella.android.lifecycle.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // configure the spinner in code
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] values = getResources().getStringArray(R.array.operating_systems);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        spinner.setAdapter(adapter);
    }

    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vogella.com"));
        startActivity(intent);
    }

}
