import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int dikKenar1,dikKenar2;
        double hipotenusKaresi;

        System.out.print("1. Dik Kenar Uzunluğunu Giriniz: " );
        dikKenar1 = input.nextInt();
        System.out.print("2. Dik Kenar Uzunluğunu Giriniz: ");
        dikKenar2= input.nextInt();

        //Kullanıcıdan aldığımız kenarların karelerini alıp toplamının kareköküyle hipotenüsü buluyoruz.

        hipotenusKaresi = Math.sqrt((dikKenar1*dikKenar1) +(dikKenar2*dikKenar2));
        System.out.println("Hipotenüs Uzunluğu: " + hipotenusKaresi);
    }
}