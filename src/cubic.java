import java.util.Scanner;

public class cubic {
    public static void main(String[] args) {
        int number=0;
        System.out.println("the program Print the Cube of the number Start from 1 to you entered number..");
        System.out.println("please enter any number..");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        for(int i=0;i<=number;i++){
            System.out.println("Cube of "+i+" is "+i*i*i);
        }
    }
}
