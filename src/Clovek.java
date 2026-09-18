public class Clovek {
    private String name;
    private String surname;
    private int age;

    public String getName() {return this.name;}
    public String getSurname() {return this.surname;}
    public int getAge () {return this.age;}

    public Clovek(){
        this.name = null;
        this.surname = null;
        this.age = 0;
    }

    public Clovek(String name,String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void info(){
        System.out.printf("%s %s je ti %d let",name,surname,age);
    }
}
