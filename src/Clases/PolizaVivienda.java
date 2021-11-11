package Clases;

public class PolizaVivienda extends Poliza {

  private String tipoBien;
  private double monto;
  private int numeroRegistro;
  private String direccion;

  public PolizaVivienda(
    int codigoPoliza,
    Cliente cliente1,
    int fecha,
    int anioAprobacion,
    Empleado empleadoRegistro,
    double montoAsegurado,
    int anioVencimiento,
    String tipoBien,
    double monto,
    int numeroRegistro,
    String direccion
  ) {
    super(
      codigoPoliza,
      cliente1,
      fecha,
      anioAprobacion,
      empleadoRegistro,
      montoAsegurado,
      anioVencimiento
    );
    this.tipoBien = tipoBien;
    this.monto = monto;
    this.numeroRegistro = numeroRegistro;
    this.direccion = direccion;
  }

  public PolizaVivienda() {}

  public String getTipoBien() {
    return tipoBien;
  }

  public void setTipoBien(String tipoBien) {
    this.tipoBien = tipoBien;
  }

  public double getMonto() {
    return monto;
  }

  public void setMonto(double monto) {
    this.monto = monto;
  }

  public int getNumeroRegistro() {
    return numeroRegistro;
  }

  public void setNumeroRegistro(int numeroRegistro) {
    this.numeroRegistro = numeroRegistro;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  @Override
  public String toString() {
    return String.format(
      "Tipo de Bien: %s\nMonto: %.2f\nNumero de Registro: %d\nDireccion: %s\n",
      tipoBien,
      monto,
      numeroRegistro,
      direccion
    );
  }

  @Override
  public void obtenerCuotas() {
    // TODO Auto-generated method stub

  }
}
