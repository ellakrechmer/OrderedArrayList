import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public boolean add(T value) throws IllegalArgumentException{
    if (value==null) throw new IllegalArgumentException();
    return super.add(value);
  }
  public void add (int index, T value) throws IllegalArgumentException{
    if (value==null) throw new IllegalArgumentException();
    super.add(index, value);
  }
  public T set(int index, T value) throws IllegalArgumentException{
    if (value==null) throw new IllegalArgumentException();
    return super.set(index, value);
  }
}
