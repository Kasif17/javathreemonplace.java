import java.util.Scanner;

public class Stringfirst {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
//        String a = "kasif";
//        String b = "kasif";
        String first = sc.nextLine();
        String second = sc.nextLine();
//        String fullname = first +" "+second;
//        System.out.println(fullname);
//        String name = sc.nextLine();
//        System.out.println("my is "+name);*/
////
//        System.out.println(first.length());
//        for (int i = 0 ; i<first.length(); i++){
//            System.out.println(first.charAt(i));
//        }
    if (first.compareTo(second) == 0){
        System.out.println("String are equals");
    }
    else {
        System.out.println("string are not eqauls");
    }
//        if (a==b){
//            System.out.println("String are equals");
//        }
//        else {
//            System.out.println("string are not eqauls");
//        }
    }
}
