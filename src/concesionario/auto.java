
package concesionario;


public class auto extends Vehiculo{
    private int puertas;
    
    public auto(String marca, String modelo, float precio, int puertas){
        super (marca, modelo, precio);
        this.puertas=puertas;
    }
   /* devueleve el elemento diferenciador entre distintos tipos de vehiculos*/ 
    public String condicionAdicionalVehiculo(){
        return "Puertas: "+this.puertas;
        
    }
    
    public String toString(){
    return super.toString()+this.condicionAdicionalVehiculo()+super.toString2();
}
            
    public double getPrecio(){
       return  super.getPrecio();
    }
    
}
