package dev.eder.padilla;

import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import dev.eder.padilla.calculator.CalculatorPreUnitTest;

public class PreUnitTestActivity extends AppCompatActivity {

    private int result;

    private TextView mTvResult;
    private String TAG = PreUnitTestActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_unit_test);
        mTvResult = findViewById(R.id.mTvResult);
        result = CalculatorPreUnitTest.add(10,20);
        mTvResult.setText("Resultado "+result);
        Log.e(TAG, "onCreate: resultado "+result );
        if (result == 30){
            Log.e(TAG, "onCreate: resultado ok "+result );
        }else{
            Log.e(TAG, "onCreate: resultado No ok 😢"+result );
        }
    }
}
