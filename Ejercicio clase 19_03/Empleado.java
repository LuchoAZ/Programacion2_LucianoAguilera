// Clase base abstracta: Empleado
public abstract class Empleado {
    private String nombre;
    private String apellido;
    private double sueldo;

    public Empleado(String nombre, String apellido, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    // Métodos getters y setters para los atributos
    // (omito su implementación por simplicidad)

    // Método abstracto para calcular el salario (debe ser implementado por las clases derivadas)
    public abstract double calcularSalario();
}