import static org.junit.jupiter.api.Assertions.*;

class countRemainingTest {

    @org.junit.jupiter.api.Test
    void countRemaining() {
        countRemaining cr = new countRemaining();
        assertEquals(-1,cr.countRemaining(""));
        System.out.println("==========Yashwanth Reddy Kikkuri == TEST ONE EXECUTED == FOR COUNT REMAINING ====== ");
        assertEquals(2,cr.countRemaining("10000"));
        System.out.println("==========Yashwanth Reddy Kikkuri == TEST TWO EXECUTED == FOR COUNT REMAINING ====== ");
        assertEquals(-1,cr.countRemaining("1000011"));
        System.out.println("==========Yashwanth Reddy Kikkuri == TEST THIRD EXECUTED == FOR COUNT REMAINING ====== ");
        assertEquals(3,cr.countRemaining("0000001"));
        System.out.println("==========Yashwanth Reddy Kikkuri == TEST FOURTH EXECUTED == FOR COUNT REMAINING ====== ");
        assertEquals(-1,cr.countRemaining(null));
        System.out.println("==========Yashwanth Reddy Kikkuri == TEST FIFTH EXECUTED == FOR COUNT REMAINING ====== ");
    }
}