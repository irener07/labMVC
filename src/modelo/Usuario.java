package modelo;
/**
 * @author catas
 */

public class Usuario {
  private String nombre = "";
  private String contrasenia = "";
  
  public Usuario(String pNombre, String pContrasenia){
    setNombre(pNombre);
    setContrasenia(pContrasenia);
  }

  
  public Usuario(){
      
  }
  
  
  public String getNombre() {
    return nombre;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  
  public void setContrasenia(String pContrasenia) {
    this.contrasenia = pContrasenia;
  }
}