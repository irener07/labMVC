package controlador;
import javax.swing.*;
import java.awt.event.*;
import modelo.*;
import vista.*;
import dao.*;
/**
 * @author catas
 */

public class ControladorUsuario implements ActionListener{
  public LoginForm vista;
  public claseUsuarioDAO dao;
  public Usuario modelo;
  
  public ControladorUsuario(LoginForm pVista, Usuario pModelo){
    vista = pVista;
    modelo = pModelo;
    claseUsuarioDAO dao = new UsuarioDAOXML();
    
    this.vista.btIniciarLogin.addActionListener(this);
    this.vista.btCancelarLogin.addActionListener(this);
  }
  
  
  public void actionPerformed(ActionEvent e){
    switch(e.getActionCommand()){
      case "Iniciar logIn":
        logIn();
        break;
      case "Cancelar logIn":
        cerrarVentanaLogin();
        break;
      default:
        break;  
    }  
  }
  
  
  public void logIn(){
    if(vista.logInDatosCorrectos() == true){
      String nombreUsuario = vista.txtNombreUsuario.getText();
      String contrasenia = vista.txtContrasenia.getText();
      
      modelo = new Usuario(nombreUsuario, contrasenia);
      Usuario usuarioActual = dao.iniciarSesion(modelo);
      
      if(usuarioActual != null){
        vista.setVisible(false);
        //dependiendo del tipo de usuario se puede abrir una vista diferente
        JOptionPane.showMessageDialog(vista, "Bienvenido: " + modelo.getNombre());
        vista.setVisible(true);
      }
      else{
        JOptionPane.showMessageDialog(vista, "Usuario indicado no existe");
      }
    }
    else{
      JOptionPane.showMessageDialog(vista, "Todos los datos son requeridos");
    }
  }
  
  
  public void cerrarVentanaLogin(){
    vista.cancelarInicioSesion();
  }
}