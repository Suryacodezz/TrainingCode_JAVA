public interface Browaer1 {
    void browser1();
}
interface Browser2{
    void browser2();
}
interface Browser3{
    void browser3();
}

class Browsers implements Browaer1,Browser2,Browser3{
    @Override
    public void browser1(){
        System.out.println("google");
    }
    @Override
    public void browser2(){
        System.out.println("safari");
    }
    @Override
    public void browser3(){
        System.out.println("firefox");
    }
}
class Demo{
    public static void main(String[] args) {
        Browsers b=new Browsers();
        b.browser1();
        b.browser1();
        b.browser3();
    }
}