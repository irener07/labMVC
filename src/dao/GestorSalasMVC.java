package dao;
import vista.*;
import controlador.*;
import modelo.*;
/**
 * @author irene
 */

public class GestorSalasMVC {
  public static void main(String[] args) {
    LoginForm vista = new LoginForm();
    Usuario modelo = new Usuario();
    
    ControladorUsuario controladorUsuario = new ControladorUsuario(vista, modelo);
        
    controladorUsuario.vista.setVisible(true);
    controladorUsuario.vista.setLocationRelativeTo(null);
  }
}