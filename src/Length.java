// write a program to print length //

import java.util.Scanner;
class Length {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string");
        String s1 = sc.nextLine();
        int x = s1.length();
        System.out.println("The length is: "+x);
    }
}