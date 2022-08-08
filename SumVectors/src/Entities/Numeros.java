package Entities;

//clase padre
//Cumple el modelo de responsabilidad unica
public class Numeros {

    //Declaracion de variables privadas
    private static int longitud1;
    private static int longitud2;
    private static int longitud3;

    //Constructor
    public Numeros (int longitud1, int longitud2, int longitud3){
        this.longitud1 = this.longitud1;
        this.longitud2 = this.longitud2;
        this.longitud3 = this.longitud3;
    }

    //Tomar valores de las variables privadas, haciendo referencia al Encapsulamiento
    public static int getLongitud1() {
        return longitud1;
    }

    public void setLongitud1(int longitud1) {
        this.longitud1 = longitud1;
    }

    public static int getLongitud2() {
        return longitud2;
    }

    public void setLongitud2(int longitud2) {
        this.longitud2 = longitud2;
    }

    public static int getLongitud3() {
        return longitud3;
    }

    public void setLongitud3(int longitud3) {
        this.longitud3 = longitud3;
    }
}
