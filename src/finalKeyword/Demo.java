package finalKeyword;

public final class Demo {
}
/*class A extends Demo{    cannot inherit final class

}*/
class B{
    final void college(){
        System.out.println("sce");
    }
}
class C extends B{
 /*   Void college(){       cannot override final method

    }
}*/

    final  int x=200;
    //x=100;  cannot change final variable

    void show(final int x){
    //x=20;  // cannot change the value of a final parameter
    }
}