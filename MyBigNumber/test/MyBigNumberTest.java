import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * Tác giả: Nguyễn Lê Thanh Bách.
 * DesCription.
 * Lớp MyBigNumberTest là hàm Unit Testing của lớp MyBigNumber.
 */
public class MyBigNumberTest implements IReceiver{

    @Rule
    public ExpectedException expected = ExpectedException.none();
    
    /**
     * Test of sum method, of class MyBigNumber.
     * Testcase 1: Chuỗi 1 chứa kí tự chữ, chuỗi 2 thỏa điều kiện 
     */
    @Test
    public void testSum1() {
        System.out.println("\n#Testcase 1:");
        String s1 = "100A";
        String s2 = "110";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        expected.expect(NumberFormatException.class);
        expected.expectMessage("Lỗi ở tham số s1 tại vị trí 3: A");
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 2: Chuỗi 1 thỏa điều kiện, chuỗi 2 chứa kí tự chữ
     */
    @Test
    public void testSum2() {
        System.out.println("\n#Testcase 2:");
        String s1 = "190";
        String s2 = "21b";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        expected.expect(NumberFormatException.class);
        expected.expectMessage("Lỗi ở tham số s2 tại vị trí 2: b");
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 3: Chuỗi 1 và chuỗi 2 chứa kí tự chữ
     */
    @Test
    public void testSum3() {
        System.out.println("\n#Testcase 3:");
        String s1 = "1210c";
        String s2 = "1996D";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        expected.expect(NumberFormatException.class);
        expected.expectMessage("Lỗi ở tham số s1 tại vị trí 4: c");
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 4: Chuỗi 1 chứa kí tự đặc biệt, chuỗi 2 thỏa điều kiện
     */
    @Test
    public void testSum4() {
        System.out.println("\n#Testcase 4:");
        String s1 = "10.";
        String s2 = "10";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        expected.expect(NumberFormatException.class);
        expected.expectMessage("Lỗi ở tham số s1 tại vị trí 2: .");
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 5: Chuỗi 1 thỏa điều kiện, chuỗi 2 chứa kí tự đặc biệt
     */
    @Test
    public void testSum5() {
        System.out.println("\n#Testcase 5:");
        String s1 = "10";
        String s2 = "10#";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        expected.expect(NumberFormatException.class);
        expected.expectMessage("Lỗi ở tham số s2 tại vị trí 2: #");
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 6: Chuỗi 1 và chuỗi 2 chứa kí tự đặc biệt
     */
    @Test
    public void testSum6() {
        System.out.println("\n#Testcase 6:");
        String s1 = "10.";
        String s2 = "10#";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        expected.expect(NumberFormatException.class);
        expected.expectMessage("Lỗi ở tham số s1 tại vị trí 2: .");
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 7: Chuỗi 1 là số âm, chuỗi 2 thỏa điều kiện
     */
    @Test
    public void testSum7() {
        System.out.println("\n#Testcase 7:");
        String s1 = "-109";
        String s2 = "100";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        expected.expect(NumberFormatException.class);
        expected.expectMessage("Chưa hỗ trợ số âm s1: -109");
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 8: Chuỗi 1 thỏa điều kiện, chuỗi 2 là số âm
     */
    @Test
    public void testSum8() {
        System.out.println("\n#Testcase 8:");
        String s1 = "120";
        String s2 = "-1990";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        expected.expect(NumberFormatException.class);
        expected.expectMessage("Chưa hỗ trợ số âm s2: -1990");
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 9: Chuỗi 1 và chuỗi 2 là số âm
     */
    @Test
    public void testSum9() {
        System.out.println("\n#Testcase 9:");
        String s1 = "-110";
        String s2 = "-210";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        expected.expect(NumberFormatException.class);
        expected.expectMessage("Chưa hỗ trợ số âm s1: -110");
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
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
     * Testcase 15: Chuỗi 1 và chuỗi 2 rỗng
     */
    @Test
    public void testSum15() {
        System.out.println("\n#Testcase 15:");
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
     * Testcase 16: Chuỗi 1 null và chuỗi 2 thỏa điều kiện
     */
    @Test
    public void testSum16() {
        System.out.println("\n#Testcase 16:");
        String s1 = null;
        String s2 = "100";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "100";
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 17: Chuỗi 1 thỏa điều kiện và chuỗi 2 null
     */
    @Test
    public void testSum17() {
        System.out.println("\n#Testcase 17:");
        String s1 = "400";
        String s2 = null;
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "400";
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        assertEquals(expResult, result);
    }
    
    /*
     * Test of sum method, of class MyBigNumber.
     * Testcase 18: Chuỗi 1 và chuỗi 2 null
     */
    @Test
    public void testSum18() {
        System.out.println("\n#Testcase 18:");
        String s1 = null;
        String s2 = null;
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        String expResult = "0";
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
    
    /**
     * Test of sum method, of class MyBigNumber.
     * Testcase 21: Chuỗi 1 chứa kí tự chữ và dấu '-' ở đầu chuỗi, chuỗi 2 thỏa điều kiện 
     */
    @Test
    public void testSum21() {
        System.out.println("\n#Testcase 21:");
        String s1 = "-1420a";
        String s2 = "110";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        expected.expect(NumberFormatException.class);
        expected.expectMessage("Lỗi ở tham số s1 tại vị trí 5: a");
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
    }
    
    /**
     * Test of sum method, of class MyBigNumber.
     * Testcase 22: Chuỗi 1 thỏa điều kiện, chuỗi 2 chứa kí tự chữ và dấu '-' ở đầu chuỗi
     */
    @Test
    public void testSum22() {
        System.out.println("\n#Testcase 22:");
        String s1 = "1420";
        String s2 = "-11b0";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        expected.expect(NumberFormatException.class);
        expected.expectMessage("Lỗi ở tham số s2 tại vị trí 3: b");
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
    }
    
    
    /**
     * Test of sum method, of class MyBigNumber.
     * Testcase 23: Chuỗi 1 = "-", chuỗi 2 thỏa điều kiện 
     */
    @Test
    public void testSum23() {
        System.out.println("\n#Testcase 23:");
        String s1 = "-";
        String s2 = "21";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        expected.expect(NumberFormatException.class);
        expected.expectMessage("Lỗi ở tham số s1 tại vị trí 0: -");
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
    }
    
    /**
     * Test of sum method, of class MyBigNumber.
     * Testcase 24: Chuỗi 1 thỏa điều kiện, chuỗi 2 = "-"
     */
    @Test
    public void testSum24() {
        System.out.println("\n#Testcase 24:");
        String s1 = "124";
        String s2 = "-";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        expected.expect(NumberFormatException.class);
        expected.expectMessage("Lỗi ở tham số s2 tại vị trí 0: -");
        MyBigNumber instance = new MyBigNumber(this);
        instance.sum(s1, s2);
    }

    @Override
    public void send(String msg) {
        System.out.println(msg);
    }
}
