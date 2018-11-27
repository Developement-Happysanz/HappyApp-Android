package com.happysanz.happyapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.happysanz.happyapp.R;
import com.linkedin.platform.LISessionManager;
import com.linkedin.platform.errors.LIAuthError;
import com.linkedin.platform.listeners.AuthListener;
import com.linkedin.platform.utils.Scope;

public class SocialLoginActivity extends Activity {
    private static final String TAG = SocialLoginActivity.class.getSimpleName();
    public static final String PACKAGE = "com.happysanz.happyapp";
        Button login_linkedin_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.login_activity);
        login_linkedin_btn = (Button) findViewById(R.id.linkedin_login);
                login_linkedin_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                            login_linkedin();
                    }
                });
    }
    // Authenticate with linkedin and intialize Session.</p>
    public void login_linkedin(){
            LISessionManager.getInstance(getApplicationContext()).init(this, buildScope(), new AuthListener() {
                @Override
                public void onAuthSuccess() {
                // Toast.makeText(getApplicationContext(), &quot;success&quot; + LISessionManager.getInstance(getApplicationContext()).getSession().getAccessToken().toString(), Toast.LENGTH_LONG).show();</p>
            }
            @Override
                public void onAuthError(LIAuthError error) {
                Toast.makeText(getApplicationContext(), "Failed"  + error.toString(),
                            Toast.LENGTH_LONG).show();
                }
            }, true);
    }
    // After complete authentication start new HomePage Activity</p>
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            LISessionManager.getInstance(getApplicationContext()).onActivityResult(this,
            requestCode, resultCode, data);
            Intent intent = new Intent(SocialLoginActivity.this, UserProfileActivity.class);
            startActivity(intent);
    }
    // This method is used to make permissions to retrieve data from linkedin</p>
    private static Scope buildScope() {
        return Scope.build(Scope.R_BASICPROFILE, Scope.R_EMAILADDRESS);
    }
}