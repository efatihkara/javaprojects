
import java.util.Scanner;

//break komutu işlemi sonlandırmak içindir yoksa işlem devam edecektir.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Islem giriniz:");
        int islem=scanner.nextInt();
        
        switch (islem) {
            case 1:
                System.out.println("1.islem");
                break;
            case 2:
                System.out.println("2.islem");
                break;
            case 3:
                System.out.println("3.islem");
                break;
            case 4: 
                System.out.println("4.islem");
                break;
                default:
                    System.out.println("Gecersiz islem");
                    break;
        }
        
    }
}
