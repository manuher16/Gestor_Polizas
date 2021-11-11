import Clases.Cargo;
import Clases.Cliente;
import Clases.Empleado;
import Clases.PolizaVehiculo;
import Clases.PolizaVivienda;
import Gestion.GestionPoliza;

import java.util.Date;

public class Principal {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Cliente cli1 = new Cliente(
      1,
      "Jose Miguel",
      "Lopez Flores",
      "12312312",
      "migue@gmail.com"
    );
    Cliente cli2 = new Cliente(
      2,
      "Maria Fernanda",
      "Dominguez Flores",
      "12312312",
      "maria@gmail.com"
    );

    Cargo cargo1 = new Cargo(1, "Cajero");
    Cargo cargo2 = new Cargo(2, "Gerente");

    Empleado empleado1 = new Empleado(
      1,
      "Luis Fernado",
      "Hernandez HerreRA	",
      "12312312",
      "fer@gmail.com",
      cargo1
    );
    Empleado empleado2 = new Empleado(
      2,
      "Luisa Carolina",
      "Lopez Raudales",
      "12312312",
      "LU@gmail.com",
      cargo2
    );
    Date date = new Date();

    PolizaVehiculo pove1 = new PolizaVehiculo(
      1,
      cli1,
      date.getDate(),
      2020,
      empleado1,
      100000.22,
      0,
      "Toyota",
      2,
      "DDD3432",
      2021
    );
    PolizaVehiculo pove2 = new PolizaVehiculo(
      2,
      cli2,
      date.getDate(),
      2015,
      empleado1,
      100000.22,
      0,
      "Toyota",
      4,
      "DFR3432",
      2021
    );
    PolizaVivienda povi1 = new PolizaVivienda(
      3,
      cli2,
      date.getDate(),
      2020,
      empleado1,
      100000.22,
      2024,
      "Casa",
      1002223.00,
      123123,
      "Cualquier lugar"
    );
    GestionPoliza gp=new GestionPoliza();
    gp.addPove(pove1);
    gp.addPove(pove2);
    gp.addPovi(povi1);
    gp.printPolizas();
  }
}
