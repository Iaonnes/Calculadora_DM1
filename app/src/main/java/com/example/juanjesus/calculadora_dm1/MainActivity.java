package com.example.juanjesus.calculadora_dm1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Double[] numero = new Double[20];
    String[] entradas = new String[50];
    int contadorN = 0;
    int contadorE = 0;

    boolean dec = false;
    boolean suma = false;
    boolean resta = false;
    boolean multi = false;
    boolean divi = false;
   // boolean exp = false;

    double resultado = 0;
    int resul = 0;
   // double porc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button num1 = (Button) findViewById(R.id.n1);
        num1.setOnClickListener(this);
        Button num2 = (Button) findViewById(R.id.n2);
        num2.setOnClickListener(this);
        Button num3 = (Button) findViewById(R.id.n3);
        num3.setOnClickListener(this);
        Button num4 = (Button) findViewById(R.id.n4);
        num4.setOnClickListener(this);
        Button num5 = (Button) findViewById(R.id.n5);
        num5.setOnClickListener(this);
        Button num6 = (Button) findViewById(R.id.n6);
        num6.setOnClickListener(this);
        Button num7 = (Button) findViewById(R.id.n7);
        num7.setOnClickListener(this);
        Button num8 = (Button) findViewById(R.id.n8);
        num8.setOnClickListener(this);
        Button num9 = (Button) findViewById(R.id.n9);
        num9.setOnClickListener(this);
        Button num0 = (Button) findViewById(R.id.n0);
        num0.setOnClickListener(this);

        Button exp = (Button) findViewById(R.id.exp);
        exp.setOnClickListener(this);
        Button sqrt = (Button) findViewById(R.id.sqrt);
        sqrt.setOnClickListener(this);
       /* Button del = (Button) findViewById(R.id.del);
        del.setOnClickListener(this);*/
        Button ac = (Button) findViewById(R.id.ac);
        ac.setOnClickListener(this);

        Button point = (Button) findViewById(R.id.point);
        point.setOnClickListener(this);
        Button equal = (Button) findViewById(R.id.equal);
        equal.setOnClickListener(this);

        Button div = (Button) findViewById(R.id.div);
        div.setOnClickListener(this);
        Button mult = (Button) findViewById(R.id.mult);
        mult.setOnClickListener(this);
        Button rest = (Button) findViewById(R.id.rest);
        rest.setOnClickListener(this);
        Button sum = (Button) findViewById(R.id.sum);
        sum.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        TextView scrn = (TextView)findViewById(R.id.pantalla);

        int seleccion = v.getId();

        String a = scrn.getText().toString();

        try {
            switch (seleccion) {

                case R.id.n1:
                    scrn.setText(a+"1");
                    break;
                case R.id.n2:
                    scrn.setText(a+"2");
                    break;
                case R.id.n3:
                    scrn.setText(a+"3");
                    break;
                case R.id.n4:
                    scrn.setText(a+"4");
                    break;
                case R.id.n5:
                    scrn.setText(a+"5");
                    break;
                case R.id.n6:
                    scrn.setText(a+"6");
                    break;
                case R.id.n7:
                    scrn.setText(a+"7");
                    break;
                case R.id.n8:
                    scrn.setText(a+"8");
                    break;
                case R.id.n9:
                    scrn.setText(a+"9");
                    break;
                case R.id.n0:
                    scrn.setText(a+"0");
                    break;
                case R.id.ac:
                    scrn.setText("");

                    break;
                case R.id.div:
                    divi = true;
                    numero[0] = Double.parseDouble(a);
                    scrn.setText("");
                    break;
                case R.id.mult:
                    multi = true;
                    numero[0] = Double.parseDouble(a);
                    scrn.setText("");
                    break;
                case R.id.rest:
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    scrn.setText("");
                    break;
                case R.id.sum:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    scrn.setText("");
                    break;
                case R.id.point:

                    if (!dec){
                        scrn.setText(a+".");
                        dec = true;
                    }else{return;}

                    break;
                 case R.id.equal:

                     numero[1] = Double.parseDouble(a);


                     if (suma == true) {
                         resultado = numero[0] + numero[1];
                         resul = (int) resultado;
                         if(resul % resultado == 0){
                             scrn.setText(String.valueOf(resul));
                             dec = false;
                         }else{
                             scrn.setText(String.valueOf(resultado));
                             dec = false;
                         }

                         dec = false;

                     }else if (resta == true){
                         resultado = numero[0] - numero[1];
                         resul = (int) resultado;
                         if(resul % resultado == 0){
                             scrn.setText(String.valueOf(resul));
                             dec = false;
                         }else{
                             scrn.setText(String.valueOf(resultado));
                             dec = false;
                         }
                         dec = false;

                     }else if (multi == true){
                         resultado = numero[0] * numero[1];
                         resul = (int) resultado;
                         if(resul % resultado == 0){
                             scrn.setText(String.valueOf(resul));
                             dec = false;
                         }else{
                             scrn.setText(String.valueOf(resultado));
                             dec = false;
                         }
                         dec = true;

                     }else if (divi == true){
                         resultado = numero[0] / numero[1];
                         resul = (int) resultado;
                         if(resul % resultado == 0){
                             scrn.setText(String.valueOf(resul));
                             dec = false;
                         }else{
                             scrn.setText(String.valueOf(resultado));
                             dec = false;
                         }
                         dec = false;
                     }

                     dec = false;
                     suma = false;
                     resta = false;
                     multi = false;
                     divi = false;

                    break;
        }
        }catch(Exception e){
            scrn.setText("ERROR");
        }
    }
}
