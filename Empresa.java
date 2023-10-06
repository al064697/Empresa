import java.util.ArrayList;

public class Empresa {

    private String nombre; 
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;
    
    public Empresa() {}

    public Empresa (String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<Empleado>();
        clientes = new ArrayList<Cliente>();
    }

    public void AgregarEmpleado(String nombre, String apellido) { 
        //empleados.add(nombre, apellido, ID);
        int ID = empleados.size() + 1;
        Empleado empleado = new Empleado(nombre, apellido, ID);
        empleados.add(empleado);
    }

    public void AgregarCliente(Cliente cliente) { clientes.add(cliente); }

    public String getNombre() {return nombre;}

}
