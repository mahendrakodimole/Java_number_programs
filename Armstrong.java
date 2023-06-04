class Armstrong{
    /*
Armstrong number is any number following the given rule –
abcd… = a^n + b^n + c^n + d^n + …
Where n is the order(length/digits in number)
example : 153
          1634
    */ 
public static void main(String []args){
    int givenNumber=1634;
    int sum=sumCubesOfDigits(givenNumber,countDigits(givenNumber));
    System.out.println(sum==givenNumber?givenNumber+" is an ArmStrong Number":givenNumber+" is not an ArmStrong Number");
    }
    public static int countDigits(int n){
        int digits=0;
        while (n>0){
            n/=10;
            digits++;
    }
    return digits;
}
public static int sumCubesOfDigits(int input,int digits){
    int sum=0;
    for(int i=0;i<=digits;i++){
        int n=input%10;
        int value=1;
            for(int j=1;j<=digits;j++){
            value*=n;
            }
        sum+=value;
        input/=10;
    }
    return sum;
}
}
