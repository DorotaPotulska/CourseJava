package ZapisIOdczyt;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            //PrintWriter drukarz = new PrintWriter(new FileWriter("dane.txt",true));
            PrintWriter drukarz = new PrintWriter(new FileWriter("dane.txt"));
            drukarz.println(1234);
            //przymusowe zapisanie obecnej zawartosci bufora
            //drukarz.flush();
            drukarz.close();

            //bez dopisania tru utworzy nam sie nowy plik i bedzie tylko zapisana ponizsza tresc bez 1234
            drukarz = new PrintWriter(new FileWriter("dane.txt",true));
            drukarz.append("Dopisanie treści na końcu pliku");
            drukarz.println();
            drukarz.printf("Pozwala zapisac w pliku tekst w formacie, %d liczba, " +
                    "%f lub %.2f zmienno przecinkowa, oraz string %s",50,165.4,165.4,"zapisany");
            drukarz.close();



            BufferedReader reader = new BufferedReader(new FileReader("dane.txt"));
            //System.out.println((char)reader.read());

          /*  System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());*/

            String tresc = "";
           /* while ((tresc=reader.readLine())!=null){
                System.out.println(tresc);

            }
           reader.close();*/

            BufferedWriter writer = new BufferedWriter(new FileWriter("baza.txt"));

            while ((tresc=reader.readLine())!=null){
               writer.write(tresc);
               writer.newLine();

            }
            writer.close();
            reader.close();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }


        //Main.test(1,2,125,"lal",4);
    }

    static void test (Object... a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
}
