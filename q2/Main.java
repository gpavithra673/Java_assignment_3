package q2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        MyCalculator mycal=new MyCalculator();
        System.out.println("Sum: "+mycal.divisor_sum(n));

    }
}
class MyCalculator implements AdvanceArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}