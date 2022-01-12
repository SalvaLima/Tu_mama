package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String nombreCliente, numeroCliente;
        double tipoInteres, saldo;

        Cuenta cuenta1 = new Cuenta();
        System.out.println("Nombre : ");
        nombreCliente = scn.nextLine();
        System.out.println("Número : ");
        numeroCliente = scn.nextLine();
        System.out.println("Tipo de interés : ");
        tipoInteres = scn.nextDouble();
        System.out.println("Saldo : ");
        saldo = scn.nextDouble();

    }

}
