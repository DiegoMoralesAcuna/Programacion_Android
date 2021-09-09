package com.example.tareacalificada1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  static int nClics=0;
    private TextView textShortClics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mostrarTostada(View view ){
        Toast.makeText(this, "Demostración de una tostada", Toast.LENGTH_LONG).show();
        textShortClics = (TextView) findViewById(R.id.text_show);
        textShortClics.setText(Integer.toString(nClics));

    }
    public void aumentarClics(View view){
        nClics++;
        textShortClics.setText(Integer.toString(nClics));

    }
    public void reducirClics(View view){
        nClics--;
        textShortClics.setText(Integer.toString(nClics));
    }
    public void resetearClics(View view){
        nClics=0;
        textShortClics.setText(Integer.toString(nClics));
    }
}