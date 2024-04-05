//Hildana Gebrearegawi
public class GridWriter {

  private GridItem items[];
  private int size;
  private int rows;
  private int columns;
  private static final int INITIAL_CAPACITY = 4;


  public GridWriter(int r, int c) {
    items = new GridItem[INITIAL_CAPACITY];
    size = 0;
    rows = r;
    columns = c;
  }

  public void add(GridItem item) {

    // If the item array is full, we double its capacity
    if (size == items.length) {
      doubleItemCapacity();
    }

   
    items[size] = item;

   
    size++;
  }

  public void display() {
    int count;

    
    for (int r = rows; r >= 0; r--) {

      
      for (int c = 0; c <= columns; c++) {

       
        count = 0;

        for (int i = 0; i < size; i++) {
          if (items[i].containsPoint(c, r)) {
            count++;
          }
        }
        if (count == 0) {
          System.out.print(" .");
        } else {
          System.out.print(" " + count);
        }
      }

      System.out.println();
    }
  }

  private void doubleItemCapacity() {

    GridItem temp[] = new GridItem[items.length * 2];

    for (int i = 0; i < items.length; i++) {
      temp[i] = items[i];
    }

    items = temp;
  }
}