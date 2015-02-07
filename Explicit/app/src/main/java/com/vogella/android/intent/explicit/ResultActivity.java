package com.vogella.android.intent.explicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {
    public static final String RESULT_STRING_KEY = "resultstringkey";

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);

        Bundle intentData = getIntent().getExtras();
        String text = intentData.getString(MainActivity.STRING_KEY);

        TextView view = (TextView) findViewById(R.id.displayintentextra);
        view.setText(text);
    }

    @Override
    public void finish() {

        Intent intent = new Intent();
        EditText edit = (EditText) findViewById(R.id.returnValue);
        String textVal = edit.getText().toString();
        intent.putExtra(RESULT_STRING_KEY, textVal);
        setResult(RESULT_OK, intent);

        super.finish();
    }
}