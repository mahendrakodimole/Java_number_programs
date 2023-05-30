public class CircularPrimeNumber {
    public static void main(String[] args) {
       int input =197;
       String result=isCircularPrime(input);
       System.out.println(input+" "+result);
    }
    static String isCircularPrime(int n){
        int primeCount=0;
        int input0 =n;
        int digits=0;
        int multiplier=1;
        while(input0>0){
            digits++;
            input0/=10;
        }
        for(int i=1;i<digits;i++){
            multiplier*=10;
        }
    
        int input1 =n;
        while(n>0){
            input1=(input1%10*multiplier)+(input1/10);
           primeCount+= isPrime(input1);
            n/=10;
        }
        //System.out.println("Prime count:"+primeCount+" digits"+digits);
        return primeCount==digits?"is a Circular Prime number":"is not a Circular prime number";
    }
    static int isPrime(int n){
        int count=0;
            if(n>1){
                for(int i=2;i<n;i++){
                    if(n%i==0){
                        count++;
                    }
                }
            }
        return count==0?1:0;
    }
}
