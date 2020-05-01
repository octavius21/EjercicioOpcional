package com.example.ejercicioopcional.Ordenamiento;

import android.content.Context;

public class Ordenamientos{
    //ATRIBUTOS
    Context contexto;
    //CONSTRUCTORES
    //METODOS
    public void Intercambio(int []arreglo, int indice, Context contexto){//arreglo es una varible local, que recibe contenido del arreglo no es la misma del main
        //en lugar de ArregloEnteros2 va int, para un metodo general
        int i, j, aux;
        this.contexto=contexto;
        //aqui arreglo las variable que son los contadores
        //TIEMPO DE CPU
        for(i=0; i < indice; i++){
            for(j=i+1; j <= indice; j++){//Aqui si lleva la igualdad porque debe recorrer todas las casillas
                //contador de comparacion
                if(arreglo[i] > arreglo[j]){
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }//fin de la condicion
                //AQUI VA EL CONTADOR DE INTERCAMBIOS
            }//fin del ciclo j, esta es la salida de mi primera pasada, entre estas dos hago un ciclo para imprimir las pasadas o hacer un metodo
        }//fin del ciclo i
        //AQUI VA EL TIEMPO DE CPU IMPRIME CUANTO SE TARDO Y CUANTO INTERCAMBIOS

    }//Fin del metodo intercambio

    public void Seleccion(int []arreglo, int indice,Context contexto){
        int i, im, j, aux;
        for(i = 0; i < indice; i++){
            im=i;//inicializa en i porque cuando se termina el ciclo toma la posicion de i
            for(j =i + 1; j <= indice; j++){
                if(arreglo[im] > arreglo[j]){
                    im = j;
                }//Fin del if
            }//Fin del ciclo j

            if(im !=i){
                aux = arreglo[i];
                arreglo[i] = arreglo[im];
                arreglo[im]= aux;
            }
        }//Fin del ciclo i
    }//fin del metodo Seleccion

    public void Insercion(int []arreglo, int indice,Context contexto){
        int i, j, aux;
        this.contexto=contexto;
        for(i=0; i<=indice; i++){
            aux = arreglo[i];
            j=i;
            while(j > 0 && aux < arreglo[j-1]){
                arreglo[j] = arreglo[j-1];
                j--;
            }//fin del wile
            arreglo[j] = aux;

        }//fin del ciclo i

    }//Fin del metodo de insercion

}//Fin de la clase ordenamiento
