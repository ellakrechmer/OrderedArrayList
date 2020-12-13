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
      super.set(i, get(minindex));
      super.set(minindex, curr);
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
  public T set(int n, T v) throws IllegalArgumentException {
		if (v == null) throw new IllegalArgumentException();

		T hold = super.remove(n);

		super.add(n, v);

		sort();

		return hold;
	}
}
