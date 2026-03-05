interface S{
    void play();
}
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}
class Student extends Person implements S{
    Student(String name){
        super(name);
    }
    @Override
    public void play(){
        System.out.println(name+"plays football");
    }
}
class emo{
    public static void main(String[] args) {
        Student s=new Student("anup ");
        s.play();

    }
}