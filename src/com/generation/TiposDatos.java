package com.generation;

public class TiposDatos {
    public static void main(String[] args){
        //const edad = 25;
        String nombre = "Niver Martínez";

        // datos primitivos numéricos
        byte num1 = 10;
        short num2 = 10;
        int num3 = 10;
        long num4 = 10;

        // datos primitivos decimales
        float decimal1 = 10.212234f;
        double decimal2 = 10.45342543;

        // dato primitivo char
        char character = 'f';

        // dato primitivo boolean
        boolean verdadero = true;

        // Conversión entre tipos de datos
        short numShort1 = num1;
        int numInt = numShort1;
        short numShort2 = (short) numInt;

        byte numByte1 = 120;
        byte numByte2 = 120;
        short sumaBytes = (short) (numByte1 + numByte2);

        System.out.println(numInt);
        System.out.println(numShort2);
        System.out.println(sumaBytes);

        // Operadores Aritméticos
        /*
            + sumar
            - restar
            * producto
            / división
            % residuo
        */
        int a = 4;
        int b = 5;

        int suma = a + b;
        int resta = a - b;
        float producto = (float) (a * b);
        float division = (float) (a / b);
        float residuo = (float) (a % b);

        System.out.println("\tSuma: "+ (suma) + "\n"
                            + "\tResta: "+ (resta) + "\n"
                            + "\tProducto: "+ (producto) + "\n"
                            + "\tDivison: "+ (division) + "\n"
                            + "\tResiduo: "+ (residuo) + "\n");
    }
}