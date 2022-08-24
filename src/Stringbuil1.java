import java.util.*;
public class Stringbuil1 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Rocky");
        //  System.out.println(sb);
        System.out.println(sb.charAt(0));
       //
        // sb.insert(0,'T');
        sb.delete(4,5);
       // sb.setCharAt(0, 'Y');
            System.out.println(sb);


    }
}