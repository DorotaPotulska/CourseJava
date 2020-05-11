package swobodnyDostepDoPlikow;

import tokenizacja.Towar;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Towar[] towar = new Towar[3];

        towar[0]=new Towar();
        towar[1]=new Towar(29.0,"Video kurs Java");
        towar[2]=new Towar(39.0, "Video kurs C++",2008,11,21);

        try{
      /*     DataOutputStream outS = new DataOutputStream(new FileOutputStream("nowy.txt"));

            outS.writeDouble(123.6676);
           outS.close();

           DataInputStream intS = new DataInputStream(new FileInputStream("nowy.txt"));
            System.out.println(intS.readDouble());
            intS.close();*/

      RandomAccessFile RAF = new RandomAccessFile("nowy.txt","rw");

      RAF.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
