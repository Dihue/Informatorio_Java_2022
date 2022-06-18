package OOP;

public class EmployeePerDay extends Employee{
    // Atributos propios
    private int horasTrabajadas;
    private int valorPorHora;

    // Constructor
    public EmployeePerDay(int dni, String nombre, String apellido, int horasTrabajadas, int valorPorHora) {
        super(dni, nombre, apellido);
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    // Heredado del padre (obligatorio)
    @Override
    public int calcularSueldo() {
        return this.horasTrabajadas * this.valorPorHora;
    }
}
