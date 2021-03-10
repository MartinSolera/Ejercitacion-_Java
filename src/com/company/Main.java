package com.company;

public class Main {

    public static void main(String[] args) {

        /** Ejercicio 1 */

        MyCalculator calculator = new MyCalculator();
        /*
        int a = calculator.ingresoA();
        int b = calculator.ingresoB();

        System.out.println("el valor ingresado es:" + a);
        System.out.println("el valor ingresado es:" + b);

        int result = calculator.longPower(a,b);
        System.out.println("El resultado es: " + result);
        */

        /**Ejercicio 2 */

        /*
        System.out.println("Ejercicio 2 \n");

        int x = calculator.ingresoX();
        System.out.println("El valor de X es: " + x);

        int y = calculator.ingresoY();
        System.out.println("El valor de Y es: " + y);

        int resultDiv = calculator.division(x,y);
        System.out.println("El resultado de la division es: " + resultDiv);

        */

        /** Ejercicio 3*/
        /*
        System.out.println("Ejercicio 3 \n");

        Jasmine flowerJasmine = new Jasmine();
        System.out.println(flowerJasmine.whatsYourName());
        Lotus flowerLotus = new Lotus();
        System.out.println(flowerLotus.whatsYourName());
        */
        /** Ejercicio 4*/

        System.out.println("Ejercicio 4 !");

        ///--------Alta de productos
        Producto p1 = new Producto("AQ32","Leche",Marca.Cindor,200,600);
        Producto p2 = new Producto("WV54","Galletitas",Marca.Bagley,60,500);
        Producto p3 = new Producto("HIA90", "Yogurt",Marca.Granix,80,600);
        Producto p4 = new Producto("DA24G", "Coca", Marca.Coca_Cola,100,400);
        Producto p5 = new Producto("L92D","Cafe",Marca.Nestle,540,600);
        Producto p6 = new Producto("LES99","Sprite",Marca.Coca_Cola,75,2000);
        Producto p7 = new Producto("QW43", "Cereales",Marca.Granix,45,365);
        Producto p8 = new Producto("ZXC123","Poste",Marca.Cindor,150,650);
        Producto p9 = new Producto("CFD452","Leche en Polvo",Marca.Nestle,6000,10);
        Producto p10 = new Producto("LQQ555","Fanta",Marca.Coca_Cola,60,100);

        Corralon corralon = new Corralon(); /** Creacion del corralon */

        corralon.agregarProducto(p1);
        corralon.agregarProducto(p2);
        corralon.agregarProducto(p3);
        corralon.agregarProducto(p4);
        corralon.agregarProducto(p5);

        System.out.println("Mostrando la lista de productos !!!");
        corralon.listarProductos();
/*
        System.out.println("-----------------------");
        corralon.eliminarProducto();

        System.out.println("Nueva lista");
        corralon.listarProductos();

        System.out.println("Buscando un producto");
        corralon.buscarProducto();
*/
        /** Cliente*/

        //-------------Alta de clientes
        Empresa empresa1 = new Empresa(0,"Pepe", "Loco", "14-05-1999",22345142,417857454,4001,21,true);
        Empresa empresa2 = new Empresa(1, "Ricardito", "Perez","20-03-2000",223656589,42514525,3009,30,true);
        ConsumidorFinal consu1 = new ConsumidorFinal(2,"Diego", "Lopez", "03-05-2010",221545547,21142544,false);
        ConsumidorFinal consu2 = new ConsumidorFinal(3,"Erika","Developer","10-10-2001",22584445,41052221,false);

        corralon.agregarCliente(empresa1);
        corralon.agregarCliente(empresa2);
        corralon.agregarCliente(consu1);
        corralon.agregarCliente(consu2);

        ///corralon.cargarCliente();
        ///corralon.mostrarListaClientes();


        /** Probando de comprar un producto */
        //int totalBruto = corralon.calcularTotalBruto();
        //System.out.println("Total bruto: " + totalBruto);

        /** Calculando el neto */
        int Totalneto  = corralon.calcularTotalNeto(empresa1);
        System.out.println("Total neto: " + Totalneto);


    }
}
