public class Tecnico extends Empleado {
    private String especialidad;

    public Tecnico(String nombre, int edad, double salario, String especialidad) {
        super(nombre, edad, salario);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad);
    }

    public void realizarMantenimiento() {
    }
}
