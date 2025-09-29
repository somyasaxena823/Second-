// Write a java program to change cases of string
import java.util.Scanner;
class Upper{
    void upper(String s1)
    {
        String s2=s1.toUpperCase();
        System.out.println(s2);

    }
    void lower(String s1){
        String s3=s1.toLowerCase();
        System.out.println(s3);
    }
}

public class Case {

public static void main(String []s){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any String :");
    String s1= sc.nextLine();
    Upper m=new Upper();
    m.upper(s1);
    m.lower(s1);


}
}
