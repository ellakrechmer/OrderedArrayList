import java.util.*;
public class Tester{
  public static void main(String[] args){
    ArrayList<String> s= new OrderedArrayList<String>();
    s.add("uni"); s.add("kani"); s.add(1, "ebi"); s.add(4, "ani");
    s.add("apple"); s.add(0, "cat");
    s.add(3, "banana"); s.add("null");
    System.out.println(s);
    ArrayList<String> t=new NoNullArrayList<String>();
    t.add("apple"); t.add(0, "cat");
    t.add("null"); t.add("banana");
    System.out.println(t);
    ArrayList<Integer> n=new OrderedArrayList<Integer>();
    n.add(5); n.add(7); n.add(3); n.add(6); n.add(4); n.add(1); n.add(2);
    System.out.println(n);
  }
}
