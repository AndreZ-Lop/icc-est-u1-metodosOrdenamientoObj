package models;
public class Person {
    private String name;
    private int age;
    private int[] notas;
    
    public Person() {
    }
    
    public Person(String name, int age, int [] notas) {
        this.name = name;
        this.age = age;
        this.notas = notas;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int[] getNotas() {
        return notas;
    }
    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", promedio=" + getPromedio()+"]";
    }

    public int getPromedio(){
        int suma=0;
        for(int n:notas){
            suma+=n;
        }
        int prom = suma/notas.length;
        return prom;
    }

    public int getValorNombre(){
        int suma = 0;
        for(int i = 0;i<name.length();i++){
            char letter = name.toLowerCase().charAt(i);
            if(letter == 'a' || letter == 'e' || letter=='i' || letter=='o' || letter=='u'){
                suma+=5;
            }else{
                suma+=age;
            }

        }

        return suma;
    }

    
}
