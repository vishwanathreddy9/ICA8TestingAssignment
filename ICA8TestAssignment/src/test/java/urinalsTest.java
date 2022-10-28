import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class urinalsTest {
    vacantUrinalsCount v = new vacantUrinalsCount();
    @Test
    void main() {
        System.out.println("===Vishwanath Reddy Yasa====");
        System.out.println("====FIRST TEST EXECUTED====");
        Assertions.assertEquals(-1, v.vacantUrinals("011"));
    }
}
