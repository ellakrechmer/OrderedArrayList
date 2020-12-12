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

  public boolean add(T value){
    super.add(value);
    sort();
    return true;
  }

  public void add (int index, T value){
    super.add(value);
    sort();
  }
  // public T set (int index, T value){
  //   T oldval=get(index);
  //   remove(oldval);
  //   add(value);
  //   return oldval;
  // }
}
