public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Laura", 40, 50000, "Recursos Humanos");
        Tecnico tecnico = new Tecnico("Carlos", 30, 30000, "Redes");

        System.out.println("== Gerente ==");
        gerente.mostrarInformacion();
        gerente.aprobarPresupuesto();

        System.out.println("\n== Técnico ==");
        tecnico.mostrarInformacion();
        tecnico.realizarMantenimiento();
    }
}

