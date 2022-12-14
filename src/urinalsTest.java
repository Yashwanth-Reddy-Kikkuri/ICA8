import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

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
        assertEquals(-1,cr.countRemaining("aab"));
        System.out.println("==========Yashwanth Reddy Kikkuri == TEST SIXTH EXECUTED == FOR COUNT REMAINING ====== ");
    }

    @org.junit.jupiter.api.Test
    void readFile() throws IOException {
        readFile rf = new readFile();
        StringBuilder output = rf.readFromFile();
        assertNotNull(output);
        System.out.println("==========Yashwanth Reddy Kikkuri == TEST ONE EXECUTED == File Doesn't Exist ====== ");
//        assertEquals("",String.valueOf(output));
//        System.out.println("==========Yashwanth Reddy Kikkuri == TEST TWO EXECUTED == Empty file ====== ");
//        assertEquals("-1\n",String.valueOf(output));
//        System.out.println("==========Yashwanth Reddy Kikkuri == TEST THREE EXECUTED == Numbered Format Exceptions ====== ");
//        System.out.println("==========Yashwanth Reddy Kikkuri == TEST FOUR EXECUTED == IO Exception ====== ");
//        throw new IOException("File Not found exception");

    }

    @org.junit.jupiter.api.Test
    void writeFile() throws IOException {
        writeFile wf = new writeFile();
        assertEquals("rule4.txt",wf.fileName().getName());
        System.out.println("==========Yashwanth Reddy Kikkuri == TEST ONE EXECUTED == BadFileName ====== ");
        assertNotEquals("rule3.txt",wf.fileName().getName());
        System.out.println("==========Yashwanth Reddy Kikkuri == TEST TWO EXECUTED == File is duplicate ====== ");
//        System.out.println("==========Yashwanth Reddy Kikkuri == TEST THIRD EXECUTED == IO Exception ====== ");
//        throw new IOException("File Not Found Exception");
    }
}