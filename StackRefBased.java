public class StackRefBased<T> implements Stack<T> {
    StackNode<T> top;
    int sB;

    public StackRefBased() {
      top = null;
      sB = 0;
    }

    public int size() {
        return sB;
    }


    public boolean isEmpty() {
        return top == null;
    }


    public void push(T data) {
        StackNode<T> smh = new StackNode<T>(data);
        smh.next = top;
        top = smh;
        sB++;

    }


    public T pop() throws StackEmptyException {
        if(top == null)
          throw new StackEmptyException("bad idea.");
        T temp = top.data;
        top = top.next;
        sB --;
        return temp;
    }


    public T peek() throws StackEmptyException {
        if(sB == 0)
          throw new StackEmptyException("bad idea.");
        return top.data;
    }


    public void makeEmpty() {
      top = null;
      sB = 0;
    }


    public String toString() {
      String Tsai = "";
      if(sB == 0){
        return Tsai;
      }else{
        StackNode<T> daSB = top;
        Tsai = daSB.data.toString();
        daSB = daSB.next;
        while(daSB != null){
          Tsai += " " + daSB.data.toString();
          daSB = daSB.next;
        }

      }
      return Tsai;
    }
}
