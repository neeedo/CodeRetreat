package src;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class ExampleTest {

    @Test
    public void testTest() {
        assertThat("Frodo").isEqualTo("Frodo");
        assertThat("Frodo").isNotEqualTo("Sauron");
    }
}