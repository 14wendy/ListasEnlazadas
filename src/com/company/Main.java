package com.company;

import java.security.cert.CertPathValidatorResult;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Lista lista=new Lista();

        int opcion;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1) Insertar\n2) Mostrar\n3) Buscar\n4) Eliminar\n5) Contar\n6) Terminar\n¿Cuál es tu opción?");
            opcion=sc.nextInt();
           Lista.Validar(opcion);


            switch (opcion){
                //Agregar

                case 1:{
                    System.out.println("Teclee la cantidad de elementos de la lista:");

                        int num=sc.nextInt();
                        int obj;
                        for (int i=1; i<=num;i++){
                            System.out.print( "Teclee el elemento ["+ i+"]: ");
                            int valor=sc.nextInt();
                            obj=valor;
                            lista.Agregar(obj);
                        }

                    break;
                }
                //Mostrar lista
                case 2:{
                    System.out.println("\nLos datos de la lista son: ");
                    try {
                        lista.Mostrar();
                    }catch (Exception e){
                        System.out.println("No hay elementos en la lista");
                    }
                    break;
                }
                //Busca el valor por posición
                    //checar si la head esta vacia
                case 3:{

                    System.out.println("Teclee la posición del valor que busca");

                        int posicion=sc.nextInt();
                        System.out.println("El valor que busca es: " + lista.buscar(posicion));

                        System.out.println("Ingrese una posición valida (valor numérico)");
                        sc.nextInt();


                    break;
                }
                case 4:{
                    //Elimina el valor en la posición indicada
                    System.out.println("Teclee la posición del valor que desea eliminar");
                    int posicion=sc.nextInt();
                    lista.Eliminar(posicion);
                    break;
                }
                case 5:{
                    //Muestra el total de elementos en la lista
                    System.out.println("Total de elementos: "+lista.getTamaño());
                    break;

                }
                case 6:{
                    //Despedida
                    System.out.println("Vuelve pronto");
                    break;
                }
            }
        } while (opcion!=6);


    }


}
