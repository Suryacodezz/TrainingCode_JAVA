package composition;

public interface InterfaceCocepts {
    void display();
}
class A{

}
class B{
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        InterfaceCocepts obj=new InterfaceCocepts() {

            public void display() {
                System.out.println("hello");

            }
        };
        InterfaceCocepts obj1=() -> System.out.println("hello");
    }
}
