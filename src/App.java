import models.Person;
import controllers.PersonController;
public class App {
    public static void main(String[] args) throws Exception {
        PersonController orden = new PersonController();
        Person [] personas = {
            new Person ("Juan",25, new int[] {10,15,20}),
            new Person ("Ana",19, new int[] {15,15,20}),
            new Person ("Carlos", 30, new int[] {10,10,10}),
            new Person ("Maria",22, new int[] {20,15,20}),
            new Person ("Diego",15, new int[] {20,10,20})
        };
        System.out.println("==== Personas sin Ordenar ====");
        orden.mostrarArreglo(personas);
        System.out.println("==== Personas Ordenadas Por Edad====");
        orden.sortPersonByAge(personas);
        orden.mostrarArreglo(personas);

        System.out.println("==== Personas Ordenadas Por Nombre ====");
        orden.sortPersonByName(personas);
        orden.mostrarArreglo(personas);

        System.out.println("==== Ordenadas por promedio =====");
        orden.sortPersonByAvrNotas(personas);
        orden.mostrarArreglo(personas);

        System.out.println("==== Ordenadas por valor nombre=====");
        orden.sortPersonByNameValue(personas);
        orden.mostrarArreglo(personas);

    }
}
