package fr.louisbl.hellocrm15;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        final TextView myTextView = (TextView) findViewById(R.id.MyTextView);

        Button myButton = (Button) findViewById(R.id.MyButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("TextValue", myTextView.getText());
                startActivity(intent);
            }
        });
    }

}
