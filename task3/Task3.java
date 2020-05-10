package task3;
import java.util.Arrays;
import java.util.Scanner;
public class Task3 {
    static String convert(String str) 
    { 
        char ch[] = str.toCharArray(); 
        for (int i = 0; i < str.length(); i++) { 
            if (i == 0 && ch[i] != ' ' ||  
            ch[i] != ' ' && ch[i - 1] == ' ') { 
  
            if (ch[i] >= 'a' && ch[i] <= 'z') { 
  
                ch[i] = (char)(ch[i] - 'a' + 'A'); 
                } 
            } 
        }
        String st = new String(ch); 
        return st; 
    } 
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Vvedite text cherez probel: ");
            String input = sc.nextLine();
            int count = 0;
            if(input.length() != 0){
                count++;
                for (int i = 0; i < input.length(); i++) {
                    if(input.charAt(i) == ' '){
                        count++;
                    }
                }
            }
        System.out.println("Kolichestvo slov: " +count);
        
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("Otsortirovannyi text: " +sortedString);  // тут должен был быть отсортирован по словам, а вышло по буквам
        
        String str = new String(charArray);
        System.out.println("Text c zaglavnoy bykvi: " +convert(str)); //т.к. в прошлом получилось одно слово, одна заглавная буква
        // поздно увидела задания, не хватило времени на раздумия для исправления
   
    }
}
   