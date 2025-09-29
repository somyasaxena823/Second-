import java.util.Scanner;
class Palindrome{
    public static void main(String []s){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s1=sc.nextLine();
        String s2=s1;
        StringBuffer sb=new StringBuffer(s1);
        sb.reverse();
        s1=sb.toString();
        if(s1.equals(s2)){
            System.out.println("I am palindrome");
        }
        else{
            System.out.println("I am not palindrome");
        }
    }
}