public class Divisibleby9 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=100;i<=200;i++){
            if(i%9==0){
                System.out.println("number divisble by 9 b/n 100 and 200 is "+i);
                sum=sum+i;
            }
        }
        System.out.println("the sum of the number b/n 100-200 that Divisble by 9 is "+sum);
    }
}
