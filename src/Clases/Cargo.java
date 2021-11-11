package Clases;

public class Cargo {

  private int id;
  private String descripcion;

  public Cargo() {
    // TODO Auto-generated constructor stub
  }

  public Cargo(int id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @Override
  public String toString() {
    return String.format("[id=%s, Descripcion=%s]",this.id,this.descripcion);
  }
}
