package task5;
import java.util.Scanner;
public class Task5 {
    static int isPalindrome(int n) 
    { 
        int rev = 0; 
        for (int i = n; i > 0; i /= 10) 
        rev = rev * 10 + i % 10; 
        return(n == rev) ? 1 : 0; 
    } 
    static void countPal(int min, int max) 
    { 
        for (int i = min; i <= max; i++) 
        if (isPalindrome(i)==1) 
        System.out.print(i + " "); 
    } 
    public static void main(String args[]) 
    { 
        int n;
        System.out.print("vvedite neobhodimiy diapazon dly poiska palindromov ot 0 do: ");
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt()){  
            n = scan.nextInt();
        countPal(0, n); 
        } 
    }
}