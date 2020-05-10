package task4;
import java.util.Scanner;
public class Task4 {
static int countOccurences(String str, String word)  
{ 
    String a[] = str.split(" "); 
    int count = 0; 
    for (String a1 : a) {
        if (word.equals(a1)) {
            count++;
        }
    } 
    return count; 
} 
public static void main(String args[])  
{ 
    Scanner sc = new Scanner(System.in);
    System.out.print("Vvedite text dla poiska slova: " ); 
    String str = sc.nextLine();
    System.out.print("Vvedite slovo dla poiska: "); 
    String word = sc.nextLine();
    System.out.println("Kolichestvo povtoryuschixsy slov: " +countOccurences(str, word)); 
}
}
