
package examenparcial;

/**
 *
 * @author Arely
 */
public class Examenparcial {
     private static String nombre;
  private static int cantidadUsuarios;
  private static Integer tiempo;
  private static String nivel;
  private static int estrella;

    public Examenparcial(String nombre, int cantidadUsuarios, int tiempo, String nivel, int estrella) {
        Examenparcial.nombre = nombre;
        Examenparcial.cantidadUsuarios = cantidadUsuarios;
        Examenparcial.tiempo = tiempo;
        Examenparcial.nivel = nivel;
        Examenparcial.estrella = estrella;
    }

    public static int calidad(){
        return cantidadUsuarios*tiempo*estrella;
    }
     public static void main(String[] args) {
       Examenparcial exa = new Examenparcial("Zoom" ,30,5,"libre", 5 );
        System.out.println(calidad());
    }
    
}
