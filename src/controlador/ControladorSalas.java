package controlador;
import javax.swing.*;
import java.awt.event.*;
import vista.*;
import controlador.*;
import modelo.Sala;
import dao.*;
/**
 * @author irene
 */

public class ControladorSalas {
  public AgregarSala vista;
  public claseUsuarioDAO dao;
  public Sala modelo;
  
  public ControladorSalas(AgregarSala pVista, Sala pModelo){
    vista = pVista;
    modelo = pModelo;
    claseUsuarioDAO = new UsuarioDAOXML();
    
  }
}