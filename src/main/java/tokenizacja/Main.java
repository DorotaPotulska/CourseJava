package tokenizacja;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Towar[] towar= new Towar[3];

        towar[0]=new Towar();
        towar[1]=new Towar(29.0,"Video kurs Java");
        towar[2]=new Towar(39.0, "Video kurs C++",2008,11,21);

        try{
            //zapisywanie do pliku
            PrintWriter writer = new PrintWriter(new FileWriter("tokenizacja.txt"));
            Towar.zpiszDoPliku(towar,writer);
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("tokenizacja.txt"));

            Towar[] towar2= Towar.odczytajZPliku(reader);

            for (int i = 0; i <towar2.length ; i++) {
                System.out.println(towar2[i]);
            }

            reader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
