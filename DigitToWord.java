public class DigitToWord {
    /*Convert digits to Words 
     *Exmple : 123 ==> One Two Three
     */
  public static void main(String[] args) {
    check(2147483647);
  }
  static void check(int n){
    String word="";
    while (n>0){
        int a=n%10;
        switch(a){
          case 0: word="Zero "+word;break;
          case 1: word="One "+word;break;
          case 2: word="Two "+word;break;
          case 3: word="Three "+word;break;
          case 4: word="Four "+word;break;
          case 5: word="Five "+word;break;
          case 6: word="Six "+word;break;
          case 7: word="Seven "+word;break;
          case 8: word="Eight "+word;break;
          case 9: word="Nine "+word;break;
      }
        n/=10;
    }
    System.out.println(word); 
  }

}
