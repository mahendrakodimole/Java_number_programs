public class PrimeNumber {
    /*A prime number (or a prime) is a natural number greater than 1 that is not a product of two smaller natural numbers.
     A natural number greater than 1 that is not prime is called a composite number.
      For example, 5 is prime because the only ways of writing it as a product, 1 × 5 or 5 × 1, involve 5 itself.
     However, 4 is composite because it is a product (2 × 2) in which both numbers are smaller than 4. */

     public static void main(String []args){
        int input=2;
        String result=isPrimeNumber(input);
        System.out.println(result);
        
     }

     static String isPrimeNumber(int n){
        int count=0;
        if(n>1){ 
            for(int i=2;i<n;i++){
                if(n%i==0){
                    count++;
                }
            }
        }else{
            return n+" is not a prime Number";
        }
        return count==0?n+" is a Prime Number":n+" is not a Prime Number";
     }


}
