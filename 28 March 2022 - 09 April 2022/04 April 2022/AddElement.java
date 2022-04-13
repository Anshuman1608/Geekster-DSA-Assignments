package March;
import java.util.*;
public class AddElement {

  public static void main(String[] args) {
    List < Integer > al = new ArrayList < Integer > ();

    al.add(15);
    al.add(30);
    al.add(45);
    al.add(60);
    System.out.println(al);
    al.add(3,100);
    System.out.println(al);

}
}