public class Cliente {
    private String nombre, apellido;
    public Cliente() {} 
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre; 
        this.apellido = apellido;
    }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido;}
}
