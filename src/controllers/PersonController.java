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

    //Metodo ordena las personas segun el
    //PROMEDIO de sus notas con seleccion

    public void sortPersonByAvrNotas(Person [] personas){
        for (int i = 0;i<personas.length;i++){
            int indiceMenor=i;
            for(int j= i+1;j<personas.length;j++){
                // Comparacion para actualizar el indice
                //Si nuestro while,for o comparacion esta compuesta de una unica linea se puede obviar as llaves
                if(personas[j].getPromedio()<personas[indiceMenor].getPromedio())
                    indiceMenor = j;
                
            }
            // preguntas si el indiceMenor != de i
            if(i!=indiceMenor){
                Person aux = personas[i];
                personas[i]=personas[indiceMenor];
                personas[indiceMenor]=aux;
            }
        
        }
    }

    public void sortPersonByNameValue(Person [] personas){
        //Ordenar el arreglo de personas por un valor al nombre
        //El valor del nombre sera la cantidad de letras
        //donde las vocales valen 5
        //consotantes valen el valor de la edad
        for (int i = 0;i<personas.length;i++){
            int indiceMenor=i;
            for(int j= i+1;j<personas.length;j++){
                // Comparacion para actualizar el indice
                //Si nuestro while,for o comparacion esta compuesta de una unica linea se puede obviar as llaves
                if(personas[j].getValorNombre()<personas[indiceMenor].getValorNombre())
                    indiceMenor = j;
                
            }
            // preguntas si el indiceMenor != de i
            if(i!=indiceMenor){
                Person aux = personas[i];
                personas[i]=personas[indiceMenor];
                personas[indiceMenor]=aux;
            }
        
        }
    }
}