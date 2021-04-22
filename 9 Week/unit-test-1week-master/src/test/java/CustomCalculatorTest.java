import org.junit.Test;

import static org.junit.Assert. *;

public class CustomCalculatorTest {
    private CustomCalculator customCalculator;

    // 더하기 테스트를 진행합니다.
    @Test
    public void addTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 10);
        assertTrue(result==20);
    }

    // 빼기 테스트를 진행합니다.
    @Test
    public void subtractTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10, 10);
        assertTrue(result==0);
    }

    // 곱하기 테스트를 진행합니다.
    @Test
    public void multiplyTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(10, 10);
        assertTrue(result==100);
    }

    // 나누기 테스트를 진행합니다.
    @Test
    public void divideTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(10, 10);
        assertTrue(result==1);
    }

}