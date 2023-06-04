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
            digits++ ;//3
    }
    return digits;
}
public static int sumCubesOfDigits(int input,int digits){
    int sum=0;
    for(int i=1;i<=digits;i++){
        int n=input%10; //3 ,5
        int value=1;
            for(int j=1;j<=digits;j++){
            value*=n; //1*3 3*3 9*3   1*5 5*5 25*5  1*1 1*1 1*1
            }
        sum+=value; //0+27   27+125  27+125+1
        input/=10; //15   1
    }
    return sum;//153
}
}
