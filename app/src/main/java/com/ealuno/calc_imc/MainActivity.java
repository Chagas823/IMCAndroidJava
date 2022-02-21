package com.ealuno.calc_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    TextView textView;
    Button button;
    double peso;
    String texto;
    String texto2;
    double altura;
    String resultado;
    double IMC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editTextNumber1);
        editText2 = (EditText) findViewById(R.id.editTextNumber2);
        textView = (TextView) findViewById(R.id.textView1);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(calcular());
            }
        });

    }
    public String calcular(){
        texto = editText1.getText().toString();
        peso = Double.parseDouble(texto);

        texto2 = editText2.getText().toString();
        altura = Double.parseDouble(texto2);

        IMC = (peso)/(altura*altura)*10000;
        resultado = Double.toString(IMC);
        return resultado;
    }

}