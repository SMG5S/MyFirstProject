import java.util.Scanner;
public class Bar {
   public int numarul_de_bauturi;
   public Bautura[] bauturi;
   public Bar(int numarul_de_bauturi)
   {
      this.numarul_de_bauturi = numarul_de_bauturi;
   }
   public void alocarevectorBauturi()
   {
      bauturi = new Bautura[numarul_de_bauturi];
   }
   public void instantiereBauturi(Scanner sc)
   {
      for(int i=0;i<numarul_de_bauturi;++i)
      {
         System.out.println("Nume: ");
         String st = sc.nextLine();
         System.out.println("Pret: ");
         float f = sc.nextFloat();
         sc.nextLine();
         System.out.println("Cantitate: ");
         String s = sc.nextLine();
         bauturi[i] = new Bautura(st,f,s);
      }
      for(int i=0;i<numarul_de_bauturi;++i)
      {
         System.out.println("Nume: " + bauturi[i].get_nume());
         System.out.println("Pret: " + bauturi[i].get_pret());
         System.out.println("Cant: " + bauturi[i].get_cantitate());
         System.out.println(bauturi[i].toString());
      }
   }
   public float notadePlata(Persoana p,float total)
   {
      for(int i=0;i<numarul_de_bauturi;++i)
      {
         total = total + bauturi[i].get_pret();
      }
      System.out.println("Nota de plata este in valoare de " + total + " lei");
      return total;

   }
}
