package Clases;

public class Empleado extends Persona {

  private Date fechaNombramiento;
  private Cargo cargo;

  public Empleado() {
    // TODO Auto-generated constructor stub
    super();
  }

  public Empleado(
    int id,
    String nombres,
    String apellidos,
    String telefono,
    String email,
    Cargo cargo
  ) {
    // TODO Auto-generated constructor stub
    super(id, nombres, apellidos, telefono, email);
    this.fechaNombramiento = new Date();

    this.cargo = cargo;
  }

  public Date getFechaNombramiento() {
    return fechaNombramiento;
  }

  public void setFechaNombramiento(Date fechaNombramiento) {
    this.fechaNombramiento = fechaNombramiento;
  }

  public Cargo getCargo() {
    return cargo;
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  @Override
  public String toString() {
    return String.format(
      "[Empleado=%s, fecha nombramiento=%s, cargo=%s]",
      super.toString(),
      fechaNombramiento,
      cargo
    );
  }
}
