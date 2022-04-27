package wlankasper.android_template;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import wlankasper.android_template.activity.GameActivity;
import wlankasper.android_template.logger.Logger;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        start.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, GameActivity.class);
            startActivity(intent);
            Logger.logString(TAG, "Started Activity: GameActivity");
        });
    }

    private void initViews(){
        start = findViewById(R.id.main_btn_start);
    }
}