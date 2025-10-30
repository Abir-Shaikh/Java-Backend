package Java8.LambdaExpression;

import java.util.function.Predicate;

public class Example2 {
    public static void main(String[] args) {
        MathOpn Sumopn = (a , b) -> a + b;
        MathOpn Subopn = (a , b) -> a - b;
        int res = Sumopn.opn(34,22);
        int res1 =Subopn.opn(123,113);
        System.out.println(res1);
        System.out.println(res);
    }
}


interface MathOpn {
    int opn(int a, int b);
}
