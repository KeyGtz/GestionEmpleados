
public class Empleado {

    String nombre;
    String puesto;
    String departamento;
    double salario;

    public Empleado(String nombre, String puesto, String departamento, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario mensual: $" + salario);
    }
}
