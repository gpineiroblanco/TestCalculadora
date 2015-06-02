/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratest;

import java.util.Scanner;

/**
 *
 * @author gpineiroblanco
 */
public class Vista {

    public static void introducir(Modelo mo) {

        System.out.println("introduce la operación que deseas\nsumar\nrestar\nmultiplicar\ndividir\n");
        Scanner dato = new Scanner(System.in);
        mo.setOperacion(dato.nextLine());
        System.out.println("introduce el primer operando");
        Scanner num = new Scanner(System.in);
        mo.setNum1(num.nextFloat());
        System.out.println("introduce el segundo operando");
        Scanner num1 = new Scanner(System.in);
        mo.setNum2(num1.nextFloat());

    }

    public static void imprimir(Modelo mo) {
        System.out.println(mo);
    }
}
