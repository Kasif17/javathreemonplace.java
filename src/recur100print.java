public class recur100print {
  /*  public  static  void printHunNum(int n){
        if(n>0){
            printHunNum(n-1);
            System.out.println(n+"");
            return;
        }
    }

    public static void main(String[] args) {
        printHunNum(100);


    }*/
  public static void main(String[] args) {
      printHinNum(1,100);
  }
  public static void printHinNum(int n , int m){
      if(n<=m){
          System.out.println(n+" ");
          printHinNum(n+1,m);
      }
  }
}
