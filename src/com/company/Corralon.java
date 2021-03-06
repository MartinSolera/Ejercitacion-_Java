package com.company;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Corralon {
    Scanner sc = new Scanner(System.in);

    //private HashSet<Producto> listaProductos;
    private Set<Producto> listaProductos = new HashSet<>();
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    private static int id = 3;

    public Corralon(){

    }

   ///--------------------------------------------------------
    public void agregarProducto(Producto p){
        listaProductos.add(p);
    }

    public void mostrarProducto(Producto p){
        System.out.println("Codigo: " + p.getCodigo() + " Nombre:" + p.getNombre() + " Marca: " + p.getMarca() + " Precio unitario: " + p.getPrecioUnitario() + " Stock: " + p.getStock());
    }

    public void listarProductos(){
        for(Producto p : listaProductos){
            mostrarProducto(p);
        }
    }

    public void eliminarProducto(){
        boolean encontrado = false;
        System.out.println("Ingrese el codigo del producto que quiere eliminar");
        String codigo = sc.nextLine();

        System.out.println("El codigo ingresado es: " + codigo);

        for(Producto p : listaProductos){
            if(p.getCodigo().equals(codigo)){
                listaProductos.remove(p);
                System.out.println("Se ha eliminado este producto");
                encontrado = true;
            }
        }
        if (encontrado == false){
            System.out.println("No se ha encontrado el codigo ingresado");
        }

    }

    public boolean buscarProducto(){
        boolean encontrado = false;
        System.out.println("Ingrese el codigo del producto que quiere buscar");
        String codigo = sc.nextLine();

        System.out.println("El codigo ingresado es: " + codigo);

        for(Producto p : listaProductos){
            if(p.getCodigo().equals(codigo)){
                listaProductos.remove(p);
                System.out.println("Se ha encontrado el producto");
                mostrarProducto(p);

                encontrado = true;
            }
        }
        if(encontrado == false){
            System.out.println("No se ha encontrado el codigo ingresado");
        }

        return encontrado;
    }

    public int idAutoincremental(){
        id = id + 1;
        return id;
    }

    public void cargarCliente()
    {
        int continuar = 1;
        while(continuar == 1)
        {
                int id = idAutoincremental();
                System.out.println("Ingrese los datos del nuevo cliente");
                System.out.println("Nombre");
                String nombre = sc.nextLine();
                System.out.println("Apellido");
                String apellido = sc.nextLine();
                System.out.println("Fecha nacimiento");
                String fechaNacimiento = sc.nextLine();
                System.out.println("Telefono");
                long telefono = sc.nextLong();
                System.out.println("DNI");
                int dni = sc.nextInt();

                System.out.println("Es un consumidor final | 1- Si , 2- No");
                int option = sc.nextInt();

                if(option == 1){
                    ConsumidorFinal consuFinal = new ConsumidorFinal(id,nombre,apellido,fechaNacimiento,telefono,dni,false);
                    listaClientes.add(consuFinal);
                }
                else if(option == 2){

                    System.out.println("Entonces continue ingresando estos datos...");
                    System.out.println("Cuit");
                    int cuit = sc.nextInt();
                    System.out.println("Condicion del IVA");
                    int condIVA = sc.nextInt();


                    Empresa emp = new Empresa(id,nombre,fechaNacimiento,fechaNacimiento,telefono,dni,cuit,condIVA,true);
                    listaClientes.add(emp);
                }

                System.out.println("Desea continuar ingresando clientes ? s/n");
                continuar = sc.nextInt();
        }
    }

    public void mostrarConsFinal(Cliente c){
        System.out.println("Id: " + c.getId() + " Nombre: " + c.getNombre() + " Apellido: " + c.getApellido() + " Fecha de nacimiento: " + c.getFechaNacimiento() + " Telefono: " + c.getTelefono() + " DNI: " + c.getDni());
    }

    public void mostrarEmpresa(Cliente c){
        System.out.println("Id: " + c.getId() + " Nombre: " + c.getNombre() + " Apellido: " + c.getApellido() + " Fecha de nacimiento: " + c.getFechaNacimiento()
                + " Telefono: " + c.getTelefono() + "DNI: " + c.getDni());
    }

/** Aca estoy intentando de poder diferenciar si es empresa con un boleano, pero no logro separar en caso de que sea empresa para que muestre los valores de cuil y conIVA*/

    public void mostrarListaClientes(){
        for(int i=0;i<listaClientes.size();i++){
            if(listaClientes.get(i).isEmpresa() == true){
                mostrarEmpresa(listaClientes.get(i));
            }
            else{
                mostrarConsFinal(listaClientes.get(i));
            }
        }
    }

    public void agregarCliente(Cliente c){
        listaClientes.add(c);
    }

    public Producto ordenProducto(){ ///Indica que producto quiere
        System.out.println("Ingrese el codigo del producto que quiere ordenar");
        String codigo = sc.nextLine();
        Producto encontrado = null;

        for(Producto p : listaProductos){
            if(p.getCodigo().equals(codigo)){
                mostrarProducto(p);

                encontrado = p;
                break;
            }
        }
        if(encontrado == null){
            System.out.println("No se ha encontrado el codigo ingresado");
        }

        return encontrado;
    }

    public int ordenarCantidad(){
        int cantidad = 0;
        if(ordenProducto() != null){
            System.out.println("Ingrese la cantidad que requiere de este producto");
            cantidad = sc.nextInt();
        }
        else{
            System.out.println("No tenemos ningun producto con esta cantidad");
        }
        return cantidad;
    }

    public int calcularTotalBruto(){
        Producto p = ordenProducto();
        int cantidad =0;
        int total =0;

        if(p != null){
            cantidad = ordenarCantidad();
            total = 0;
            if(cantidad != 0){
                total = (int) (p.getPrecioUnitario() * cantidad);
            }
            else{
                System.out.println("No tenemos stock disponible");
            }
        }
        return total;
    }

    ///Calcular el total aplicando descuentos
    public int calcularTotalNeto(Cliente c){
        int bruto = calcularTotalBruto();
        int neto =0;
        if(c instanceof Empresa){
            System.out.println("Se aplic?? un 10% de descuento, por ser empresa");
            int descuento = ((10 * bruto) / 100);
            neto = bruto - descuento;
        }
        else{
            System.out.println("Se aplic?? un 15% de descuento, por ser consumidor final");
            neto = ((15 * bruto) / 100);
        }
        return neto;
    }
}


