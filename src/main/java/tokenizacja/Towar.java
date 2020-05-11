package tokenizacja;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Towar {
    private double cena;
    private String nazwa;
    private Date dataWydania;

    public Towar() {
        this.cena = 0.0;
        this.nazwa = " ";
        this.dataWydania = new GregorianCalendar().getTime();
    }

    public Towar(final double cena, final String nazwa) {
        this();
        this.cena = cena;
        this.nazwa = nazwa;
    }

    public Towar(final double cena, final String nazwa, int rok, int m, int dz) {
       this(cena,nazwa);
       GregorianCalendar kalendarz = new GregorianCalendar(rok,m-1,dz);
       this.dataWydania = kalendarz.getTime();
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(int r, int m, int dz) {
        GregorianCalendar kalendarz = new GregorianCalendar(r,m-1,dz);
        this.dataWydania = kalendarz.getTime();
    }

    public void setDataWydania(Date dataWydania) {
        this.dataWydania = dataWydania;
    }

    @Override
    public String toString() {
        GregorianCalendar kalendarz = new GregorianCalendar();
        kalendarz.setTime(dataWydania);
        return "Towar{" +
                "cena=" + cena + " zł"+
                ", nazwa='" + nazwa + '\'' +
                ", dataWydania=" + kalendarz.get(Calendar.YEAR) +" rok "
                +(kalendarz.get(Calendar.MONTH)+1)+" miesiąc "
                + kalendarz.get(Calendar.DAY_OF_MONTH)+" dzien"+
                '}';
    }

    public static void zpiszDoPliku(Towar[] towar, PrintWriter outS){

        outS.println(towar.length);
        GregorianCalendar kalendarz = new GregorianCalendar();

        for (int i = 0; i < towar.length; i++) {
            kalendarz.setTime(towar[i].getDataWydania());
            outS.println(towar[i].getCena()+"|"+towar[i].getNazwa()+"|"
                    //+towar[i].getDataWydania()+"|"
                    + kalendarz.get(Calendar.YEAR) +"|"
                    + (kalendarz.get(Calendar.MONTH)+1)+"|"
                    + kalendarz.get(Calendar.DAY_OF_MONTH));
        }
    }

    public static Towar[] odczytajZPliku(BufferedReader inS) throws IOException {

        int dl=Integer.parseInt(inS.readLine());
        Towar[]towar = new Towar[dl];

        for (int i = 0; i < dl; i++) {
            String linia= inS.readLine();
            StringTokenizer tokeny = new StringTokenizer(linia,"|");

            double cena= Double.parseDouble(tokeny.nextToken());
            String nazwa= tokeny.nextToken();
            int rok = Integer.parseInt(tokeny.nextToken());
            int m = Integer.parseInt(tokeny.nextToken());
            int dz = Integer.parseInt(tokeny.nextToken());

            towar[i]= new Towar(cena,nazwa,rok,m,dz);
        }

        return towar;
    }
}
