import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }
  private void sort(){
    for (int i=0; i<size(); i++){
      int minindex=i;
      for (int j=i+1; j<size(); j++){
        if (get(j).compareTo(get(minindex))<0) {
          minindex=j;
        }
      }
      T curr=get(i);
      set(i, get(minindex));
      set(minindex, curr);
    }
  }

  public boolean add(T value) {
    if (value==null){
      throw new IllegalArgumentException("Null was added");
    }
    super.add(value);
    sort();
    return true;
  }

  public void add (int index, T value) {
    if (value==null){
      throw new IllegalArgumentException("Null was added");
    }
    super.add(value);
    sort();
  }
  public T set (int index, T value) throws IllegalArgumentException{
    if (value==null){
      throw new IllegalArgumentException("Null was added");
    }
    T oldval=super.get(index);
    super.remove(index);
    super.add(value);
    sort();
    return oldval;
  }
}
