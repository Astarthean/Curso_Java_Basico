package com.ana;

public class Clase_CocheMain {

    public static void main(String[] args) {

        String coche = "Ferrari";

        /*
        Tipo de dato / identificador = new objeto(invocar método constructor)
        (new = permite crear un nuevo objeto a partir de una clase)
         */

        Clase_Coche cocheObj1 = new Clase_Coche();

        Clase_Coche cocheObj2 = new Clase_Coche("negro", "honda", "civic", 1430.25, 5.4);

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.20; //Podemos cambiar valores del objeto

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "Blanco";
        cocheElectrico.fabricante = "Tesla";
        cocheElectrico.modelo = "RX";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "honda", "civic", 1430.25,
                5.4, "RTX");
        System.out.println(cocheElectrico2);

    }
}
