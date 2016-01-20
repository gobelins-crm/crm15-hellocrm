package fr.louisbl.hellocrm15;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by louis on 20/01/16.
 * The Main Activity
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
    }

    public void buttonClicked(View view) {
        Log.d(TAG, "button clicked");
    }
}
