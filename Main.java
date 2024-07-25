import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String line = "";
        String splitBy = ",";
        List<String[]> student = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("uczniowie.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                student.add(line.split(splitBy));    // use comma as separator
            }
        } catch (Exception e) {
            System.out.println("Daj pan plik poprawny");
        } finally {
            System.out.println("wykona sie zawsze");
        }
    }
}
