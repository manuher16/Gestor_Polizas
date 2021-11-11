package Clases;

public class Persona {

  private int id;
  private String nombres;
  private String apellidos;
  private String telefono;
  private String email;
  private Date createdAt;

  public Persona() {
    // TODO Auto-generated constructor stub
  }

  public Persona(
    int id,
    String nombres,
    String apellidos,
    String telefono,
    String email
  ) {
    // TODO Auto-generated constructor stub
    this.id = id;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.email = email;
    this.createdAt = new Date();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String toString() {
    return String.format(
      "[id=%s,nombre=%s, apllidos=%s telefono=%s email=%s creado=%s ",
      this.id,
      this.nombres,
      this.apellidos,
      this.telefono,
      this.email,
      this.createdAt
    );
  }
}
