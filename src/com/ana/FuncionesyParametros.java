package com.ana;

public class FuncionesyParametros {

    public static void main(String[] args) {

        holaMundo(); //Función que imprime
        holaMundo("Ana");
        holaMundo("Jorge");
        //devolverHola(); //Estamos llamando a la función devolverHola. Asi no se está haciendo nada con él
        String hola = devolverHola(); //Podemos asignarlo a una variable y luego imprimirla
        System.out.println(hola);

    }

        private static void holaMundo() { //Dentro de la función lo que tiene que imprimir
            System.out.println("Hola mundo desde un método 1");
            System.out.println("Hola mundo desde un método 2");
    }

        private static void holaMundo(String name) { //Dentro de la función lo que tiene que imprimir
            System.out.println("Hola " + name);
            System.out.println("Hola mundo desde un método 3");
            // Función void, no devuelve nada
    }

    private static String devolverHola() { //Tiene String porque va a devolver ese tipo de dato. Si tuviera int, tendría que devolver integer
        return "Hola";
    }
}

//Ámbito y retorno de una función
/*
private y public significa la visibilidad de la función
private solo es accesible desde una clase
pero si es public, se podrá invocar desde otra clase (archivo, por asi decir)
ejemplo para invocar: FuncionesyParametros.holaMundo();
Se pone el nombre de la clase, un punto y se invoca a la función
 */

/*
Modificador protected. Solo las clases hijas o que esten en el mismo paquete (com.ana)
podrán acceder
 */