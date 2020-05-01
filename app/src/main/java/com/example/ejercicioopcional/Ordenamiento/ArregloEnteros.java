package com.example.ejercicioopcional.Ordenamiento;

import android.content.Context;

public class ArregloEnteros {



    //ATRIBUTOS
    private int[] arreglo;
    private int indice;
    Context context;


    private Context contexto;

    //CONSTRUCTORES
    public ArregloEnteros(int max) {
        arreglo = new int[max];
        indice = -1;
    }

    //METODOS
    //insertar
    public boolean ValidaEspacio() {
        if (arreglo.length - 1 > indice)
            return true;
        else
            return false;
    }

    public void Insertar(int dato) {
        indice++;
        arreglo[indice] = dato;
        //return arreglo[indice];
    }

    public int VerDato(int pos) {
        return arreglo[pos];
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void Listar(){
        int i;
        for(i=0; i<=indice; i++){
            System.out.println(arreglo[i]+"\n");
        }
    }
    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    public int Mostrar(int pos,Context contexto){
        this.contexto=contexto;
        return arreglo[pos];

    }
    public Context getContexto() {
        return contexto;
    }

    public void setContexto(Context contexto) {
        this.contexto = contexto;
    }
}
