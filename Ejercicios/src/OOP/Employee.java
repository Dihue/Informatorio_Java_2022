package OOP;
// Para definir una clase abstracta (abstract)
public abstract class Employee {
    // Atributos
    // Encapsulamiento: uso del privado(private)
    private int dni;
    private String nombre;
    private String apellido;

    // Implementar el método para todos los hijos
    public abstract int calcularSueldo();

    // Constructor para pasarle valores
    public Employee(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Sobre escritura del método to String
    @Override
    public String toString() {
        return "DNI= " + dni +
                "; Nombre= " + nombre +
                "; Apellido= " + apellido;
    }
}
