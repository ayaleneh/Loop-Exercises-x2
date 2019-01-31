import java.util.Scanner;

public class even_sum {
    public static void main(String[] args) {
        int number=0;
        int sum=0;
        System.out.println("used to Print and add even number");
        System.out.println("please enter upper bound for whole number");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        for(int i=0;i<number;i++){
            if((i%2)==0){

                System.out.println("even_number "+i);
                sum=sum+i;

            }
        }
        System.out.println("the sum of even number is "+sum);
    }
}
