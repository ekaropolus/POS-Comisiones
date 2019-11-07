/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaempleado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edvaldes
 */
public class PruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Factura> productos = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        //Obtenemos el nombre del empleado
        System.out.println("\nBuenas tardes, ¿cual es el nombre y apellido del vendedor:");
        String nombre = input.nextLine();
        String apellido = input.nextLine();
        double salario = 200.00;
        //Instancia del vendedor
        Empleado vendedor = new Empleado(nombre, apellido, salario);//salario base $200

        int numero = 1; //numero de producto default
        //ciclo de obtención de los valores de los productos
        while (numero != 0) {
            System.out.println("\nIntroduzca el número de producto y la cantidad:");
            System.out.println("\n( presione 0 para salir )");
            numero = input.nextInt(); //numero del producto
            if (numero == 0) {
                break;
            }
            int cantidad = input.nextInt(); //cantidad del producto3

            double precio = 0; //precio del producto
            //control para llenar el precio del producto
            switch (Integer.toString(numero)) {
                case "1":
                    precio = 239.99;
                    break;
                case "2":
                    precio = 129.75;
                    break;
                case "3":
                    precio = 99.95;
                    break;
                case "4":
                    precio = 350.89;
                    break;
                case "5":
                    precio = 0.0;
                    break;
                default:
                    precio = 0.0;
                    break;
            }

            // Creamos Instancia de los productos
            productos.add(new Factura(Integer.toString(numero), "Producto " + Integer.toString(numero), cantidad, precio));
        }
        //ciclo de impresión de los productos
        productos.forEach(producto -> {
            System.out.print("item: " + producto.getnumeroPieza()
                    + " Descipcción: " + producto.getdescripcionPieza()
                    + " Cantidad: " + producto.getcantidad()
                    + " Precio: " + producto.getprecio()
                    + " Total: " + producto.obtenerMontoFactura()
                    + "\n");

            //Actualizamos el salario del vendedor
            vendedor.setSalary(vendedor.getSalary() + (producto.obtenerMontoFactura() * 0.09));
        });

        //imprimimos la información del empleado
        System.out.print("Vendedor: " + vendedor.getName() + " " + vendedor.getLastName() + ":\n" + "Salario semanal: " + vendedor.getSalary() + "\n");

    }
}
