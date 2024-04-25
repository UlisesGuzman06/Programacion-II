package Programacion.Ejercicio8_9_10.Ejercicio8;

public class Manager extends Employee {
    private String work_department;
    public Manager(String name, int age, double salary, String work_department) {
        super(name, age, salary);
        this.work_department = work_department;
    }
    @Override
    void work_capacity() {
        System.out.println("El gerente "+this.getName() +" esta organizando las actividades dentro del departamento "+
                this.work_department);
    }
    public String getWork_department() {
        return work_department;
    }
    public void setWork_department(String work_department) {
        this.work_department = work_department;
    }
}
