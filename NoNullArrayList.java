import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public boolean add(T value){
    if (value==null) throw new IllegalArgumentException();
    super.add(value);
    return true;
  }
}
