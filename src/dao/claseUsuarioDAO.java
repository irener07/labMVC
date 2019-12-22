package dao;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Usuario;
/**
 * @author catas
 */

public class claseUsuarioDAO {
  
  
  public Usuario iniciarSesion(Usuario usuario){
      
  }
  
  
  public boolean restaurarContrasenia(String nombreUsuario){
      
  }
  
  
  public ArrayList<Usuario> cargarListaUsuarios(){
      
  }
  
  
  private boolean verificarContrasenia(String contraseniaNueva, String contraseniaVieja){
    if(!contraseniaNueva.equals(contraseniaVieja)){
      return true;
    }
    else{
      return false;  
    }
  public boolean cambiarContrasenia(String nombreUsuario, String contrasenia, String contraseniaNueva){
    
  }
  
  
  public boolean cambiarContrasenia(String nombreUsuario, String contraseniaVieja, String contraseniaNueva){
    if(verificarContrasenia(contraseniaNueva, contraseniaVieja) == true){
      usuario.setContrasenia(contraseniaNueva);  
      return true;
    } 
    else{
      return false;  
    }
  }
  
  
  public static void registrarUsuario(Usuario usuario){
  }
}    
