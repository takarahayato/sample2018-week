import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @org.junit.jupiter.api.Test
    void add() {
        Sample sample = new Sample();
        int result = sample.add(a:2, b:3);
        assertEquals(expected:5,result );
    }
}