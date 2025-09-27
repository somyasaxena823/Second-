//Write a program to slice words in a string
import java.util.Scanner;
class Slice{
    public static void main(String []s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s1 = sc.nextLine();
        String[] s2 = s1.split(" ");
        for (int i = 0; i <=s1.length(); i++) {
             System.out.println(s2[i]);
        }
    }

}