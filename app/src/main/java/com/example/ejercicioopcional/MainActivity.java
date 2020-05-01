package com.example.ejercicioopcional;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ejercicioopcional.Ordenamiento.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String LOGTAG="Informacion";
    ArregloEnteros numeros=new ArregloEnteros(99999);
    Button btnguardar;
    TextView tvlista;
    ImageButton ibtnmas;
    EditText etnumero;
    Ordenamientos orden;
    int posicion=-1;
    String resultado=" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnumero=findViewById(R.id.etnumero);
        tvlista=findViewById(R.id.tvlista);
        btnguardar=findViewById(R.id.btnguardar);
        ibtnmas=findViewById(R.id.ibtnagregar);

        btnguardar.setOnClickListener(this);
        ibtnmas.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.ibtnagregar:
                if(!etnumero.getText().toString().isEmpty()) {
                    if(numeros.ValidaEspacio()) {
                        try{
                            numeros.Insertar(Integer.parseInt(etnumero.getText().toString()));
                            posicion++;
                            Toast.makeText(MainActivity.this, getResources().getString(R.string.agregarval) + ": " + numeros.VerDato(posicion), Toast.LENGTH_SHORT).show();
                            etnumero.setText("");
                            Log.i(LOGTAG, "Insertar Dato: " + numeros.VerDato(posicion));
                        }catch(Exception e) {
                            Toast.makeText(MainActivity.this, getResources().getString(R.string.menos), Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(MainActivity.this, getResources().getString(R.string.lleno),Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, getResources().getString(R.string.intronum),Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnguardar:
                resultado=" ";
                tvlista.setText(resultado);
                if(posicion==-1){
                    Toast.makeText(MainActivity.this, getResources().getString(R.string.intronum),Toast.LENGTH_LONG).show();
                }else{
                    orden=new Ordenamientos();
                    Log.i(LOGTAG, "Info del objeto: " + numeros.getArreglo() +" posicion del arreglo"+posicion);
                    orden.Insercion(numeros.getArreglo(),posicion,getApplicationContext());
                    for(int i=0;i<=posicion;i++){
                      resultado=numeros.Mostrar(i,getApplicationContext())+", "+resultado;
                        Log.i(LOGTAG, " Mostrar Dato: " + numeros.Mostrar(i,getApplicationContext()) +" Posicion: "+i);
                    }
                    tvlista.setText(resultado);
                }
                break;
        }
    }
}
