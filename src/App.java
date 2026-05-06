import models.Person;
import controllers.PersonController;
public class App {
    public static void main(String[] args) throws Exception {
        Person [] personas = {
            new Person ("Pedro",25),
            new Person ("Ana",19),
            new Person ("Carlos", 30),
            new Person ("Maria",22),
            new Person ("Diego",15)
        };
        System.out.println("==== Personas sin Ordenar ====");
        for(Person rPersona : personas){
            System.out.println(rPersona.toString());
        }
        System.out.println("==== Personas Ordenadas ====");
        PersonController orden = new PersonController();
        orden.sortPersonByAge(personas);
        for(Person rPersona : personas){
            System.out.println(rPersona.toString());
        }
    }
}
