/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.ArrayList;

/**
 * 
}
 * @author felix
 */
public class Concesionario {   
     
  
    public static void main(String[] args) {
          
VehiculosParaVenta a=  new VehiculosParaVenta(new auto("Peugeot","206",200000,4));
VehiculosParaVenta b=  new VehiculosParaVenta(new moto("Honda","Titan",60000, "125c"));
VehiculosParaVenta c=  new VehiculosParaVenta(new auto("Peugeot","208",250000,5));
VehiculosParaVenta d=  new VehiculosParaVenta(new moto("Yamaha","YBR",161001/2, "125c")); 
    ProcesosVehiculos accionador= new ProcesosVehiculos();
    accionador.addVPV(a);
    accionador.addB(a);
    accionador.addVPV(b);
    accionador.addB(b);
    accionador.addB(c);
    accionador.addVPV(c);
    accionador.addVPV(d);
    accionador.addB(d);
    accionador.obtenerVehiculos();
     System.out.println("------------------------------------------------------------");
     System.out.println("------------------------------------------------------------");
    accionador.VehiculoMasCostosoMenosCostoso();
    accionador.BusquedaPorLetra("Y");
     System.out.println("------------------------------------------------------------");
     System.out.println("------------------------------------------------------------");
    accionador.OrdenarVehiculosDeMayorAMenor();
    accionador.mostrarVehiculosOrdenados();
    
   }
    







    
   
    
    
}
