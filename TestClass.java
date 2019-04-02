import sparse_arrays.*;
import java.util.*;

public class TestClass {
    
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        sparse_arrays sa=new sparse_arrays();

        int stringsCount,queriesCount;
        stringsCount=ob.nextInt();
        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            strings[i]=ob.next();
          }

        queriesCount = ob.nextInt();
        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            queries[i] = ob.next();
        }
    

        int[] res = sa.matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        ob.close();
    }
}

