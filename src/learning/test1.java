package learning;

public class test1 {
    public int show(){
        Calculable c=new Calculable(){

            @Override
            public int calculateInt(int a, int b) {
                return a+b;
            }
        };

        return c.calculateInt(1,2);

    }
}
