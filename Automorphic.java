/*A number is called an automorphic number if and only if the square of the given number ends 
with the same number itself. For example, 25, 76 are automorphic numbers because their square 
is 625 and 5776, respectively and the last two digits of the square represent the number itself. 
Some other automorphic numbers are 5, 6, 36, 890625, etc. */
public class Automorphic {
    
    public static void main(String []args){
        int input=376;//5,6,76,376
     isAutomorphic(input);
    }
    static void isAutomorphic(int input){
        System.out.println(lastValue(square(input),digits(input))==input?input+" is an Automorphic number":input+" is not an Automorphic number");
    }
    public static int square(int n){
        System.out.println("input  :"+n);
        System.out.println("square :"+n*n);
        return n*n;
    }
    static int lastValue(int square,int count){
        int divider=10;
        for(int i=1;i<count;i++){
            divider*=10;
        }
        int lastValue=square%divider;
        System.out.println("input is "+count+" digit value so comparing last "+count+" Digits value of squared input i.e, "+lastValue);
        return lastValue;
    }

    static int digits(int n){
        int count=0;
        while (n>0){
            n/=10;
            count++;
        }
        return count;
    }
}



