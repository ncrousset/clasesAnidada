import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa un ejemplo basico de Inner Classes
 *
 * Supongamos que estamos creando un programa para modelar una tienda
 * de productos electrónicos con empleados y productos:
 */
public class TiendaElectronica {
    private String nombre;
    private List<Empleado> empleados;

    public TiendaElectronica(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void contratarEmpleado(String nombre, String cargo) {
        Empleado empleado = new Empleado(nombre, cargo);
        empleados.add(empleado);
    }

    public void mostrarEmpleados(){
        for(Empleado empleado: empleados) {
            System.out.println("Nombre " + empleado.getNombre() + ", Cargo " + empleado.getCargo());
        }
    }

    private class Empleado {
        private String nombre;
        private String cargo;

        public Empleado(String nombre, String cargo) {
            this.nombre = nombre;
            this.cargo = cargo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCargo() {
            return cargo;
        }
    }

    public static void main(String[] args) {
        TiendaElectronica tienda = new TiendaElectronica("ElectoTech");
        tienda.contratarEmpleado("Juan Perez", "Vendedor");
        tienda.contratarEmpleado("Maria Garcia", "Gerente");
        tienda.mostrarEmpleados();
    }
}
