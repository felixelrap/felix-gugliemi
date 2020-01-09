/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.text.DecimalFormat;


/**
 *
 * @author felix
 */
public  abstract class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;
 DecimalFormat formato= new DecimalFormat("###,###.##");
    
    public Vehiculo ( String marca, String modelo, double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }
    
    public double getPrecio(){
        return this.precio;
    }
  public String toString(){
      return "Marca: "+ this.marca+" / / "+" Modelo: "+this.modelo+" / / ";
  }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
  
  public abstract String  condicionAdicionalVehiculo();
  
   
   public String toString2(){
    return " / / "+" Precio: "+"$"+formato.format(this.precio);
   }
   
 
}
