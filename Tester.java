import java.util.*;
public class Tester{
  public static void main(String[] args){
    ArrayList<String> s= new NoNullArrayList<String>();
    s.add("uni"); s.add("kani"); s.add("ebi"); //s.set(1, null);
    System.out.println(s);
    ArrayList<String> t= new ArrayList<String>();
    t.add("uni"); t.add("kani"); t.add("ebi"); t.set(1, null);
    System.out.println(t);
  }
}
