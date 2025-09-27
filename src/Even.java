//Write a program to print even strings
class Even{
    void even(String s){
        for(String s1:s.split(" ")){
            if(s1.length()%2==0){
                System.out.println(s1);
            }

        }
    }
    public static void main(String []s){
        String s2="My name is Somya Saxena";
        Even e1=new Even();
        e1.even(s2);
    }

}