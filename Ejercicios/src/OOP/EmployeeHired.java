package OOP;

public class EmployeeHired extends Employee{
    // Atributo proio
    private int valorContrado;

    // Constructor
    public EmployeeHired(int dni, String nombre, String apellido, int valorContrado) {
        super(dni, nombre, apellido);
        this.valorContrado = valorContrado;
    }

    @Override
    public int calcularSueldo() {
        return this.valorContrado;
    }
}
