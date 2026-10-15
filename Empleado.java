
 // Clase que representa a un empleado
public class Empleado {

    // Atributos del empleado.
    String nombre;
    String puesto;
    String departamento;
    double salario;

    // Constructor para asignar los datos del empleado.
    public Empleado(String nombre, String puesto,
                    String departamento, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.departamento = departamento;
        this.salario = salario;
    }

    // Metodo para mostrar la informacion del empleado.
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario mensual: $" + salario);
    }
}
