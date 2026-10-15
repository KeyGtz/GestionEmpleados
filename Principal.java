//Clase principal que ejecuta el programa
public class Principal {

    public static void main(String[] args) {

        // Creacion del primer objeto.
        Empleado empleado1 = new Empleado(
            "Carlos Ramirez",
            "Contador",
            "Administracion",
            15000
        );

        // Creacion del segundo objeto.
        Empleado empleado2 = new Empleado(
            "Maria Lopez",
            "Recursos Humanos",
            "Personal",
            18000
        );

        // Creacion del tercer objeto.
        Empleado empleado3 = new Empleado(
            "Juan Perez",
            "Limpieza",
            "Mantenimiento",
            12000
        );

        // Titulo del programa.
        System.out.println("=== SISTEMA DE GESTION DE EMPLEADOS ===");
        System.out.println();

        // Mostrar la informacion de cada empleado.
        System.out.println("EMPLEADO 1");
        empleado1.mostrarInformacion();

        System.out.println("------------------------------");

        System.out.println("EMPLEADO 2");
        empleado2.mostrarInformacion();

        System.out.println("------------------------------");

        System.out.println("EMPLEADO 3");
        empleado3.mostrarInformacion();
    }
}
