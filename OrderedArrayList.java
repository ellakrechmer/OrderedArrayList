import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }
  public boolean add(T value){
    if (size()==0) {
      super.add(value);
      return true;
    }
    int i=size()-1;
    while(i>=1 && value.compareTo(get(i))<=0) {
        i--;
    }
    super.add(i, value);
    return true;
  }

  public void add (int index, T value){
    if (size()==0) {
      super.add(value);
    }
    int i=size()-1;
    while(i>=1 && value.compareTo(get(i))<=0) {
        i--;
    }
    super.add(i, value);
  }
}
