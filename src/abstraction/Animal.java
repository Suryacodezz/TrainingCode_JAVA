package abstraction;

abstract class Animal {
    void eat(){
        System.out.println("eats food");
    }
    //this method cannot have a body
    // it will be implemented in child classes
    abstract void run();
    //if an abstract class has only abstract methods it is 100% abstrcation
    //if iy has even 1 normal method it is NOT 100%
}
class cat extends Animal{
    @Override
    void run(){
        System.out.println("cat run fast");
    }
}
class dog extends Animal{
    @Override
    void run(){
        System.out.println("dog run fast");
    }
}
class Demo{
    public static void main(String[] args){
        cat c=new cat();
        dog d=new dog();
        c.eat();;
        c.run();
        d.eat();
        d.run();
    }
}




