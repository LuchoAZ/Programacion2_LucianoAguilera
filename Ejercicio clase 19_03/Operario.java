// Clase Operario (hereda de Empleado)
public class Operario extends Empleado {
    // Atributos específicos de Operario (si los hubiera)
    // ...

    public Operario(String nombre, String apellido, double sueldo) {
        super(nombre, apellido, sueldo);
    }

    @Override
    public double calcularSalario() {
        // Lógica específica para calcular el salario de un operario
        // ...
        return sueldo; // Ejemplo: devuelve el sueldo tal cual
    }
}