import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int r,a;
        double pi=3.14;

        Scanner inp=new Scanner(System.in);

        System.out.print("Yarı çapı giriniz: ");
        r= inp.nextInt();
        System.out.print("Merkes açıyı giriniz (0-360): ");
        a= inp.nextInt();

        double alan= (pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı: "+alan);
    }
}