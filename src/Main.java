import java.io.File;

public class Main {

    public static void main(String[] args) {
        File files = new File ("/Users/ansarismagilov/Downloads/mosh course");
        String[] names = files.list();
        int size = 0;
        for (var item : names){
            size += new File("/Users/ansarismagilov/Downloads/mosh course/" + item).length() / 1000000;
        }
        System.out.println(size + "MB");

    }
}
