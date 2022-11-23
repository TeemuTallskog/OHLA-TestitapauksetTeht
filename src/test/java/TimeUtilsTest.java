
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeUtilsTest {
    @ParameterizedTest(name="{0} Sekuntia aikana {1}")
    @CsvSource({ "0, 0:00:00", "1, 0:00:01", "10, 0:00:10", "120, 0:02:00", "121, 0:02:01",
            "131, 0:02:11", "2600, 0:43:20", "30000, 8:20:00", "30001, 8:20:01", "30010, 8:20:10", "30011, 8:20:11",
            "3600, 1:00:00", "3601, 1:00:01", "3610, 1:00:10", "3660, 1:01:00", "4200, 1:10:00", "4210, 1:10:10", "4271, 1:11:11",
            "59, 0:00:59", "3540, 0:59:00", "32000, -1", "-1, -1" })
    public void testSecToTime(int luku, String tulos) {
        String time = TimeUtils.secToTime(luku);
        String print = luku + "sec =/= " + time;
        assertEquals(tulos, time, print);
    }

}
