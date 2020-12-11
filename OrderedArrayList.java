import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }
  // private void sort(){
  //   //sorting
  //   for (int i=0; i<size(); i++){
  //     for (int j=0; j<size(); j++){
  //       T value=remove(i);
  //       if (get(i).compareTo(get(j))>0) super.add(j,value);
  //     }
  //   }
  // }
  public boolean add (T value){
    //sort();
    //adding
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
}
