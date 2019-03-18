package konradkrawczyk_206063.calculator;

import android.app.Activity;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class CalculatorActivity extends Activity {
    public Button btn_clear;
    public Button btn_division;
    public Button btn_multiply;
    public Button btn_backspace;
    public Button btn_seven;
    public Button btn_eight;
    public Button btn_nine;
    public Button btn_substraction;
    public Button btn_four;
    public Button btn_five;
    public Button btn_six;
    public Button btn_addition;
    public Button btn_one;
    public Button btn_two;
    public Button btn_three;
    public Button btn_result;
    public Button btn_sign;
    public Button btn_zero;
    public Button btn_dot;
    public TextView tv_input;
    public TextView tv_result;
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
    public double value;
    public double value1;
    public double angle;
    public int x;
    public double y;
    boolean add;
    boolean sub;
    boolean mul;
    boolean div;
    boolean sign;
    boolean power;
    boolean e;
    boolean pi;
    boolean percent;
    boolean sin;
    boolean cos;
    boolean tan;
    boolean ln;
    boolean log;
    boolean sqrt;
    boolean squared;
    boolean cube;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_division = (Button) findViewById(R.id.btn_division);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_backspace = (Button) findViewById(R.id.btn_backspace);
        btn_seven = (Button) findViewById(R.id.btn_seven);
        btn_eight = (Button) findViewById(R.id.btn_eight);
        btn_nine = (Button) findViewById(R.id.btn_nine);
        btn_substraction = (Button) findViewById(R.id.btn_substraction);
        btn_four = (Button) findViewById(R.id.btn_four);
        btn_five = (Button) findViewById(R.id.btn_five);
        btn_six = (Button) findViewById(R.id.btn_six);
        btn_addition = (Button) findViewById(R.id.btn_addition);
        btn_one = (Button) findViewById(R.id.btn_one);
        btn_two = (Button) findViewById(R.id.btn_two);
        btn_three = (Button) findViewById(R.id.btn_three);
        btn_result = (Button) findViewById(R.id.btn_result);
        btn_sign = (Button) findViewById(R.id.btn_sign);
        btn_zero = (Button) findViewById(R.id.btn_zero);
        btn_dot = (Button) findViewById(R.id.btn_dot);
        tv_input = (TextView) findViewById(R.id.tv_input);
        tv_result = (TextView) findViewById(R.id.tv_result);
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
//        if (savedInstanceState != null) {
//            tv_input.setText(savedInstanceState.getString("x"));
//            tv_result.setText(savedInstanceState.getInt("y"));
//        }

        btn_clear.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                if (tv_input.getText().length() > 0) {
                    tv_input.setText("");
                }
                else {
                    tv_result.setText("");
                }
            }
        });

        btn_zero.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
            tv_input.setText(tv_input.getText() + "0");
        }});
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "1");
            }
        });
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "2");
            }
        });
        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "3");
            }
        });
        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "4");
            }
        });
        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "5");
            }
        });
        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "6");
            }
        });
        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "7");
            }
        });
        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "8");
            }
        });
        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + "9");
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText(tv_input.getText() + ".");
            }
        });
        btn_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_input.getText().length() == 0 ) {
                    tv_input.setText("");
                } else {
                    value = Double.parseDouble(tv_input.getText() + "");
                    add = true;
                    tv_result.setText(tv_input.getText());
                    tv_input.setText(null);

                }
            }
        });
        btn_substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_input.getText().length() == 0) {
                    tv_input.setText("");
                }
                else{
                    value = Double.parseDouble(tv_input.getText() + "");
                    sub = true;
                    tv_result.setText(tv_input.getText());
                    tv_input.setText("");
                }
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_input.getText().length() == 0) {
                    tv_input.setText("");
                }
                else {
                    value = Double.parseDouble(tv_input.getText() + "");
                    mul = true;
                    tv_result.setText(tv_input.getText());
                    tv_input.setText("");
                }
            }
        });
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_input.getText().length() == 0) {
                    tv_input.setText("");
                }
                else {
                    value = Double.parseDouble(tv_input.getText() + "");
                    div = true;
                    tv_result.setText(tv_input.getText());
                    tv_input.setText("");
                }
            }
        });
        btn_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_input.getText().length() == 0) {

                }
                else {
                    int i = tv_input.getText().length();
                    tv_input.setText(tv_input.getText().subSequence(0, i - 1));
                }
            }
        });
        btn_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_input.getText().length() == 0) {
                    tv_input.setText("");
                } else if (sign == true) {
                    tv_input.setText(tv_input.getText().subSequence(1,tv_input.getText().length()));
                    sign = false;
                } else {
                    String temp = (String) tv_input.getText();
                    tv_input.setText("-" + temp);
                    sign = true;
                }
            }
        });
        btn_result.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                if(add){
                    value1 = Double.parseDouble(tv_input.getText() + "" );
                    tv_result.setText(String.valueOf(value + value1));
                    tv_input.setText("");
                }
                else if (sub){
                    value1 = Double.parseDouble(tv_input.getText() + "");
                    tv_result.setText(String.valueOf(value-value1));
                    tv_input.setText("");
                } else if (mul) {
                    value1 = Double.parseDouble(tv_input.getText() + "");
                    tv_result.setText(String.valueOf(value * value1));
                    tv_input.setText("");
                } else if (div) {
                    value1 = Double.parseDouble(tv_input.getText() + "");
                    tv_result.setText(String.valueOf(value / value1));
                    tv_input.setText("");
                } else if (power) {
                    value = Double.parseDouble(tv_input.getText().subSequence(0, tv_input.getText().length() - 1) + "");
                    long mul = 1;
                        if(value == 0)
                            tv_result.setText("1");
                        else{
                          for( int i = 1 ; i<= value; i++)
                              mul *= i;
                          tv_result.setText(String.valueOf(mul));
                          tv_input.setText("");

                }} else if (e) {
                    if (tv_input.getText().length() > 1) {
                        value = Double.parseDouble(tv_input.getText().subSequence(0, tv_input.getText().length() - 1) + "");
                        tv_result.setText(String.valueOf(value * Math.E));
                        tv_input.setText("");
                    }
                    else {
                        tv_result.setText(String.valueOf(Math.E));
                        tv_input.setText("");
                    }

                } else if (pi) {
                    if (tv_input.getText().length() > 1) {
                        value = Double.parseDouble(tv_input.getText().subSequence(0, tv_input.getText().length() - 1) + "");
                        tv_result.setText(String.valueOf(value * Math.PI));
                        tv_input.setText("");
                    }
                    else {
                        tv_result.setText(String.valueOf(Math.PI));
                        tv_input.setText("");
                    }

                } else if (percent) {
                    value = Double.parseDouble(tv_input.getText().subSequence(0, tv_input.getText().length() - 1) + "");
                    tv_result.setText(String.valueOf(value / 100));
                    tv_input.setText("");


                } else if (sin) {

                    value = Double.parseDouble(tv_input.getText().subSequence(4, tv_input.getText().length()) + "");
                    angle = Math.toRadians(value);
                    float sin = (float)Math.sin(angle);
                    tv_result.setText((String.valueOf(sin)));
                    tv_input.setText("");

                }
                else if (cos) {
                    value = Double.parseDouble(tv_input.getText().subSequence(4, tv_input.getText().length()) + "");
                    angle = Math.toRadians(value);
                    float cos = (float)Math.cos(angle);
                    tv_result.setText(String.valueOf(cos));
                    tv_input.setText("");

                }
                else if (tan) {
                    value = Double.parseDouble(tv_input.getText().subSequence(4, tv_input.getText().length()) + "");
                    angle = Math.toRadians(value);
                    float tan = (float) Math.tan(angle);
                    tv_result.setText(String.valueOf(tan));
                    tv_input.setText("");

                } else if (squared) {

                        value = Double.parseDouble(tv_input.getText().subSequence(0, tv_input.getText().length() - 3) + "");
                        tv_result.setText(String.valueOf(Math.pow(value, 2)));
                        tv_input.setText("");

                } else if (power) {
                    value = Double.parseDouble(tv_input.getText().subSequence(0, x) + "");
                    value1 = Double.parseDouble(tv_input.getText().subSequence(x + 3, tv_input.getText().length()) + "");
                    tv_result.setText(String.valueOf(x));
                  //  tv_result.setText(String.valueOf(Math.pow(value, value1)));

                } else if (cube) {
                    value = Double.parseDouble(tv_input.getText().subSequence(0, tv_input.getText().length() - 3) + "");
                    tv_result.setText(String.valueOf(Math.pow(value, 3)));
                    tv_input.setText("");
                } else if (ln) {
                    value = Double.parseDouble(tv_input.getText().subSequence(3, tv_input.getText().length()) + "");
                    tv_result.setText(String.valueOf(Math.log(value)));
                    tv_input.setText("");
                } else if (log) {
                    value = Double.parseDouble(tv_input.getText().subSequence(4, tv_input.getText().length()) + "");
                    tv_result.setText(String.valueOf(Math.log10(value)));
                    tv_input.setText("");
                } else if (sqrt) {
                    value = Double.parseDouble(tv_input.getText().subSequence(1, tv_input.getText().length()) + "");
                    tv_result.setText(String.valueOf(Math.sqrt(value)));
                    tv_input.setText("");
                }
                add = sub = mul = div = power = e = pi = percent = sin = cos = tan = squared = cube = ln = log = sqrt = power =false;
            }
        });

    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("input", tv_input.getText().toString());
        savedInstanceState.putString("result", tv_result.getText().toString());

    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        tv_input.setText(savedInstanceState.getString("input"));
        tv_result.setText(savedInstanceState.getString("result"));
    }
    public void onClickOpenBracket (View v){
        tv_input.setText(tv_input.getText() + "(");
    }

    public void onClickCloseBracket(View v) {
        tv_input.setText(tv_input.getText() + ")");
    }
    public void onClickStrong(View v) {
        if (tv_input.getText().length() != 0) {
            tv_input.setText(tv_input.getText() + "!");
            power = true;
        }
    }

    public void onClickE(View v) {
        e = true;
        tv_input.setText(tv_input.getText() + "e");

    }
    public void onClickPi(View v) {
        pi = true;
        tv_input.setText(tv_input.getText() + "π");
    }

    public void onClickPercent(View v) {
        if (tv_input.getText().length() != 0) {
            percent = true;
            tv_input.setText(tv_input.getText() + "%");
        }
    }
    public void onClickSin(View v) {
        sin = true;
        tv_input.setText(tv_input.getText() + "sin(");
    }

    public void onClickCos(View view) {
        cos = true;
        tv_input.setText(tv_input.getText() + "cos(");
    }
    public void onClickSqrt(View view) {

            sqrt = true;
        tv_input.setText(tv_input.getText() + "√");
    }

    public void onClickSquared(View view) {
        if (tv_input.getText().length() != 0) {
            squared = true;
            tv_input.setText(tv_input.getText() + "x^2");
    }}

    public void onClickTan(View view) {
        tan = true;
        tv_input.setText(tv_input.getText() + "tan(");
    }

    public void onClickPower(View view) {
        if (tv_input.getText().length() != 0) {
            x = tv_input.getText().length();
            power = true;
            tv_input.setText(tv_input.getText() + "x^y");
    }}

    public void onClickCube(View view) {
        if (tv_input.getText().length() != 0) {
            cube = true;
            tv_input.setText(tv_input.getText() + "x^3");
        }
    }

    public void onClickLn(View view) {
        ln = true;
        tv_input.setText(tv_input.getText() + "ln(");
    }

    public void onClickLog(View view) {
        log = true;
        tv_input.setText(tv_input.getText() + "log(");
    }


}
