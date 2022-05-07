package learning;

public class main {
    public static void main(String[] args) {
        Inter it = new Inter() {

            @Override
            public void show() {
                System.out.println("111");

            }
        };
        it.show();
    }
}


interface Inter{
    void show();
}