

public interface Animals {
    /* inetrface methods are completerly abstarct and cannot have a body
    they are implemented in the respective child classes
    therefore, interface exhibit 100% abstraction
     */
    void sound ();
    void run();
    }
static class Cat implements Animals{
    @Override
   public void  sound(){
        System.out.println("cats meow");
    }
    public void run(){
        System.out.println("cat runs");
    }
}
static class Dog implements Animals{
    @Override
    public void sound(){
    System.out.println("dog meow");
}
 public void run(){
    System.out.println("dog runs");
}
}
class Demo{}

 public static void main(String[] args) {
    Cat cat=new Cat();
    Dog dog=new Dog();
    cat.run();
    cat.sound();
    dog.run();
    dog.sound();

}
