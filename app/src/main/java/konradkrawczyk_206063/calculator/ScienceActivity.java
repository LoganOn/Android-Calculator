package konradkrawczyk_206063.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ScienceActivity extends Activity {
    public Button btn_openBracket;
    public Button btn_closeBracket;
    public Button btn_strong;
    public Button btn_e;
    public Button btn_Pi;
    public Button btn_percent;
    public Button btn_sin;
    public Button btn_cos;
    public Button btn_sqrt;
    public Button btn_squared;
    public Button btn_tan;
    public Button btn_power;
    public Button btn_ln;
    public Button btn_log;
    public Button btn_cube;
    public TextView tv_input;
    public TextView tv_result;
    public String x;
    public String y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btn_openBracket = (Button) findViewById(R.id.btn_openBracket);
        btn_closeBracket = (Button) findViewById(R.id.btn_closeBracket);
        btn_strong = (Button) findViewById(R.id.btn_strong);
        btn_e = (Button) findViewById(R.id.btn_e);
        btn_Pi = (Button) findViewById(R.id.btn_Pi);
        btn_percent = (Button) findViewById(R.id.btn_percent);
        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_sqrt = (Button) findViewById(R.id.btn_sqrt);
        btn_squared = (Button) findViewById(R.id.btn_squared);
        btn_tan = (Button) findViewById(R.id.btn_tan);
        btn_power = (Button) findViewById(R.id.btn_power);
        btn_ln = (Button) findViewById(R.id.btn_ln);
        btn_log = (Button) findViewById(R.id.btn_log);
        btn_cube = (Button) findViewById(R.id.btn_cube);
        tv_result = (TextView) findViewById(R.id.tv_result);
        tv_input = (TextView) findViewById(R.id.tv_input);
        if (savedInstanceState != null) {
            int k = savedInstanceState.getInt("sResult");
            tv_input.setText(savedInstanceState.getString("sInput"));
            tv_result.setText(String.valueOf(k));
        }
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        String x = (String)tv_input.getText();
        int y = Integer.parseInt(tv_result.getText().toString());
        savedInstanceState.putString("sInput",x );
        savedInstanceState.putInt("sResult",y );
    }
}
