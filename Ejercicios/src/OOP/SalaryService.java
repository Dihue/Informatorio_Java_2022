package OOP;

public class SalaryService {
    // Punto de acceso para trabajar con Employee
    public static void main(String[] args) {
        // Variable del tipo Empleado para general la creación de un objeto
        Employee emp1 = new EmployeeEffective(1234, "Homero", "Simpson", 40000, 5);
        Employee emp2 = new EmployeePerDay(2345, "Lisa", "Simpson", 36, 250);
        Employee emp3 = new EmployeeHired(2323, "Bart", "Simpson", 25000);

        System.out.println(emp1.toString());
        System.out.println(emp1.calcularSueldo());
        System.out.println(emp2.toString());
        System.out.println(emp2.calcularSueldo());
        System.out.println(emp3.toString());
        System.out.println(emp3.calcularSueldo());
    }
}
