import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Tác giả: Nguyễn Lê Thanh Bách.
 * DesCription.
 * Class MyBigNumber là lớp chứa hàm sum là hàm để thực hiện phép cộng 2 chuỗi số.
 */
public class MyBigNumber {
 
    private final IReceiver ireceiver;
    
    /*
     * 
     * @param ireceiver 
     */
    public MyBigNumber(final IReceiver ireceiver) {
        this.ireceiver = ireceiver;
    }
    
    /**
     * Hàm sum trả về giá trị tổng 2 số tương ứng với 2 tham số dưới dạng chuỗi.
     * Xuất ra màn hình các bước tính tổng.
     * @param str1 chuỗi số thứ 1 chỉ bao gồm các ký số từ '0' đến '9'.
     * @param str2 chuỗi số thứ 2 chỉ bao gồm các ký số từ '0' đến '9'.
     * @return chuỗi số thể hiện giá trị tổng của s1 và s2.
     */
    public String sum(final String str1, final String str2) {      
        
        // gán giá trị tham số vào s1 s2 và mặc định giá trị rỗng hoặc null là "0"
        String s1 = (str1 == null || str1.trim().equals("") ? "0" : str1);
        String s2 = (str2 == null || str2.trim().equals("") ? "0" : str2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm"); // class định dạng DateTime   
        String calSteps = ""; // mỗi phần tử chứa chuỗi biểu diễn 1 bước tính tổng
        String str; // tổng hợp chuỗi biểu diễn qua từng bước tính
        String finalResult = ""; // chuỗi kết quả trả về của hàm
        final int len1; // độ dài của chuỗi s1
        final int len2;  // độ dài của chuỗi s2
        final int maxlen; // độ dài lớn nhất của 2 chuỗi
        int remember = 0; // giá trị nhớ
        int s; // tổng từng cặp kí số trong chuỗi
        int index1; // vị trí kí tự trong chuỗi s1
        int index2; // vị trí kí tự trong chuỗi s2
        char value1; // kí số tại index1
        char value2; // kí số tại index2
        
        // kiểm tra tính hợp lệ của tham số s1
        if (s1.startsWith("-") && s1.length() > 1) {
            for (int i = 1; i < s1.length(); i++) {
                if (!Character.toString(s1.charAt(i)).matches("[0-9]+")) {
                    this.ireceiver.send("Lỗi ở tham số s1 tại vị trí " + i + ": " + s1.charAt(i));
                    throw new NumberFormatException("Lỗi ở tham số s1 tại vị trí " + i + ": " + s1.charAt(i));
                }
            }
            this.ireceiver.send("Chưa hỗ trợ số âm:" + s1);
            throw new NumberFormatException("Chưa hỗ trợ số âm s1: " + s1);
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (!Character.toString(s1.charAt(i)).matches("[0-9]+")) {
                    this.ireceiver.send("Số " + s1 + " chứa ký tự không hợp lệ: " + s1.charAt(i));
                    throw new NumberFormatException("Lỗi ở tham số s1 tại vị trí " + i + ": " + s1.charAt(i));
                }
            }
        } 
        
        // kiểm tra tính hợp lệ của tham số s2
        if (s2.startsWith("-") && s2.length() > 1) {
            for (int i = 1; i < s2.length(); i++) {
                if (!Character.toString(s2.charAt(i)).matches("[0-9]+")) {
                    this.ireceiver.send("Số " + s2 + " chứa ký tự không hợp lệ: " + s2.charAt(i));
                    throw new NumberFormatException("Lỗi ở tham số s2 tại vị trí " + i + ": " + s2.charAt(i));
                }
            }
            this.ireceiver.send("Chưa hỗ trợ số âm: " + s2);
            throw new NumberFormatException("Chưa hỗ trợ số âm s2: " + s2);
        } else {
            for (int i = 0; i < s2.length(); i++) {
                if (!Character.toString(s2.charAt(i)).matches("[0-9]+")) {
                    this.ireceiver.send("Lỗi ở tham số s2 tại vị trí " + i + ": " + s2.charAt(i));
                    throw new NumberFormatException("Lỗi ở tham số s2 tại vị trí " + i + ": " + s2.charAt(i));
                }
            }
        } 
        
        // xóa các ký số '0' dư ở đầu chuỗi số s1
        while (s1.startsWith("0") && s1.length() > 1) {
            s1 = s1.substring(1);
        }
        
        // xóa các ký số '0' dư ở đầu chuỗi số s2
        while (s2.startsWith("0") && s2.length() > 1) {
            s2 = s2.substring(1);
        }
        
        len1 = s1.length(); 
        len2 = s2.length(); 
        maxlen = (len1 > len2) ? len1 : len2;
        
        for (int i = 0; i < maxlen; i++) {
            index1 = len1 - i - 1; // index1 duyệt từ phải sang trái chuỗi s1
            index2 = len2 - i - 1; // index2 duyệt từ phải sang trái chuỗi s2
            str = "";
            if (index1 >= 0) { // value1 lưu kí số tại index1, bằng '0' nếu index vượt ngoài hàng của số
                value1 = s1.charAt(index1);     
            } else {
                value1 = '0';
            }
            if (index2 >= 0) { // value2 lưu kí số tại index2, bằng '0' nếu index vượt ngoài hàng của số
                value2 = s2.charAt(index2);
            } else {
                value2 = '0';
            }
            s = value1 - '0' + value2 - '0' + remember; // tính tổng 2 giá trị số và biến nhớ

            finalResult = (s % 10) + finalResult; // gộp phần Ghi của tổng s vào đầu chuỗi finalResult
            str += "Bước " + (i + 1) // gán giá trị diễn giải bước tính
                    + ": Lấy " + value1 + " + " + value2
                    + ((remember > 0) ? " Thêm " + remember + " " : "\t ");
                                                        
            remember = s / 10; // gán giá trị Nhớ của tổng s vào biến nhớ;
            
            if (i == maxlen - 1) { // Phân biệt cách diễn giải của bước cuối cùng (không cần tách giá trị nhớ) 
                finalResult = (remember > 0) ? remember + finalResult : finalResult;  
                str += "Được " + s + ((s / 10 > 0) ? " " : "\t ") 
                         + "Ghi " + s + "\t\t(" + dtf.format(LocalDateTime.now()) + ")";
            } else {
                str += "Được " + s + ((s / 10 > 0) ? " " : "\t ") 
                    + "Ghi " + (s % 10) + "  Nhớ " + remember + "\t(" + dtf.format(LocalDateTime.now()) + ")";
            }
            
            calSteps += (str + "\n"); // thêm chuỗi diễn giải vào mảng
        } 
        calSteps += "Kết quả: " + s1 + " + " + s2 + " = " + finalResult;
        show(calSteps);
        
        return finalResult;
    }
    
    /**
     * Hàm xuất các bước tính ra màn hình.
     * @param msg chứa các phần tử là chuỗi diễn giải mỗi bước tính.
     */
    public void show(final String msg) {
        
        ireceiver.send(msg);
    }
}