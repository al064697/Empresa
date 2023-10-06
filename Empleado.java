public class Empleado {

    private String nombre,apellido;
    private int ID;

    public Empleado() {}

    public Empleado(String nombre, String apellido, int ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }

    public String getNombre() { return nombre;}

    public String getApellido() { return apellido; }

    public int ID() { return ID; } 
    
    @Override
    public String toString(){ return "Cliente: " + nombre + apellido;}
}
