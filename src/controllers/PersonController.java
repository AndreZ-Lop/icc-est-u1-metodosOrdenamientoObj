package controllers;
import models.Person;
public class PersonController {
    //Metodo que ordena un arreglo de persona
    //por su EDAD (age), con metodo inserccion
    public void sortPersonByAge(Person [] personas){
        for(int i=1;i<personas.length;i++){
            Person key=personas[i];
            int j = i-1;
            while(j>=0 && (personas[j].getAge())>(key.getAge())){
                personas[j+1]=personas[j];
                j--;
            }
            personas[j+1]=key;

        }

    }

     public void sortPersonByName(Person [] personas){
        for(int i=1;i<personas.length;i++){
            Person key=personas[i];
            int j = i-1;
            while(j>=0 && (personas[j].getName().compareTo(key.getName())>0)){
                personas[j+1]=personas[j];
                j--;
            }
            personas[j+1]=key;

        }

    }
    public void mostrarArreglo(Person [] personas){
        for(Person rPersona : personas){
            System.out.println(rPersona.toString());
        }
    }
}