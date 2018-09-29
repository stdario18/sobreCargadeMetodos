
package sobrecargametodos;

public class persona {
    
    public void presentacion(){
        System.out.println("Hola mundo");
    }
    public void presentacion(String nombre){
        System.out.println("Mi nombre es "+nombre);
    }
    public void presentacion(String apellido, int edad){
        System.out.println("Mi apellido es "+apellido+" y tengo "+edad+" años");
    }
}
