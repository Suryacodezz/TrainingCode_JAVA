package arrays;
class Student{
    String name;
    int USN;
}
    class Intern{
    String name;
    int id;
    Intern(String name,int id){
        this.name=name;
        this.id=id;
    }
    }
public class E7 {
    public static void main(String[] args) {
        Student[] stds=new Student[3];
        stds[0] =new Student();
        stds[0].name="rahul";
        stds[0].USN=110;
        System.out.println(stds[0].name+" "+stds[0].USN);
        Intern[] interns=new Intern[]{
                new Intern("sahana",101),
                new Intern(" RAMYA",102),
                new Intern("ram",1)
        };
        //here data type is int itself
        for(Intern i: interns){
            System.out.println(i.name+" "+i.id);
        }

    }
}


