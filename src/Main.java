import java.io.File;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        File files = new File ("/Users/ansarismagilov/Downloads/mosh course");
        String[] catalog = files.list();
        double totalBytes = 0.0;

        for (var item : catalog){
            totalBytes += item.length();
        }

        System.out.println(totalBytes);

    }
}
