import models.Person;
import controllers.PersonController;
public class App {
    public static void main(String[] args) throws Exception {
        PersonController orden = new PersonController();
        Person [] personas = {
            new Person ("Pedro",25),
            new Person ("Ana",19),
            new Person ("Carlos", 30),
            new Person ("Maria",22),
            new Person ("Diego",15)
        };
        System.out.println("==== Personas sin Ordenar ====");
        orden.mostrarArreglo(personas);
        System.out.println("==== Personas Ordenadas Por Edad====");
        orden.sortPersonByAge(personas);
        orden.mostrarArreglo(personas);

        System.out.println("==== Personas Ordenadas Por Nombre ====");
        orden.sortPersonByName(personas);
        orden.mostrarArreglo(personas);
    }
}
