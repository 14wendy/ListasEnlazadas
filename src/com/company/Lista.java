package com.company;

import java.util.Scanner;

public class Lista {

    private Nodo primero;
    int tamaño;


    //Agrega nuevos valores(objetos, nodos) a la lista
    public  void Agregar(Object p){
        Nodo nuevo=new Nodo(p);
        if(primero==null){
            primero=nuevo;
        }else {
            nuevo.siguiente=primero;
            primero=nuevo;
        }
    }

    //comprueba si hay valores en la lista
    public boolean Vacio(){
        return  primero==null;
    }


    public int getTamaño() {
        Nodo aux=null;
        int i=0;
        aux=primero;
        while (aux!=null){
            aux=aux.siguiente;
            i++;
        }
        return i;

    }

    //muestra la lista de los elementos
    public void Mostrar(){
        Nodo temp=primero;
        if (temp!=null){
            int con=0;
            while (temp!=null){

                    System.out.println("["+con+"] "+temp.dato.toString()+" ");
                    temp=temp.siguiente;
                    con++;



            }
        }
    }

    //Buscar el valor en la posición indicada
    public Object buscar(int index) {
        //Contador para recorrer la lista

            int contador = 0;
            //cabecera temporal
            Nodo temporal = primero;
            //ciclo que permite recorrer el indice de la lista hasta llegue al indice indicado
            while (contador < index) {

                temporal = temporal.getSiguiente();
                contador++;
            }
            return temporal.getDato();

    }

    //Elimina el valor en la posición indicada

    public void Eliminar(int index) {
        if(index==0){
            primero=primero.getSiguiente();
        }else {
            int contador = 0;
            Nodo temporal = primero;
            while (contador < index - 1) {
                temporal = temporal.getSiguiente();
                contador++;
            }
            temporal.linknext(temporal.getSiguiente().getSiguiente());

        }
        tamaño--;
    }
    public static void Validar(int i){
        Scanner sc=new Scanner(System.in);
        boolean concluido;
        do {
            try {
                concluido=false;
                i=sc.nextInt();
            }catch (Exception e){

                System.out.println("Ingrese un valor númerico");
                i=sc.nextInt();
            }
        }while (concluido=!true);
    }


}
