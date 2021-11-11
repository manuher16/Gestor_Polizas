package Clases;

public class Cliente extends Persona {

  public Cliente() {
    // TODO Auto-generated constructor stub
  }

  public Cliente(
    int id,
    String nombres,
    String apellidos,
    String telefono,
    String email
  ) {
    // TODO Auto-generated constructor stub
    super(id, nombres, apellidos, telefono, email);
  }

  @Override
  public String toString() {
    return String.format("%s", super.toString());
  }
}
