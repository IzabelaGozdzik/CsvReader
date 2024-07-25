import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        String line = "";
        String splitBy = ",";
        List<Uczen> student = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("uczniowie.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String imieNazwosko = line.split(splitBy)[0];
                String przedmiot = line.split(splitBy)[1];
                int ocena = Integer.valueOf(line.split(splitBy)[2]);
                student.add(new Uczen(imieNazwosko, przedmiot, ocena));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Daj pan plik poprawny");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch (NumberFormatException bladLiczb){
            System.out.println("liczby sa nie poprawne");
        } finally {
            System.out.println("wykona sie zawsze");
        }


        student.forEach(x -> x.wypisz());






    }
}
