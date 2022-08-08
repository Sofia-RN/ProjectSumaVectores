package Actions;
import Entities.Numeros;

import java.util.Scanner;
import java.util.Arrays;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Clase hija utilizada como clase padre
//La clase ArreglosImpl hereda atributos de la clase Numeros
//Se implementa la Interfaz ArreglosI

public class ArreglosImpl extends Numeros implements ArreglosI {

    private int array1[];
    private int array2[];
    private int array3[];


    public ArreglosImpl() {
        super(getLongitud1(), getLongitud2(), getLongitud3());
        this.array1 = array1;
        this.array2 = array2;
        this.array3 = array3;
    }


    public int[] getArray2() {
        return array2;
    }

    public void setArray2(int[] array2) {
        this.array2 = array2;
    }

    public int[] getArray3() {
        return array3;
    }

    public void setArray3(int[] array3) {
        this.array3 = array3;
    }

    public int[] getArray1() {
        return array1;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    // Utilizando los metodos de la interfaz
    //Se utiliza el modelo de segregacion de interfaz

    @Override
    public void insertarLongitudArray() {

        Scanner scan = new Scanner(System.in);

        // Peticion al usuario para ingresar las variables solicitadas

        System.out.print("Ingresa el numero de la longitud del primer arreglo: ");

        int long1 = scan.nextInt();
        this.setLongitud1(long1);
        array1 = new int[getLongitud1()];

        System.out.print("Ingresa el numero de la longitud del segundo arreglo: ");
        int long2 = scan.nextInt();
        this.setLongitud2(long2);
        array2 = new int[getLongitud2()];

        int long3;
        if (getLongitud2() > getLongitud1()){
            long3 = getLongitud2();
            this.setLongitud3(long3);
        }else{
            long3 = getLongitud1();
            this.setLongitud3(long3);
        }
        array3 = new int[getLongitud3()];
    }

    @Override
    public void insertarValorArray() {
        Scanner scan = new Scanner(System.in);

        // Entrada para los elementos de la matriz uno

        System.out.println("Ingresa los elementos del primer arreglo: ");
        for (int i=0; i<array1.length; i++) {
            array1[i] = scan.nextInt();
        }

        // Entrada para los elementos de la matriz dos

        System.out.println("Ingresa los elementos del segundo arreglo: ");

        for (int i=0; i<array2.length; i++) {
            array2[i] = scan.nextInt();
        }

    }


    //Estamos utilizando los metodos de la interfaz
    //Se utiliza el modelo de segregacion de interfaz
    @Override
    public void sumarArreglo() {

        // Ciclo For para recorrer la matriz,
        //inicializar la longitud del array

        for(int i=0; i<array3.length; i++){
            int aux1 = 0;
            if (array1.length > i){
                aux1 = array1[i];
            }

            int aux2 = 0;
            if (array2.length > i){
                aux2 = array2[i];
            }
            array3[i] = aux1 + aux2;

        }
        System.out.println("Resultado de la suma del arreglo: " + Arrays.toString(array3));

    }


}

