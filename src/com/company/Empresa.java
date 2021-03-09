package com.company;

public class Empresa extends Cliente {

    private int cuit;
    private int condIVA;

    public Empresa(int id, String nombre, String apellido, String fechaNacimiento, long telefono, int dni,int cuit, int condIVA,boolean empresa) {
        super(id, nombre, apellido, fechaNacimiento, telefono, dni,empresa);
        this.cuit = cuit;
        this.condIVA = condIVA;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public int getCondIVA() {
        return condIVA;
    }

    public void setCondIVA(int condIVA) {
        this.condIVA = condIVA;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cuit=" + cuit +
                ", condIVA=" + condIVA +
                '}';
    }

    ///----------------------------------------------------------------








}
