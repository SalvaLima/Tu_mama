package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Libro miLibro=new Libro("don quijote","9687j","cervantes",95);
        Libro miLibro2=new Libro("España","12948k","falete",20);
        System.out.println("mi libro se llama "+ miLibro.titulo + "con isbn " + miLibro.isbn + " y con autor " + miLibro.autor);
        System.out.println("mi libro se llama "+ miLibro2.titulo + "con isbn " + miLibro2.isbn + " y con autor " + miLibro2.autor);
    }

}
