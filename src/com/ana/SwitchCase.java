package com.ana;

public class SwitchCase {
    public static void main(String[] args) {

         String weather = "sunny";

         switch (weather) { //Se usa para evaluar multiples condiciones cuando no lo queremos hacer con if-else, para simplificar

             case "sunny":
                 System.out.println("El tiempo es soleado");
                 break; //Si no rompemos el flujo de ejecución, continuará a la siguiente casuística

             case "cloudy":
                 System.out.println("El tiempo es nublado");
                 break;
             default:
                 System.out.println("No se ha podido identificar el clima");

                 /*
                 Seguin intellij, la sintaxis puede ser así:

                 switch (weather) { //Se usa para evaluar diferentes condiciones cuando no lo queremos hacer con ifelse

            case "sunny" -> System.out.println("El tiempo es soleado");
            //Si no rompemos el flujo de ejecución, continuará a la siguiente casuística

            case "cloudy" -> System.out.println("El tiempo es nublado");
            default -> System.out.println("No se ha podido identificar el clima");
                  */
        }

         }
    }