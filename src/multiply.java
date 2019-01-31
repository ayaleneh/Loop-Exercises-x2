import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        System.out.println("used to display multipilication table..");
        System.out.println("please enter anumber for table");
        Scanner scanner=new Scanner(System.in);
        int number=0;
        number=scanner.nextInt();
        for(int i=0;i<10;i++){
            System.out.println(number+"*"+i+"="+number*i);
        }
    }
}
