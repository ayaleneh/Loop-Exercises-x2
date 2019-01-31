import java.util.Scanner;

public class PaliDrome {
    public static void main(String[] args) {
        int number,rem;
        int rev_int=0;
        System.out.println("Program used to know weather the given number is palidrome or not..");
        System.out.println("please enter any number that you want to check..");
        Scanner scanner=new Scanner(System.in);
         number=scanner.nextInt();
         int original=number;
        while(number!=0){
            rem=number%10;
            rev_int=rev_int*10+rem;
            number=number/10;
        }
        if(original==rev_int){
            System.out.println("The given number "+original +"  is PaliDrome");
        }
        else{
            System.out.println("The given number "+original +" not  is PaliDrome");
        }
    }
}
