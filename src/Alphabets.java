import java.util.Scanner;
class Alphabets{
    public static void main(String []s){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting character");
        char c1=sc.next().charAt(0);
        System.out.println("Enter second character");
        char c2=sc.next().charAt(0);
        for(char ch=c1;ch<=c2;ch++){
            System.out.println(ch);
        }

    }
}