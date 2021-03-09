package com.company;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class MyCalculator {

    Scanner sc = new Scanner(System.in);

    private int a;
    private int b;
    private int x;
    private int y;

    public MyCalculator (){
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "MyCalculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    ///---------------------------------------------EJERCICIO 1---------------------------------------------------------

    public int ingresoA(){
        System.out.println("Ingrese el valor de la base");
        int a = sc.nextInt();
        if(a < 0 ){
            throw  new RuntimeException("Los valores deben ser positivos");
        }
        else if(a == 0){
            throw new RuntimeException("Los valores no pueden ser 0");
        }
        return a;
    }

    public int ingresoB(){
        System.out.println("Ingrese el valor de la potencia");
        int b = sc.nextInt();
        if(b < 0 ){
            throw  new RuntimeException("Los valores deben ser positivos");
        }
        else if(b == 0){
            throw new RuntimeException("Los valores no pueden ser 0");
        }
        return b;
    }

    /** Math.pow(a,b); */
    public int longPower(int a, int b){
        int result = (int) Math.pow(a,b);
        return result;
    }

    ///----------------------------------------------EJERCICIO 2--------------------------------------------------------
    /*
        Dados dos números enteros x e y como inputs deberás realizar la operación x/y. Si
        x e y no son números enteros o si y vale cero, se producirá una excepción y deberás
        informarla. Las excepciones son java.util.InputMismatchException y
        java.lang.ArithmeticException.
    */

    public int ingresoX(){
        System.out.println("Ingrese el valor de X");
        int x = sc.nextInt();
        if(x < 0 ){
            throw  new java.util.InputMismatchException("Los valores deben ser positivos");
        }
        else if(x == 0){
            throw new ArithmeticException("Los valores no pueden ser 0");
        }
        return x;
    }

    public int ingresoY(){
        System.out.println("Ingrese el valor de Y");
        int y = sc.nextInt();
        if(y < 0 ){
            throw  new java.util.InputMismatchException("Los valores deben ser positivos");
        }
        else if(y == 0){
            throw new ArithmeticException("Los valores no pueden ser 0");
        }
        return y;
    }

    public int division(int x,int y){
        int division = x/y;
        return division;
    }

    ///----------------------------------------------EJERCICIO 3--------------------------------------------------------


}
