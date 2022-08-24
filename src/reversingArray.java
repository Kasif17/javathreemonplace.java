// Reversing an arr
// ay using Java collections
import java.util.*;

public class reversingArray {

    // function reverses the elements of the array
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    public static void main(String[] args)
    {
        Integer [] arr = {10, 2, 20, 4, 5};
        reverse(arr);
    }
}

