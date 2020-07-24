package dongcode.stack;



public class Stack {

    Node top = null;
    int size = 0;

    public Stack() {
    }

    //Xem ptu tren cung:
    public int peek() {
        if (this.top == null) {
            throw new RuntimeException("Stack rong!");
        }
        return this.top.getItem();
    }

    // Them vao 1 ptu:
    public void push(int data) {
        this.top = new Node (data, this.top);
        size++;
    }

    // Lay ra 1 ptu:
    public int pop() {
        int n = this.top.getItem();
        if (this.top == null) {
            return -1;
        }

        this.top = this.top.getNext();
        size --;
        return n;
    }

    // isEmpty?
    boolean isEmpty() {
        if( size == 0 ) {
            return true;
        }
        else return false;
    }

    // So phan tu hien co:
    int numOfElement() {
        return size;
    }

    // in:
    void display() {
        int n = size;
        int[] ds = new int[n];
        System.out.print("Stack: ");
        for( int i=0; i<n; i++) {
            ds[i] = pop();
        }
        for( int i=n-1; i>=0; i--) {
            System.out.print(ds[i] + " ");
            push(ds[i]);
        }
    }
}

