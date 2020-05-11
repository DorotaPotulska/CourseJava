package AbstrakcyjneKlasyStrumieni;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStream inS;
        OutputStream ouS;

        Reader reader;
        Writer writer= new FileWriter("nazwaPliku.txt");

        writer.write("Zawsze pamietaj o zamknięciu strumienia!");

        writer.close();

    }

    void nazwaF(InputStream inS){

    }
}
