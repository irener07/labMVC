package controlador;
import javax.swing.*;
import java.awt.event.*;
import vista.*;
import controlador.*;
import modelo.Sala;
import dao.*;
import modelo.Usuario;
/**
 * @author irene
 */

public class ControladorSala {
  public AgregarSala vista;
  public RegistroSala dao;
  public Sala modelo;
  
  public ControladorSala(AgregarSala pVista, Sala pModelo){
    vista = pVista;
    modelo = pModelo;
    RegistroSala dao= new RegistroSala();
    
    this.vista.btAgregarSala.addActionListener(this);
  }
  
  
  public void actionPerformed(ActionEvent e){
    if(vista.agregarDatosCorrectos() == true){
      String identificadorSala = vista.txtIdentificador.getText();
      String ubicacionSala = vista.txtUbicacion.getText();
      int capacidadSala = Integer.parseInt(vista.txtCapacidad.getText());
      
      modelo = new Sala(identificadorSala, ubicacionSala,capacidadSala);
      Usuario usuarioActual = dao.ingresarSala(modelo);       
    }
    else{
        JOptionPane.showMessageDialog(vista, "Revise los datos ingresados");
    }
  }
  public void cerrarVentanaAgregarSala(){
      vista.cancelarAgregarSala();
  }
  
}