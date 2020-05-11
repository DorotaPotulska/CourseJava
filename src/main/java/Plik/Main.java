package Plik;

import javax.crypto.spec.PSource;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

            try {
                File katalog = new File("cos");
                katalog.mkdir();

                File katalogi = new File("videoKursy"+File.separator+"php"+File.separator+"msql");
                katalogi.mkdirs();
                //czy jest katalogiem
                //katalog.isDirectory();

                File plik2 = new File("videoKursy"+File.separator+"php"+File.separator+"msql","lekacja1.txt");

                if(!plik2.exists()){
                    plik2.createNewFile();
                }


                File plik = new File("test.txt");
                if(!plik.exists()) {
                    plik.createNewFile();
                }
                System.out.println("-----------");
                System.out.println(plik.getPath());
                System.out.println(plik.getAbsolutePath());//absolutna dosłowna scieżka
                System.out.println(plik.getCanonicalPath());//kanoniczna, zawsze prawdziwa
                System.out.println("-----------");
                System.out.println("Czy mogę pisać? :"+plik.canWrite());
                System.out.println("Czy mogę go odpalić? :"+plik.canExecute());
                System.out.println("Czy mogę czytać? :"+plik.canRead());
                System.out.println("Czy jest ukryty? :"+plik.isHidden());
                System.out.println("Czy jest plikiem? :"+plik.isFile());
                System.out.println("Ostatnia modyfikacja :"+new Date(plik.lastModified()));
                System.out.println("Długość pliku w bajtach (il. znaków) :"+ plik.length());
                //usuniecie pliku
                //plik.delete();
// widoczne foldery i pliki w podanej wyzej lokalizacji, w której znajduje sie plik

                Main.wypiszSciezki(new File(System.getProperty("user.dir")));
            } catch (IOException e) {
                e.printStackTrace();
            }

            //System.out.println(System.getProperty("user.dir"));
            //System.out.println(System.getProperty("user.home"));
            //System.out.println(System.getProperty("java.home"));



    }

    public static void wypiszSciezki(File nazwaSciezki){
        String[] nazwyPlikowIKatalogow = nazwaSciezki.list();
        //System.out.println(nazwaSciezki.getPath());
        for (int i = 0; i < nazwyPlikowIKatalogow.length; i++) {
            File p = new File(nazwaSciezki.getPath(),nazwyPlikowIKatalogow[i]);
            if(p.isFile()) {
                System.out.println(p.getPath());
            }
            if(p.isDirectory()){
                wypiszSciezki(new File(p.getPath()));
            }
        }
    }
}
