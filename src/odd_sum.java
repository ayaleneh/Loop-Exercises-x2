import java.util.Scanner;

public class odd_sum {
    public static void main(String[] args) {
        int number=0;
        int sum=0;
        System.out.println("used to Print and add odd number");
        System.out.println("please enter upper bound for whole number");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        for(int i=0;i<number;i++){
            if((i%2)!=0){

                System.out.println("odd_number "+i);
                sum=sum+i;

            }
        }
        System.out.println("the sum of odd number is "+sum);
    }
}
