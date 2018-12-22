import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tác giả: Nguyễn Lê Thanh Bách.
 * DesCription.
 * Lớp MyBigNumberTest là hàm Unit Testing của lớp MyBigNumber.
 */
public class MyBigNumberTest implements IReceiver{

    /**
     * Test of sum method, of class MyBigNumber.
     * Testcase 1: Chuỗi 1 chứa kí tự chữ, chuỗi 2 thỏa điều kiện 
     */
    @Test (expected = MyNumberFormatException.class)
    public void testSum1() {
        try {
        System.out.println("\n#Testcase 1:");
        String s1 = "A";
        String s2 = "0";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
        //assertEquals(expResult, result);
        } catch (MyNumberFormatException ex) {
            
        }
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 2: Chuỗi 1 thỏa điều kiện, chuỗi 2 chứa kí tự chữ
     */
    @Test (expected = MyNumberFormatException.class)
    public void testSum2() {
        System.out.println("\n#Testcase 2:");
        String s1 = "0";
        String s2 = "B";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
        //assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 3: Chuỗi 1 và chuỗi 2 chứa kí tự chữ
     */
    @Test (expected = MyNumberFormatException.class)
    public void testSum3() {
        System.out.println("\n#Testcase 3:");
        String s1 = "C";
        String s2 = "D";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
        //assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 4: Chuỗi 1 chứa kí tự đặc biệt, chuỗi 2 thỏa điều kiện
     */
    @Test (expected = MyNumberFormatException.class)
    public void testSum4() {
        System.out.println("\n#Testcase 4:");
        String s1 = "10.";
        String s2 = "10";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
        //assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 5: Chuỗi 1 thỏa điều kiện, chuỗi 2 chứa kí tự đặc biệt
     */
    @Test (expected = MyNumberFormatException.class)
    public void testSum5() {
        System.out.println("\n#Testcase 5:");
        String s1 = "10";
        String s2 = "10#";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
        //assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 6: Chuỗi 1 và chuỗi 2 chứa kí tự đặc biệt
     */
    @Test (expected = MyNumberFormatException.class)
    public void testSum6() {
        System.out.println("\n#Testcase 6:");
        String s1 = "10.";
        String s2 = "10#";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
        //assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 7: Chuỗi 1 là số âm, chuỗi 2 thỏa điều kiện
     */
    @Test (expected = MyNumberFormatException.class)
    public void testSum7() {
        System.out.println("\n#Testcase 7:");
        String s1 = "-10";
        String s2 = "10";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
        //assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 8: Chuỗi 1 thỏa điều kiện, chuỗi 2 là số âm
     */
    @Test (expected = MyNumberFormatException.class)
    public void testSum8() {
        System.out.println("\n#Testcase 8:");
        String s1 = "-10";
        String s2 = "10";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
        //assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 9: Chuỗi 1 và chuỗi 2 là số âm
     */
    @Test (expected = MyNumberFormatException.class)
    public void testSum9() {
        System.out.println("\n#Testcase 9:");
        String s1 = "-10";
        String s2 = "10";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
        //assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 10: Chuỗi 1 dư ký số '0' ở đầu
     */
    @Test
    public void testSum10() {
        System.out.println("\n#Testcase 10:");
        String s1 = "0123";
        String s2 = "456";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "579";
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 11: Chuỗi 2 dư ký số '0' ở đầu
     */
    @Test
    public void testSum11() {
        System.out.println("\n#Testcase 11:");
        String s1 = "123";
        String s2 = "00456";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "579";
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 12: Chuỗi 1 và chuỗi 2 dư ký số '0' ở đầu
     */
    @Test
    public void testSum12() {
        System.out.println("\n#Testcase 12:");
        String s1 = "0123";
        String s2 = "000456";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "579";
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 13: Chuỗi 1 rỗng và chuỗi 2 thỏa điều kiện
     */
    @Test
    public void testSum13() {
        System.out.println("\n#Testcase 13:");
        String s1 = "";
        String s2 = "123";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "123";
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        assertEquals(expResult, result);
    }

    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 14: Chuỗi 1 thỏa điều kiện và chuỗi 2 rỗng
     */
    @Test
    public void testSum14() {
        System.out.println("\n#Testcase 14:");
        String s1 = "123";
        String s2 = "";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "123";
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 14: Chuỗi 1 và chuỗi 2 rỗng
     */
    @Test
    public void testSum15() {
        System.out.println("\n#Testcase 14:");
        String s1 = "";
        String s2 = "";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "0";
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 16: Chuỗi 1 và chuỗi 2 thỏa điều kiện
     */
    @Test
    public void testSum16() {
        System.out.println("\n#Testcase 16:");
        String s1 = "999";
        String s2 = "1";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "1000";
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 17: Chuỗi 1 và chuỗi 2 thỏa điều kiện
     */
    @Test
    public void testSum17() {
        System.out.println("\n#Testcase 17:");
        String s1 = "456";
        String s2 = "789";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "1245";
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 18: Chuỗi 1 và chuỗi 2 thỏa điều kiện
     */
    @Test
    public void testSum18() {
        System.out.println("\n#Testcase 18:");
        String s1 = "1";
        String s2 = "9999";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "10000";
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 19: Chuỗi 1 và chuỗi 2 thỏa điều kiện
     */
    @Test
    public void testSum19() {
        System.out.println("\n#Testcase 19:");
        String s1 = "1100";
        String s2 = "9988";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "11088";
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 20: Chuỗi 1 và chuỗi 2 thỏa điều kiện
     */
    @Test
    public void testSum20() {
        System.out.println("\n#Testcase 20:");
        String s1 = "442";
        String s2 = "753";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "1195";
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        assertEquals(expResult, result);
    }

    @Override
    public void send(String msg) {
        System.out.println(msg);
    }
}
