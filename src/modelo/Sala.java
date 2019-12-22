package modelo;
/**
 * @author catas
 */

public class Sala {
  private String identificador = "";
  private String ubicacion = "";
  private int capacidad = 0;
  private String estado = "";
  private String recursosAdicionales = "";
  private String solicitante = "";
  private int calificacion = 100;

  public Sala(String pIdentificador, String pUbicacion, int pCapacidad) {
    setIdentificador(pIdentificador);
    setUbicacion(pUbicacion);
    setCapacidad(pCapacidad);
  }
  
  
  public Sala() {
  }

   
  public String getIdentificador() {
    return identificador;
  }

  
  public void setIdentificador(String pIdentificador) {
    this.identificador = pIdentificador;
  }

  
  public String getUbicacion() {
    return ubicacion;
  }


  public void setUbicacion(String pUbicacion) {
    this.ubicacion = pUbicacion;
  }

    
  public int getCapacidad() {
    return capacidad;
  }

  
  public void setCapacidad(int pCapacidad) {
    this.capacidad = pCapacidad;
  }

  
  public String isEstado() {
    return estado;
  }

  
  public void setEstado(String pEstado) {
    this.estado = pEstado;
  }

  
  public String getRecursosAdicionales() {
    return recursosAdicionales;
  }

  
  public void setRecursosAdicionales(String pRecursosAdicionales) {
    this.recursosAdicionales = pRecursosAdicionales;
  }

  
  public String getSolicitante() {
    return solicitante;
  }

  
  public void setSolicitante(String pSolicitante) {
    this.solicitante = pSolicitante;
  }
  
  
  public int getCalificacion() {
    return calificacion;
  }

  
  public void setSolicitante(int pCalificacion) {
    this.calificacion = pCalificacion;
  }
}