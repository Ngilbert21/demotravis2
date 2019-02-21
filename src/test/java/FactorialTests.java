import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FactorialTests {

    @Test
            public void Test1(){
            assertEquals(1,Factorial.factorial(0));


    }

    @Test
            public void Test2(){
            assertEquals(2, Factorial.factorial(2));
    }

    @Test
            public void Test3(){
            assertEquals(3628800, Factorial.factorial(10));
    }

    @Test
            public void Test4Failure(){
            assertEquals(23, Factorial.factorial(5));
    }

}
