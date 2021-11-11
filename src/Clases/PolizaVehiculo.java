package Clases;

public class PolizaVehiculo extends Poliza {

  private String marca;
  private int modelo;
  private String placa;
  private int ano;

  public PolizaVehiculo(
    int codigoPoliza,
    Cliente cliente1,
    int fecha,
    int anioAprobacion,
    Empleado empleadoRegistro,
    double montoAsegurado,
    int anioVencimiento,
    String marca,
    int modelo,
    String placa,
    int ano
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
    this.marca = marca;
    this.modelo = modelo;
    this.placa = placa;
    this.ano = ano;
    // TODO Auto-generated constructor stub
  }

  public PolizaVehiculo() {
    // TODO Auto-generated constructor stub
  }



public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getModelo() {
    return modelo;
  }

  public void setModelo(int modelo) {
    this.modelo = modelo;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  @Override
  public String toString() {
    return String.format(
      "%s\nMarca: %s\nModelo: %d\nPlaca: %s\nAño: %s\n",
      super.toString(),
      marca,
      modelo,
      placa,
      ano
    );
  }

  @Override
  public void obtenerCuotas() {
    // TODO Auto-generated method stub

  }
}
