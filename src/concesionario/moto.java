/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;


public class moto extends Vehiculo{
    private String Cilindrara;
    
    public moto (String marca, String modelo, float precio, String Cilindrada){
     super (marca, modelo, precio);
       this.Cilindrara=Cilindrada;
    }
     public String condicionAdicionalVehiculo(){
        return "Cilindrada: "+this.Cilindrara;
    }
   /* devuelve el formato descripcion solicitada
    */
     public String toString(){
    return super.toString()+this.condicionAdicionalVehiculo()+super.toString2();
}
  
     public double getPrecio(){
       return  super.getPrecio();
    }
}
