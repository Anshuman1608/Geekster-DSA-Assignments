package March;
import java.util.*;
public class SortArrayList {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("JavaFx");
    list.add("Java");
    list.add("WebGL");
    list.add("OpenCV");
    Collections.sort(list);
    System.out.println(list);
    Collections.reverse(list);
    System.out.println(list);
}
}
