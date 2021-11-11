package Clases;

import java.util.Calendar;

public abstract class Poliza {

  private int codigoPoliza;
  private Cliente cliente1;
  private int fecha;
  private int anioAprobacion;
  private Empleado empleadoRegistro;
  private double montoAsegurado;
  private int anioVencimiento;

  public Poliza(
    int codigoPoliza,
    Cliente cliente1,
    int fecha,
    int anioAprobacion,
    Empleado empleadoRegistro,
    double montoAsegurado,
    int anioVencimiento
  ) {
    super();
    this.codigoPoliza = codigoPoliza;
    this.cliente1 = cliente1;
    this.fecha = fecha;
    this.anioAprobacion = anioAprobacion;
    this.empleadoRegistro = empleadoRegistro;
    this.montoAsegurado = montoAsegurado;
    this.anioVencimiento = anioVencimiento;
  }

  public Poliza() {}

  public int getCodigoPoliza() {
    return codigoPoliza;
  }

  public void setCodigoPoliza(int codigoPoliza) {
    this.codigoPoliza = codigoPoliza;
  }

  public Cliente getCliente1() {
    return cliente1;
  }

  public void setCliente1(Cliente cliente1) {
    this.cliente1 = cliente1;
  }

  public int getFecha() {
    return fecha;
  }

  public void setFecha(int fecha) {
    this.fecha = fecha;
  }

  public int getAnioAprobacion() {
    return anioAprobacion;
  }

  public void setAnioAprobacion(int anioAprobacion) {
    this.anioAprobacion = anioAprobacion;
  }

  public Empleado getEmpleadoRegistro() {
    return empleadoRegistro;
  }

  public void setEmpleadoRegistro(Empleado empleadoRegistro) {
    this.empleadoRegistro = empleadoRegistro;
  }

  public double getMontoAsegurado() {
    return montoAsegurado;
  }

  public void setMontoAsegurado(double montoAsegurado) {
    this.montoAsegurado = montoAsegurado;
  }

  public int getAnioVencimiento() {
    return anioVencimiento;
  }

  public void setAnioVencimiento(int anioVencimiento) {
    this.anioVencimiento = anioVencimiento;
  }

  public void ObtenerCuotaMensual() {
    System.out.println(
      "Cuota Mensual" +
      (this.montoAsegurado / (this.anioVencimiento - this.anioAprobacion) * 12)
    );
  }

  public void montoPagado() {
    Calendar cal = Calendar.getInstance();
    System.out.println(
      "Monto Pagado" +
      (
        this.montoAsegurado /
        (cal.get(Calendar.YEAR) - this.anioAprobacion) *
        12
      )
    );
  }

  // metodo  abstracto (el que se sobre escribe)

  public abstract void obtenerCuotas();

  @Override
  public String toString() {
    return String.format(
      "%s %s %s %s %s %s %s",
      codigoPoliza,
      cliente1,
      fecha,
      anioAprobacion,
      empleadoRegistro,
      montoAsegurado,
      anioVencimiento
    );
  }
}
