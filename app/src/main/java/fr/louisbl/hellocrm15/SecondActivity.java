package fr.louisbl.hellocrm15;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String textValue = intent.getStringExtra("TextValue");

        Log.d(TAG, textValue);

        setContentView(R.layout.activity_second);
    }
}
