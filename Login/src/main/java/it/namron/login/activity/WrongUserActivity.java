package it.namron.login.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import it.namron.login.R;

public class WrongUserActivity extends AppCompatActivity {

    public Button mBackButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);

        mBackButton = (Button) findViewById(R.id.wrong_back_button);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("result", "Tutto ok");
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}
