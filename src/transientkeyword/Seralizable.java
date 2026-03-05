package transientkeyword;/*package transientkeyword;
import java.io.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



        public class User implements Seralizable{
        String username="surya";
        transient String password ="1718";
    }
    class demo{
        public static void main(String[] args) throws Exception{
            User user=new User();
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("user.ser"));
            oos.writeObject(user);
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("user.ser"));
            User user1=(user) ois.readObject();
            System.out.println(user1.username);
            System.out.println(user1.password);
        }
    }
}*/
