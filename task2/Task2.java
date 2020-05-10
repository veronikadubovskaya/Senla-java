package task2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int a,b,nod,nok;
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite pervoe chislo: ");
        if(sc.hasNextInt()) {
            a = sc.nextInt();
            System.out.print("Vvedite vtoroye chislo: ");
            if(sc.hasNextInt()) {
                b = sc.nextInt();
                    while (a != 0 && b != 0) {
                    if (a > b)
                    a = a % b;
                    else
                    b = b % a;
                    } 
                    nod = (a+b);
                    nok = (a*b)%nod;
                System.out.println("NOD = " +nod); //НОД - наибольший общий делитель
                System.out.println("NOК = " +nok); //НОK - наименьшее общее кратное
            } 
        }
        else {
            System.out.println("Oshibka pri vode celogo chisla");
        }
    }    
}
