package codepolitan.android_starterpack.challenge_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNumber1;
    private EditText etNumber2;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMultiple;
    private Button btnDivide;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // relate Layout xml to Activity
        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiple = findViewById(R.id.btnMultiple);
        tvResult = findViewById(R.id.tvResult);

        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strNumber1 = etNumber1.getText().toString();
                String strNumber2 = etNumber2.getText().toString();
                double dblResult = 0;

                if (strNumber1.trim().length()!=0 && strNumber2.trim().length()!=0){
                    dblResult = Double.parseDouble(strNumber1) * Double.parseDouble(strNumber2);
                }
                tvResult.setText(String.valueOf(dblResult));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strNumber1 = etNumber1.getText().toString();
                String strNumber2 = etNumber2.getText().toString();
                double dblResult = 0;

                if (strNumber1.trim().length()!=0 && strNumber2.trim().length()!=0){
                    dblResult = Double.parseDouble(strNumber1) / Double.parseDouble(strNumber2);
                }
                tvResult.setText(String.valueOf(dblResult));
            }
        });
    }

    public void plus(View view) {
        String strNumber1 = etNumber1.getText().toString();
        String strNumber2 = etNumber2.getText().toString();
        double dblResult = 0;

        if (strNumber1.trim().length()!=0 && strNumber2.trim().length()!=0){
            dblResult = Double.parseDouble(strNumber1) + Double.parseDouble(strNumber2);
        }
        tvResult.setText(String.valueOf(dblResult));
    }

    public void minus(View view) {
        String strNumber1 = etNumber1.getText().toString();
        String strNumber2 = etNumber2.getText().toString();
        double dblResult = 0;

        if (strNumber1.trim().length() != 0 && strNumber2.trim().length()!=0){
            dblResult = Double.parseDouble(strNumber1) - Double.parseDouble(strNumber2);
        }
        tvResult.setText(String.valueOf(dblResult));
    }
}