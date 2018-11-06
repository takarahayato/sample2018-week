import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void add() {
        main sample = new main();
        int result = sample.add(2, 3);
        assertEquals(5,result );
    }
}