package March;
import java.util.*;
public class CopyElement {
    public static void main(String[] args) {
    ArrayList<Integer> copyele = new ArrayList<>();

    copyele.add(10);
    copyele.add(21);
    copyele.add(22);
    copyele.add(35);

    ArrayList<Integer> copyele2 = copyele;


    for (Integer value : copyele2) {
        System.out.println(value);
    }

    copyele2.set(2, 23);

    System.out.println( copyele.get(2));
    System.out.println(copyele2.get(2));
}
}
