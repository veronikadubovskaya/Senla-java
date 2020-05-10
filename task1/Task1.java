package task1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        int n;
        System.out.print("entered number: ");
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt()){  
            n = scan.nextInt();
            if ((n%2)==0){ //проверка на чётность
                System.out.print(n + " - chetnoe chislo"); 
            } 
            else{ 
                System.out.print(n + " - nechetnoe chislo");  
            }
            for ( int i=2; i < n; i++) {
                if ( n%i == 0) {
                    System.out.println(", i ne prostoe!"); 
                    return; 
                }
            }
                System.out.println(", i prostoe!");  //простое число
            }
        else 
        {
        System.out.println("Oshibka, ne celoe chislo!");
        } 
    }  
}       