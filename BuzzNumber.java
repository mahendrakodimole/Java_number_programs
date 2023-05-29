public class BuzzNumber {
    /*A number is said to be Buzz Number if it ends with 7 or is divisible by 7. 
    Example: 1007 is a Buzz Number. */
    public static void main(String []args){
        int input=1009;
        String result=isBuzzNumber(input);
        System.out.println(result);
    }
    static String isBuzzNumber(int n){
        return(n%10==7 || n%7==0)?n+" is a Buzz Number":n+" is not a Buzz Number";
    }
}
