package com.ana;

public class Funciones_Sobrecargadas {
    public static void main(String[] args) {
/*
Las funciones sobrecargadas son las que tienen el mismo nombre y son llamadas varias veces.
No serán sobrecargadas cuando a pesar de que tengan el mismo nombre, la función tiene argumentos
diferentes dentro de ella
 */
        holaMundo();
        holaMundo("Ana");
        holaMundo(6);
    }

    private static void holaMundo() { //Esta es la función sin argumentos
        System.out.println("Hola mundo desde un método 1");
    }

    private static void holaMundo(String name) { //Esta función tiene el argumento String
        System.out.println("Hola " + name);
    }

    private  static void holaMundo(int number) { //Esta función tiene el argumento int
        System.out.println("Tu número es: " + number);}
}
// name y number da error en amarillo porque los valores siempre son los mismos, no les he dado otro valor
//si invoco la función con otro valor que no sea Ana o 6, no tendrá este error
