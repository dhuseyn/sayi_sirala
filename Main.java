import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("a Sayisini giriniz : ");
        a = input.nextDouble();
        System.out.print("b Sayisini giriniz : ");
        b = input.nextDouble();
        System.out.print("c Sayisini giriniz : ");
        c = input.nextDouble();

        if (a<b && b<c) {
            System.out.print("a<b<c");
        } else if (a<c && c<b) {
            System.out.print("a<c<b");
        } else if (b<a && a<c) {
            System.out.print("b<a<c");
        } else if (b<c && c<a) {
            System.out.print("b<c<a");
        } else if (c<a && a<b) {
            System.out.print("c<a<b");
        } else if (c<b && b<a) {
            System.out.print("c<b<a");
        } else if (a==b && a==c) {
            System.out.print("a=b=c");
        } else if (a==b && a<c){
            System.out.print("a=b<c");
        } else if (a<b && b==c) {
            System.out.print("a<b=c");
        } else if (a==c && a<b) {
            System.out.print("a=c<b");
        } else if (b<a && a==c) {
            System.out.print("b<a=c");
        } else if (c<a && a==b) {
            System.out.print("c<a=b");
        } else System.out.print("Hatali giris...");


    }
}