package exceptions;
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;

public class E4 {
    public static void main(String[] args) throws IOException {

            String s;
            try( BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("data");
                s=br.readLine();
                System.out.println(s);
                br.close();
                //the above close is grey becasue it is not required because bufferedreader has autoclose
            }
        }
    }

