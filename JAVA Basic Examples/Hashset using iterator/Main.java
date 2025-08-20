import java.util.*;

class Main {
    public static void main(String[] args) {
     HashSet<String> s= new HashSet<String>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        Iterator<String> itr = s.iterator();
        while (itr.hasNext()) {
            String sa = itr.next();
            System.out.print(sa);
        }
    }
}
