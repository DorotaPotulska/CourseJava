package ramka;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    public Main(){
        /*
        //TYTUL RAMKI
        JFrame frame= new JFrame("tytuł ramki");
        //frame.setTitle("Tytuł ramki");

        //WIDOCZNOSC RAMKI
        frame.setVisible(true);

        //ZAMKNIECIE RAMKI
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(3);
        //3- wyjscie całkowice - krótsze niz 2
        //2 - sprzata po naszej ramce i ją wyłącza
        //1 - ukrywa
        //0 - nic sie nie stanie, gdy ja bedziemy chcieli zamknąć

        //ROZMIAR RAMKI
        //frame.setSize(300,100);
        //frame.setSize(new Dimension(100,100));

        //USTAWIENIE LOKACJI RAMKI
        //frame.setLocation(100,50);
        //frame.setLocation(new Point(100,50));

        //USTAWIENIE RAMKI Z LOKACJĄ I WYSOKOSCIA - ustaw granice naszej ramki
        frame.setBounds(100,50,300,100);

        //BRAK MOZLIWOSCI POWIEKSZANIA NASZEJ RAMKI
        frame.setResizable(false);

        //IKONKA
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("kurs.jpg"));

         */
        super("Układ graficzny (Layout)");
        //this.setBounds(100,50,300,100);
        this.setDefaultCloseOperation(3);
        //this.pack();

        int szer = Toolkit.getDefaultToolkit().getScreenSize().width;
        int wys= Toolkit.getDefaultToolkit().getScreenSize().height;
        System.out.println(szer);
        System.out.println(wys);

        this.setSize(szer/2,wys/2);
        //this.setLocation(szer/4,wys/4);
        int szerRamki = this.getSize().width;
        int wysRamki = this.getSize().height;
        //zawsze wysrodkuje ramke bez wzgledu na jej wielkość
        this.setLocation((szer -szerRamki)/2,(wys-wysRamki)/2);

        initComponents();
       // this.pack();


    }
    public void initComponents(){
        centrum= new JButton("Anuluj");
        //centrum= new JButton("Jestem w centrum");
        gora = new JButton("Jestem na górze");
        dol = new JButton("Jestem na dole");
        prawo = new JButton("Jestem po prawej stronie");
        lewo = new JButton("Jestem po lewej stronie");

        Container kontener = this.getContentPane();
        // poniższy menadzer układów jest ważniejszy i nie pozwala na uzycie metod setLocation i setSize
        /*kontener.add(centrum,BorderLayout.CENTER);
        kontener.add(gora,BorderLayout.PAGE_START);
        kontener.add(dol,BorderLayout.PAGE_END);
        kontener.add(prawo,BorderLayout.LINE_END);
        kontener.add(lewo,BorderLayout.LINE_START);*/

        centrum.setLocation(550,300);
        //centrum.setSize(150,30);
        centrum.setSize(centrum.getPreferredSize());

        kontener.setLayout(null);
        kontener.add(centrum);
    }
    JButton centrum;
    JButton gora;
    JButton dol;
    JButton prawo;
    JButton lewo;

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
