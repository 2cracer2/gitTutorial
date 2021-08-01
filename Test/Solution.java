import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        for(java.util.Iterator<String> it=list.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }
        /**
         * for (String s : list) {
         *             System.out.println(s);
         *         }
         */
        list.add("jiya");
        System.out.println(list);
        for (Object o :list) {
            System.out.println("diyi"+o);
        }

    }
}