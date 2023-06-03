import java.util.Scanner;

public class CoPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //inputs
      System.out.print("Enter a=");
      int a=sc.nextInt();
      System.out.print("Enter b=");
      int b=sc.nextInt();
      sc.close();
    String result=isCoPrime(a,b);
    System.out.println(a+" & "+b+result);
    }

    static String isCoPrime(int a,int b){
        int count=0;
        if(a>1&&b>1){
            int n=(a>b?a:b);
            for(int i=2;i<n;i++){
                if(a%i==0 && b%i==0){
                    count++;
                }
            }
        }else if(a<0 || b<0){
            return " should be positive numbers";
        }else{
           return " are Not CoPrime Numbers";
        }

        return (count==0?" are CoPrime Numbers":" are Not CoPrime Numbers");
    }

}
