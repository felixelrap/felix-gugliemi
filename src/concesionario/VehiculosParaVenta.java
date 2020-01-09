/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;



/**
 *
 * @author felix
 */
public class VehiculosParaVenta implements Comparable<VehiculosParaVenta>{
  private moto Moto;
  private auto Auto;
private String ToString;
 private Vehiculo vehiculo;

  public  VehiculosParaVenta (moto Moto){
       this.Moto=Moto;  
       this.ToString=Moto.toString();
       this.vehiculo=Moto;
  }
     public  VehiculosParaVenta (auto Auto){
         this.Auto=Auto;
         this.ToString=Auto.toString();
         this.vehiculo=Auto;
     }
     
     public String toString(){
         return this.ToString;
     }
     
     public Vehiculo getVehiculo(){
         return this.vehiculo;
     }
    
   public int compareTo(VehiculosParaVenta  e){
        if(e.getVehiculo().getPrecio()<this.getVehiculo().getPrecio()){
            return -1;
        }else if(e.getVehiculo().getPrecio()<this.getVehiculo().getPrecio()){
            return 0;
        }else{
            return 1;
        }
    }
  
}
