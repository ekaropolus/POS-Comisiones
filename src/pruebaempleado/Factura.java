package pruebaempleado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edvaldes
 */
public class Factura {
    
    
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precio;
    
    public Factura( String numeroPieza, String descripcionPieza, int cantidad, double precio)
    {
     this.numeroPieza = numeroPieza;
     this.descripcionPieza = descripcionPieza;
     this.cantidad = cantidad;
     this.precio = precio;
    }
 
    public void setnumeroPieza ( String numeroPieza ){  this.numeroPieza = numeroPieza; }
    public void setdescripcionPieza ( String descripcionPieza ){  this.descripcionPieza = descripcionPieza; }
    public void setcantidad ( int cantidad ){  this.cantidad = cantidad; }
    public void setprecio ( double precio ){  this.precio = precio; }
    
    public String getnumeroPieza (){ return this.numeroPieza; }
    public String getdescripcionPieza (){ return this.descripcionPieza; }
    public int getcantidad (){ return this.cantidad; }
    public double getprecio (){ return this.precio; }
    
    public double obtenerMontoFactura (){ 
        if ( this.cantidad < 0){ this.cantidad = 0;}
        if ( this.precio < 0){ this.precio = 0.0;}
        return this.cantidad * this.precio;
    } 
}
