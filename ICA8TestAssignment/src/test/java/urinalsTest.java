import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class urinalsTest {
    vacantUrinalsCount v = new vacantUrinalsCount();
    @Test
    void main() {
        System.out.println("===Vishwanath Reddy Yasa====");
        System.out.println("====FIRST TEST EXECUTED====");
        Assertions.assertEquals(-1, v.vacantUrinals("011"));
        System.out.println("====SECOND TEST EXECUTED====");
        Assertions.assertEquals(1, v.vacantUrinals("0001"));
        System.out.println("====THIRD TEST EXECUTED====");
        Assertions.assertEquals(2, v.vacantUrinals("0000"));
        System.out.println("====FOURTH TEST EXECUTED====");
        Assertions.assertEquals(1, v.vacantUrinals("10001"));
    }
}
