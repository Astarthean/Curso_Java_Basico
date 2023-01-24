package com.ana;

public class Variables_TiposDatos {
    public static void main(String[] args) {

        // Tipo / Identificador(lo pone el programador) = / Valor(string,int...);

        // Tipo Identificador;
        // Identificador = Valor(string,int...);

        // Enteros
        byte number1 = 1; // 1 byte capacidad de almacenamiento
        short number2 = 2; // 2 byte ""
        int number3 = 3; // 4 byte ""
        long number4 = 4; // 8 byte ""

        // Punto flotante
        float decimal1 = 4.9f; // La f indica que es float, si no se pone lo identifica como double
        double decimal2 = 9.99; // Se podría poner al final una d o no poner nada. Tiene más capacidad que float

        // Carácter
        char caracter1 = 'a';

        // Booleanos
        boolean verdadero = true;
        boolean falso = false;

        // Tipos primitivos: enteros, flotante, character, booleanos (van con minuscula y no pueden tener valor null)

        // Cadenas de texto. Es de tipo clase, va con mayuscula
        String nombre = "Ana";
        String apellido = "Bernal";

        // Tipos envoltorio. Va en mayuscula como las clases y pueden envolver a los tipos de datos primitivos. Pueden tener valor null
        Integer numero = null;
        Long numero2 = 2L; // Hay que poner la L en mayuscula porque si no se piensa que hay que darle un tipo de dato primitivo long




    }
}
