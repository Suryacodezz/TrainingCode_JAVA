package exceptions;
import java.io.IOException;
// java.io.IOException is called fully qualified class name
public class CheckException {
    static void readFile() throws IOException {
        throw new IOException("file not found");

    }

    public static void main(String[] args) {
        try {
            display();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
        static void display () throws IOException {
            readFile();
        }
    }

