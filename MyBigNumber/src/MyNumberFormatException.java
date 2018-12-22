/**
 * Tác giả: Nguyễn Lê Thanh Bách.
 * DesCription.
 * Class MyBigNumber là lớp chứa 2 thuộc tính là 2 chuỗi đại diện cho 2 số.
 * Hàm sum là hàm để thực hiện phép cộng 2 chuỗi số.
 */
public class MyNumberFormatException extends NumberFormatException {
    
    int index;
    char key;
    String str;

    public MyNumberFormatException(char key, String str) {
        this.key = key;
        this.str = str;
        this.index = str.indexOf(key);
    }

    @Override
    public String toString() {
        return "ParameterFormatException[line:" + getStackTrace()[0].getLineNumber() + "][str:\"" + str + "\"][index:" + index + "][key:'" + key + "']";
    }
}
