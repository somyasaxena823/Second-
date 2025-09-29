//Write a java program to insert a new String
import java.util.Scanner;
class Insert {
    public static void main(String []s){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s1=sc.nextLine();
        System.out.print("Enter index number:");
        int x=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter string to be inserted:");
        String s2=sc.nextLine();


        StringBuffer sb=new StringBuffer(s1);
        sb.insert(x,s2);
        s1=sb.toString();
        System.out.print(s1);

    }
}
