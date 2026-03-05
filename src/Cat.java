public interface Cat {
    default void sound(){
        System.out.println("woof");
    }
}
interface Dog{
    default void sound(){
        System.out.println("meow");
    }
}
class Cog implements Cat,Dog{
    public void sound(){
        Dog.super.sound();
    }
}
class c{
      public static void main(String[] args) {
          Cog cg=new Cog();
          cg.sound();

    }
}