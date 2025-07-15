public class Empleado {
    // Atributos
    public String getNombre() {
        return nombre;
    }
    private String nombre;
    private int id;
    private double salario;

    // Constructor
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }

    // Getters y Setters (opcional si vas a manipular datos desde fuera)
}
