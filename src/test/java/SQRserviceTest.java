import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import ru.netology.packagess.sqr.sqrservices.SQRservice;


public class SQRserviceTest {

    @Test

    public void testServiceWhenResultEqualsTwo() {
        SQRservice service = new SQRservice();

        int expected = 5;
        int result = service.calcSqrService(500, 300);

        Assertions.assertEquals(expected, result);
    }

    @Test

    public void testServiceWhenResultEqualsNinetyEight() {
        SQRservice service = new SQRservice();

        int expected = 6;
        int result = service.calcSqrService(400, 200);

        Assertions.assertEquals(expected, result);
    }

    @Test

    public void testServiceWhenResultEqualsEleven() {
        SQRservice service = new SQRservice();

        int expected = 15;
        int result = service.calcSqrService(600, 100);

        Assertions.assertEquals(expected, result);

    }
}
