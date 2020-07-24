package dongcode.stack;

public class TestStack {

    public static void main(String[] args) {

        Stack st = new Stack();

        if (st.isEmpty()) {
            System.out.println("Stack rong! Them ptu da ");
            st.push(1);
            System.out.println("Da them 1 ");
            st.push(2);
            System.out.println("Da them 2 ");
            st.push(5);
            System.out.println("Da them 5 ");
        }
        System.out.println("--------------------");
        System.out.println("So ptu: " + st.numOfElement());

        st.display();
    }
}
