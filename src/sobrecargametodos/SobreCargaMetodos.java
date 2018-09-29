
package sobrecargametodos;

public class SobreCargaMetodos {

    public static void main(String[] args) {
       persona objeto = new persona();
       
       objeto.presentacion();
       objeto.presentacion("Dario");
       objeto.presentacion("Bernal", 33);
    }
    
}
