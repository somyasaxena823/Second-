//Write a program to count number of words in a string
import java.util.Scanner;
public class Words {
    public static void main(String []s){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string");
String s1=sc.nextLine();
String[] s2=s1.split(" ");
int w=s2.length;
System.out.print("The number of words in the string :"+w);
    }
}
