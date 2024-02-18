import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TimeZoneConverterTest {

    @Test
    public void testConvertTime() {
        // Sample test data
        MainApp mainApp = new MainApp("America/New_York", System.currentTimeMillis(), "America/Los_Angeles");
        
        // Instantiate TimeZoneConverter
        TimeZoneConverter timeZoneConverter = new TimeZoneConverter();

        // Perform the conversion
        String convertedTime = timeZoneConverter.convertTime(mainApp);

        // Validate the result (you may need to adjust the expected result based on the actual input)
        assertNotNull(convertedTime);
        System.out.println("Converted time: " + convertedTime);
    }
}
