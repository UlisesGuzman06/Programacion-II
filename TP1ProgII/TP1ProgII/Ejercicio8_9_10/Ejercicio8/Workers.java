package Programacion.Ejercicio8_9_10.Ejercicio8;

public class Workers extends Employee {
    private String work_area;
    public Workers(String name, int age, double salary, String work_area) {
        super(name, age, salary);
        this.work_area = work_area;
    }
    @Override
    void work_capacity() {
        System.out.println("El trabajador "+this.getName()+" esta produciendo en el area de trabajo "+this.work_area);
    }
    public String getWork_area() {
        return work_area;
    }
    public void setWork_area(String work_area) {
        this.work_area = work_area;
    }
}
