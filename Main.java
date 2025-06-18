import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.print("¿Cuántos empleados desea registrar?: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmpleado " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Limpia el buffer

            // Se crea y agrega el empleado
            Empleado emp = new Empleado(nombre, id, salario);
            empleados.add(emp);
        }

        System.out.println("\n--- Lista de Empleados Registrados ---");
        for (Empleado e : empleados) {
            e.mostrarInformacion();
            System.out.println("-------------------------");
        }
    }
}