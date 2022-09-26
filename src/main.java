import java.util.Scanner;
public class main  {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int aKenari, bkenari ;
        double c;
        System.out.print("1.Kenari Giriniz :");
        aKenari = in.nextInt();
        System.out.print("2.Kenari Giriniz :");
        bkenari = in.nextInt();
        c = Math.sqrt((aKenari*aKenari) + (bkenari*bkenari));
        System.out.print("Hipotenüs :"+ c);









    }
}
