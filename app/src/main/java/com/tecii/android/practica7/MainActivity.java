package com.tecii.android.practica7;

import android.nfc.TagLostException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText txtCOp, txtCAdy;
    public TextView txtHipo, txtArea, txtPeri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCOp = (EditText)findViewById(R.id.txtCOp);
        txtCAdy = (EditText)findViewById(R.id.txtCAdy);
        txtHipo = (TextView)findViewById(R.id.txtHipo);
        txtArea = (TextView)findViewById(R.id.txtArea);
        txtPeri = (TextView)findViewById(R.id.txtPeri);
    }

    public void calcular (View view){
        String opuesto = txtCOp.getText().toString();
        String adyacente = txtCAdy.getText().toString();
        double o = Double.parseDouble(opuesto);
        double a = Double.parseDouble(adyacente);
        double hipo = Math.sqrt(Math.pow(o,2) + Math.pow(a,2));
        double area = (o * a)/2;
        double p = o + a + hipo;
        String res = "La hipotenusa es: " + hipo;
        String res2 = "El area es: " + area;
        String res3 = "El perimetro es: " + p;
        txtHipo.setText(res);
        txtArea.setText(res2);
        txtPeri.setText(res3);
    }
}
