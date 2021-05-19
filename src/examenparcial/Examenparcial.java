
package examenparcial;

/**
 *
 * @author Arely
 */
public class Examenparcial {
    
  private String nombre;
  private int cantidadUsuarios;
  private Integer tiempo;
  private String nivel;
  private int estrella;
  private int calidad;
   
   
  

    public Examenparcial(String nombre, int cantidadUsuarios, Integer tiempo, String nivel, int estrella) {
        this.nombre = nombre;
        this.cantidadUsuarios = cantidadUsuarios;
        this.tiempo = tiempo;
        this.nivel = nivel;
        this.estrella = estrella;
    }

    public int  calidad() {
      return cantidadUsuarios*tiempo*estrella;  
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    public void setCantidadUsuarios(int cantidadUsuarios) {
        this.cantidadUsuarios = cantidadUsuarios;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getEstrella() {
        return estrella;
    }

    public void setEstrella(int estrella) {
        this.estrella = estrella;
    }

    @Override
    public String toString() {
        return "Examenparcial{" + "nombre=" + nombre + ", cantidadUsuarios=" + cantidadUsuarios + ", tiempo=" + tiempo + ", nivel=" + nivel + ", estrella=" + estrella + '}';
    }

    

  
   

     
    
}
