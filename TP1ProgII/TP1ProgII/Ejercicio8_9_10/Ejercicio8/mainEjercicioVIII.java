package Programacion.Ejercicio8_9_10.Ejercicio8;

public class mainEjercicioVIII {
    public static void main(String[] args) {
        Manager gerente1=new Manager("Santi",30,2000,"Recursos Humanos");
        Workers trabajador1=new Workers("Jose",28,1500,"Alimentacion");

        System.out.println("El gerente "+ gerente1.getName()+" tiene "+gerente1.getAge()+
                " años, y trabaja en el departamento de "+gerente1.getWork_department()+
                ", su salario es "+gerente1.getSalary());

        System.out.println("El trabajador "+ trabajador1.getName()+" tiene "+trabajador1.getAge()+
                " años, y produce en el area de "+trabajador1.getWork_area()+
                ", su salario es "+trabajador1.getSalary());


        gerente1.work_capacity();
        trabajador1.work_capacity();

    }
}
