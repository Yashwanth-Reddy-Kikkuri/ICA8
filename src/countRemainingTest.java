import static org.junit.jupiter.api.Assertions.*;

class countRemainingTest {

    @org.junit.jupiter.api.Test
    void countRemaining() {
        countRemaining cr = new countRemaining();
        assertEquals(-1,cr.countRemaining(""));
    }
}