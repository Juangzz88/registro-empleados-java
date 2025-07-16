public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(getNombre());
    }
    public void aprobarPresupuesto() {
        System.out.println(getNombre() + " ha aprobado un presupuesto.");
    }
}

