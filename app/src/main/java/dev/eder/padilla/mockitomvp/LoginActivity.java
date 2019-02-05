package dev.eder.padilla.mockitomvp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import dev.eder.padilla.R;

public class LoginActivity extends AppCompatActivity implements Login.View {

    private EditText mEtUser;
    private EditText mEtPass;
    private Button mBuLogin;

    private Login.Presenter presenter;
    private String TAG = LoginActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mEtUser = findViewById(R.id.mEtUser);
        mEtPass = findViewById(R.id.mEtPassword);
        mBuLogin = findViewById(R.id.mBuLogin);
        presenter = new LoginPresenter(this);
    }

    @Override
    public void validUser() {
        Log.e(TAG, "Success!!: " );
    }

    @Override
    public void error() {
        Log.e(TAG, "error: " );
    }

    @Override
    public String getUserName() {
        return mEtUser.getText().toString();
    }

    @Override
    public String getPassword() {
        return mEtPass.getText().toString();
    }
}
