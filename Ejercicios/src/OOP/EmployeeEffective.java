package OOP;

public class EmployeeEffective extends Employee {
    // Atributos propios
    private int sueldo;
    private int antiguedad;

    // Constructor
    public EmployeeEffective(int dni, String nombre, String apellido, int sueldo, int antiguedad) {
        super(dni, nombre, apellido);
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    // Heredado del padre (obligatorio)
    @Override
    public int calcularSueldo() {
        return (this.sueldo + (this.antiguedad * 1000));
    }
}
