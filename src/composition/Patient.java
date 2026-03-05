package composition;

public class Patient {
    String patientname;
    int age;
    String diseas;
    String dateogarrival;
    Information info;
    Payment pay;

    public Patient(int age, String patientname, String diseas, String dateogarrival,Information info,Payment pay) {
        this.age = age;
        this.patientname = patientname;
        this.diseas = diseas;
        this.dateogarrival = dateogarrival;

    }
    void patientDeatils(){
        System.out.println("Nmae:"+this.patientname);
        System.out.println("age:"+this.age);
        System.out.println("diseaes:"+this.diseas);
        System.out.println("sate of arrival:"+this.dateogarrival);
        System.out.println("block no:"+this.info.blockNo);
        System.out.println("floor no:"+this.info.floorNo);
        System.out.println("room mo:"+this.info.roomNo);
        System.out.println("bed no:"+this.info.bedNo);
        System.out.println("admission gfee:"+this.pay.admfees);
        System.out.println("regisyer no:"+this.pay.refees);
        System.out.println("balance amt:"+this.pay.admfees);
    }

    public static void main(String[] args) {
        Information info=new Information('C',3,582,4);
        Payment pay=new Payment(5888,10000,5000);
        Patient p1=new Patient(23,"ABD","covid","25/6/26",info,pay);
        p1.patientDeatils();
    }
}