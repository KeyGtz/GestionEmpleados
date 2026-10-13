
public class Principal {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(
            "Carlos Ramirez",
            "Contador",
            "Administracion",
            15000
        );

        Empleado empleado2 = new Empleado(
            "Maria Lopez",
            "Recursos Humanos",
            "Personal",
            18000
        );

        System.out.println("=== SISTEMA DE GESTION DE EMPLEADOS ===");
        System.out.println();

        empleado1.mostrarInformacion();

        System.out.println("------------------------------");

        empleado2.mostrarInformacion();
    }
}
