package com.ana;

public class If_Else {
    public static void main(String[] args) {

        //Manera 1 con booleanos
        boolean check = 5 < 10;

        if (check) {
            System.out.println("verdadero");
        }

        //Manera 2 con int. Se pueden agregar más condiciones
        int number1 = 11;
        int number2 = 10;
        //int number3 = 20;

        if (number1 < number2){//&& number3 < number2)
            System.out.println("verdadero");
        //Si cambiamos el valor y no se cumple la condición
        //el código seguiría ejecutándose
            //Para eso podemos usar else
        } else if (number2 == number1) {
            System.out.println("Son iguales");

        } else {
            System.out.println("falso");
        }
        System.out.println("fin");
    }}
