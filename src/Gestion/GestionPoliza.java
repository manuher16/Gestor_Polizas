package Gestion;

import Clases.PolizaVehiculo;
import Clases.PolizaVivienda;
import java.util.LinkedList;

public class GestionPoliza {

  private LinkedList<PolizaVehiculo> pove = new LinkedList<PolizaVehiculo>();
  private LinkedList<PolizaVivienda> povi = new LinkedList<PolizaVivienda>();

  public GestionPoliza() {}

  /**
   * @return
   * @pararm PolizaVehiculo que va a ser agregada
   */
  public void addPove(PolizaVehiculo pove) {
    this.pove.add(pove);
  }

  /**
   * @return
   * @pararm PolizaVivienda que va a ser agregada
   */
  public void addPovi(PolizaVivienda povi) {
    this.povi.add(povi);
  }

  /**
   * @pararm PolizaVehiculo que va a ser eliminada, recibe el numero de poliza
   */
  public void removePove(int index) {
    this.pove.remove(index);
  }

  /**
	 * @pararm PolizaVivienda que va a ser eliminada, recibe el numero de poliza
	
	 */
  public void removePovi(PolizaVivienda povi) {
    this.povi.remove(povi);
  }

  /**
	 * @pararm PolizaVehiculo  recibe el numero de poliza que se solicita

	 */
  public PolizaVivienda getPovi(int index) {
    return this.povi.get(index);
  }

  /**
	 * @pararm PolizaVivienda  recibe el numero de poliza que se solicita

	 */
  public PolizaVehiculo getPove(int index) {
    return this.pove.get(index);
  }

  /**
   * @pararm PolizaVehiculo  recibe el numero de poliza que se edita
   */
  public void editPove(PolizaVehiculo pove, int index) {
    this.pove.set(index, pove);
  }

  /**
   * @pararm PolizaVivienda  recibe el numero de poliza que se edita
   */
  public void editPovi(PolizaVivienda povi, int index) {
    this.povi.set(index, povi);
  }

  /**
   * @description imprime todos polizas vehiculos
   */
  public void printPove() {
    for (int i = 0; i < pove.size(); i++) {
      System.out.println(pove.get(i));
    }
  }

  /**
   * @description imprime todos polizas viviendas
   */
  public void printPovi() {
    for (int i = 0; i < povi.size(); i++) {
      System.out.println(povi.get(i));
    }
  }

  /**
   * @description imprime todos polizas con su debida informacion
   */
  public void printPolizas() {
    for (int i = 0; i < pove.size(); i++) {
      System.out.println(
        "------------------------------------------------------------------------------------------------------"
      );
      System.out.println("========Informacion Cliente=======");
      System.out.println(pove.get(i).getCliente1().toString());
      System.out.println("========Informacion Empleado=======");

      System.out.println(pove.get(i).getEmpleadoRegistro().toString());
      System.out.println("========Fecha creacion Cliente=======");

      System.out.println(pove.get(i).getCliente1().getCreatedAt());
      System.out.println("========Poliza=======");

      System.out.println(pove.get(i).toString());
      System.out.println("========Monto Asegurado=======");

      System.out.println(pove.get(i).getMontoAsegurado());
      System.out.println("========Cuota mensusal=======");

      pove.get(i).ObtenerCuotaMensual();
      System.out.println("========Monto Pagado=======");

      pove.get(i).montoPagado();
    }
    for (int i = 0; i < povi.size(); i++) {
      System.out.println("========Informacion Cliente=======");
      System.out.println(povi.get(i).getCliente1().toString());
      System.out.println("========Informacion Empleado=======");
      System.out.println(povi.get(i).getEmpleadoRegistro().toString());
      System.out.println("========Fecha creacion Cliente=======");
      System.out.println(povi.get(i).getCliente1().getCreatedAt());
      System.out.println("========Poliza=======");

      System.out.println(povi.get(i).toString());
      System.out.println("========Monto Asegurado=======");
      System.out.println(povi.get(i).getMontoAsegurado());
      System.out.println("========Cuota mensusal=======");
      povi.get(i).ObtenerCuotaMensual();
      System.out.println("========Monto Pagado=======");
      povi.get(i).montoPagado();
    }
  }
}
