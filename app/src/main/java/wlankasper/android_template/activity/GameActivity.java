package wlankasper.android_template.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import wlankasper.android_template.R;


public class GameActivity extends AppCompatActivity {

    private Dialog settingsDialog;
    private Button modal_button_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ImageButton settingsBtn = findViewById(R.id.settingsImageButton);
        settingsBtn.setOnClickListener(view -> openSettings());
    }

    private void openSettings() {
        settingsDialog = new Dialog(this);
        settingsDialog.setCancelable(true);
        settingsDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        settingsDialog.setContentView(R.layout.settings_modal);

        initResModal();
        modal_button_start.setOnClickListener(view -> {

            settingsDialog.dismiss();
        });
        settingsDialog.show();
    }

    private void initResModal() {
        modal_button_start = settingsDialog.findViewById(R.id.buttonStartModal);
    }
}