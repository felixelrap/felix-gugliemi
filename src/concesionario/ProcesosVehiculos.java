
package concesionario;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;



public class ProcesosVehiculos implements valorVehiculos{
  private VehiculosParaVenta v;
  ArrayList<VehiculosParaVenta> vehiculo= new ArrayList<>();
  ArrayList<String> VehiculosVenta= new ArrayList<>();

  
 public  ProcesosVehiculos (){}
 /*agrega vehiculos en el concesionario*/
 public void addVPV(VehiculosParaVenta v){
     vehiculo.add(v);
 }
 /*agrega descripcion de vehiculos en el concesionario*/
 public void addB(VehiculosParaVenta v){
     VehiculosVenta.add(v.toString());
 }
 
 /*imprime la descripcion de vehiculos disponibles*/
 
 public void obtenerVehiculos(){
        for(int i =0; i<VehiculosVenta.size();i++){
           System.out.println( VehiculosVenta.get(i));
 }
 }
 
 /** devuelve el vehiculo mas costoso y el mas barato por impresion de pantalla*/
   public void VehiculoMasCostosoMenosCostoso(){
       VehiculosParaVenta vehiculoMasCaro= this.vehiculo.get(0);
       VehiculosParaVenta vehiculoMenosCaro=this.vehiculo.get(0);
   for(int i=0;i<vehiculo.size();i++){
       if(vehiculo.get(i).getVehiculo().getPrecio()>vehiculoMasCaro.getVehiculo().getPrecio()){
           vehiculoMasCaro=vehiculo.get(i);
       }
       if(vehiculo.get(i).getVehiculo().getPrecio()<vehiculoMenosCaro.getVehiculo().getPrecio()){
           vehiculoMenosCaro=vehiculo.get(i);
       }
   }
  System.out.println("Vehiculo màs caro: "+vehiculoMasCaro.getVehiculo().getMarca()+" "+ vehiculoMasCaro.getVehiculo().getModelo());
  System.out.println("Vehiculo màs barato: "+vehiculoMenosCaro.getVehiculo().getMarca()+" "+vehiculoMenosCaro.getVehiculo().getModelo());   
   }
   /**
    * compara la letra con  el modelo de vehiculo
    * @param V donde se encruentra el vehiculo
    * @param a la letra a comparar
    * @return una variable  boolean verdadera 
    */
   public boolean contieneLetraEnModelo(VehiculosParaVenta V, String a){
    boolean res=false;
    String modelo=V.getVehiculo().getModelo();
    modelo=modelo.toLowerCase();
    a=a.toLowerCase();
for(int i=0;i<modelo.length();i++){
        if(modelo.substring(i, i+1).equals(a)){
            res=true;
        }
    }
    return res;   
   }
 /**
  * busca la si el modelo contiene una letra y devuelve por pantalla cual es la letra, el modelo, la marca y el precio
  * @param a 
  */
   public void BusquedaPorLetra(String a){
            DecimalFormat formato= new DecimalFormat("###,###.##");
       try{ 
       Vehiculo VehiculoQueContiene=null;
       for( int i=0;i<this.vehiculo.size();i++){
         if(contieneLetraEnModelo(this.vehiculo.get(i),a)){
             VehiculoQueContiene=this.vehiculo.get(i).getVehiculo();
         }
       }
       System.out.println("Vehìculo que contiene en el modelo la letra '"+a+"': "+VehiculoQueContiene.getMarca()+" "+VehiculoQueContiene.getModelo()+" $"+formato.format(VehiculoQueContiene.getPrecio()));     
   }
       catch(Exception e){
       System.out.println(e.getMessage());
       
       }
           
       }
   public void OrdenarVehiculosDeMayorAMenor(){
      Collections.sort(this.vehiculo); 
   }
     public void mostrarVehiculosOrdenados(){
         System.out.println("Vehiculos ordenados por precio de mayor  a menor: ");
         for(int i=0;i< vehiculo.size();i++){
          System.out.println( this.vehiculo.get(i).getVehiculo().getMarca()+" "+ this.vehiculo.get(i).getVehiculo().getModelo());
          }
     }      
}

 
 

