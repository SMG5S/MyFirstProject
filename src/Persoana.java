import java.util.Scanner;
public class Persoana {
     private String _Nume;
     private float _Cash;
     private float _Card;
     public Persoana(String Nume,float Cash,float Card)
     {
         set_Nume(Nume);
         set_Cash(Cash);
         set_Card(Card);
     }
     public void set_Nume(String Nume)
     {
         _Nume = Nume;
     }
     public void set_Cash(float Cash)
     {
         _Cash = Cash;
     }
     public void set_Card(float Card)
     {
         _Card = Card;
     }
     public String get_Nume()
     {
         return _Nume;
     }
     public float get_Cash()
     {
         return _Cash;
     }
     public float get_Card()
     {
         return _Card;
     }
     @Override
     public String toString()
     {
         String r = "\nNume: " + _Nume;
         r = r + "\nCash: " + _Cash;
         r = r + "\nCard: " + _Card;
         return r;
     }
     public void platestenotadePlata(Scanner sc, float total)
     {
         String optiuni;
         System.out.println("Cu ce doriti sa platiti plata?");
         optiuni=sc.next();
         switch(optiuni) {
             case "card":
                 if(_Cash<total && _Card>=total)
                 {
                     System.out.println("Plata a fost achitata cu cardul");
                     _Card = _Card - total;
                     System.out.println("Card: " + get_Card());
                 }
                 else if(_Cash>=total && _Card>=total)
                 {
                     System.out.println("Plata a fost achitata cu cardul");
                     _Card = _Card - total;
                     System.out.println("Card: " + get_Card());
                 }
                 else
                 {
                     System.out.println("Nota de plata nu a putut fi achitata!");
                     System.out.println("T: " + total);
                 }
                 break;
             case "cash":
                 if (_Card<total && _Cash>=total) {
                     System.out.println("Plata a fost achitata cu bani cash");
                     _Cash = _Cash - total;
                     System.out.println("Cash: " + get_Cash());
                 }
                 else if(_Card>=total && _Cash>=total)
                 {
                     System.out.println("Plata a fost achitata cu bani cash");
                     _Cash = _Cash - total;
                     System.out.println("Cash: " + get_Cash());
                 }
                 else
                 {
                     System.out.println("Nota de plata nu a putut fi achitata!");
                     System.out.println("T: " + total);
                 }
                 break;
             case "ambele":
                 if(_Cash>=_Card)
                 {
                     System.out.println("Plata a fost achitata cu bani cash si card");
                     total=total-_Cash;
                     _Cash=0;
                     total=total-_Card;
                     _Card=0;
                     System.out.println("Total: "+ total);
                     System.out.println("Cash: " + get_Cash());
                     System.out.println("Card: " + get_Card());
                 }
                 else
                 {
                     System.out.println("Plata a fost achitata cu bani cash si card");
                     total=total-_Card;
                     _Card=0;
                     total=total-_Cash;
                     _Cash=0;
                     System.out.println("Total: "+ total);
                     System.out.println("Card: " + get_Card());
                     System.out.println("Cash: " + get_Cash());
                 }
                 break;
             default:
                 System.out.println("Nota de plata nu a fost achitata!");
                 System.out.println("Daca nu puteti plati in urmatoarele zile atunci va trebui sa luam masuri!");
                 break;
         }

     }
}
