
import Actions.ArreglosImpl;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Creacion del obj Scanner
        //Llamadas a los metodos de la interfaz

        Scanner scan = new Scanner(System.in);
        ArreglosImpl array1 = new ArreglosImpl();
        array1.insertarLongitudArray();
        array1.insertarValorArray();
        array1.sumarArreglo();

    }

}
