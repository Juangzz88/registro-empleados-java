public class Empleado {
    // Atributos
    private String nombre;
    private int id;
    private double salario;

    // Constructor
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    // Método para mostrar la información
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}