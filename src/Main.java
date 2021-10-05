import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati numele persoanei: ");
        String string = scanner.nextLine();
        System.out.println("Bani cash: ");
        float fl = scanner.nextFloat();
        System.out.println("Card: ");
        float f = scanner.nextFloat();
        Persoana p = new Persoana(string,fl,f);
        System.out.println(p.toString());
        System.out.println("Numarul de bauturi comandate: ");
        int nr_b = scanner.nextInt();
        scanner.nextLine();
        Bar bar = new Bar(nr_b);
        bar.alocarevectorBauturi();
        bar.instantiereBauturi(scanner);
        float totalul=0;
        totalul=bar.notadePlata(p,totalul);
        p.platestenotadePlata(scanner,totalul);
    }
}
