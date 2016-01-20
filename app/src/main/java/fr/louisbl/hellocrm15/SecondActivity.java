package fr.louisbl.hellocrm15;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    public static final String TEXT_VALUE = "TextValue";
    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String textValue = intent.getStringExtra(TEXT_VALUE);

        Log.d(TAG, textValue);

        setContentView(R.layout.activity_second);
    }
}
