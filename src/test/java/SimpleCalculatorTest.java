import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleCalculatorTest {

    @Test
    public void additionTest(){

        //Given
        double value1 = 10;
        char operator = '+';
        double value2 = 8;

        //When
        double result = SimpleCalculator.calculate(value1, operator,value2);

        //Then
        Assertions.assertEquals(18, result);
    }

    @Test
    public void substractionTest(){

        //Given
        double value1 = 10;
        char operator = '-';
        double value2 = 8;

        //When
        double result = SimpleCalculator.calculate(value1,operator,value2);

        //Then
        Assertions.assertEquals(2, result);
    }

    @Test
    public void multiplicationTest(){

        //Given
        double value1 = 10;
        char operator = '*';
        double value2 = 8;

        //When
        double result = SimpleCalculator.calculate(value1,operator,value2);

        //Then
        Assertions.assertEquals(80, result);
    }

    @Test
    public void divisionTest(){

        //Given
        double value1 = 10;
        char operator = '/';
        double value2 = 5;

        //When
        double result = SimpleCalculator.calculate(value1,operator,value2);

        //Then
        Assertions.assertEquals(2, result);
    }

    @Test
    public void divisionByZeroTest(){

        //Given
        double value1 = 10;
        char operator = '/';
        double value2 = 0;

        //When & Then
        assertThrows(IllegalArgumentException.class,() -> SimpleCalculator.calculate(value1,operator,value2));
    }

}
