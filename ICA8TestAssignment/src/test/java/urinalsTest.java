import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class urinalsTest {
    vacantUrinalsCount v = new vacantUrinalsCount();
    @Test
    void return_Negative_if_wrong_input() {
        System.out.println("=== Vishwanath Reddy Yasa ====");
        System.out.println("====FIRST TEST EXECUTED====");
        Assertions.assertEquals(-1, v.vacantUrinals("011"));
    }
    @Test
    void return_One_if_one_vacant_space() {
        System.out.println("====SECOND TEST EXECUTED====");
        Assertions.assertEquals(1, v.vacantUrinals("0001"));
    }
    @Test
    void return_two_if_two_vacant_space() {
        System.out.println("====THIRD TEST EXECUTED====");
        Assertions.assertEquals(2, v.vacantUrinals("0000"));
    }
    @Test
    void return_One_if_one_vacant_space_in_middle() {
        System.out.println("====FOURTH TEST EXECUTED====");
        Assertions.assertEquals(1, v.vacantUrinals("10001"));
    }
    @Test
    void return_zero_if_no_vacant_space() {
        System.out.println("====FIFTH TEST EXECUTED====");
        Assertions.assertEquals(0, v.vacantUrinals("1001"));

    }
    @Test
    void return_Three_if_three_vacant_space() {
        System.out.println("====SIXTH TEST EXECUTED====");
        Assertions.assertEquals(3, v.vacantUrinals("00000"));

    }
    @Test
    void return_one_if_one_place_filled_and_one_vacant_space(){
        System.out.println("====SEVENTH TEST EXECUTED====");
        Assertions.assertEquals(1, v.vacantUrinals("01000"));

    }
}
