import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String file="src\\prac.csv";
        BufferedReader reader=null;
        String line;
        try{
            reader=new BufferedReader(new FileReader(file));
            while ((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}