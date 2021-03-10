package com.company;

import java.util.Scanner;

public class Pedidos {

    Scanner sc = new Scanner(System.in);

    private String fecha;
    private Cliente cliente;

    public Pedidos(){

    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "fecha='" + fecha + '\'' +
                ", cliente=" + cliente +
                '}';
    }

    ///-----------------------------------------------------------------------------------------------------------------


}
