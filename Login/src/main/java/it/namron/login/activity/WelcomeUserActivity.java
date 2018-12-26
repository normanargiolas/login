package it.namron.login.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import it.namron.circleimage.CircleImage;
import it.namron.login.R;
import it.namron.login.dto.CredentialDTO;

import static it.namron.login.constant.Constant.WELCOME_USER_BUNDLE;

public class WelcomeUserActivity extends AppCompatActivity {

    public TextView mUserNameText;
    public TextView mEmailText;
    public Button mBackButton;
    public CircleImage mCircleImage;

    CredentialDTO mUserInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupActivity();

        setContentView(R.layout.activity_welcome);

        mUserNameText = (TextView) findViewById(R.id.user_name_text);
        mEmailText = (TextView) findViewById(R.id.email_text);
        mBackButton = (Button) findViewById(R.id.welcomw_back_button);
        mCircleImage = (CircleImage) findViewById(R.id.user_welcome_profile_photo);


        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("result", "Tutto ok");
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });

        int imageId = getResourseId(this, mUserInfo.getUserIcon(), "drawable", getPackageName());
        mCircleImage.setImageResource(imageId);

        mUserNameText.setText(mUserInfo.getName());
        mEmailText.setText(mUserInfo.getEmail());
    }

    public static int getResourseId(Context context, String pVariableName, String pResourcename, String pPackageName) throws RuntimeException {
        try {
            return context.getResources().getIdentifier(pVariableName, pResourcename, pPackageName);
        } catch (Exception e) {
            throw new RuntimeException("Error getting Resource ID.", e);
        }
    }

    private void setupActivity() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mUserInfo = (CredentialDTO) bundle.getParcelable(WELCOME_USER_BUNDLE);
        }
    }

}

