package aplicacion;

import controlador.ControladorUsuario;
import modelo.Usuario;
import vista.LoginForm;

/**
 * @author catas
 */

public class aplicacion {

  public static void main(String[] args) {
    LoginForm vista = new LoginForm();
    Usuario modelo = new Usuario();
    
    ControladorUsuario controladorUsuario = new ControladorUsuario(vista, modelo);
        
    controladorUsuario.vista.setVisible(true);
    controladorUsuario.vista.setLocationRelativeTo(null);
  }  
}