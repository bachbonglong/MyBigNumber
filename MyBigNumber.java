class MyBigNumber {                                      // class tính tổng;
	public static String sum(String s1, String s2) {     // hàm sum dùng để tính tổng truyền vào 2 tham số là chuỗi;
		  String finalResult = "";                       // chuỗi kết quả trả về của hàm sum;
          int len1 = s1.length();                       // lấy độ dài của chuỗi s1;
          int len2 = s2.length();                       // lấy độ dài của chuỗi s2;
          int maxlen = (len1 > len2) ? len1 : len2;  // so sánh 2 chuỗi để tìm ra max length;
          int nho = 0;                                   // biến dùng để lưu số nhớ;
		  int s;                                         // biến dùng để cộng 2 kí tự trong chuỗi;
		  int index1;                                   // biến dùng để lấy vị trí kí tự trong chuỗi s1;
		  int index2;                                   // biến dùng để lấy vị trí kí tự trong chuỗi s2;
		  char c1;                                       // biến dùng để lấy kí tự tại vị trí indexs1 chuỗi s1;
          char c2;                                       // biến dùng để lấy kí tự tại ví trí indexs2 chuỗi s2;		
		

  	    for	(int i = 0; i < maxlen; i++) {               // vòng lặp chạy từ 0 đến max length ;
		  index1 = len1 - i - 1;                       // vì length s1 chạy từ 1 mà i chạy từ 0 nên phải trừ cho 1 thì ta sẽ
		  index2 = len2 - i - 1;                       // lấy được vị trí cuối cùng của chuỗi s1;
		
		    if(index1 >= 0) {
			  c1 = s1.charAt(index1);                   // lấy kí tự ở vị trí indexs1 trong chuỗi s1;
		    }else {
              c1 = '0';                                  // vị trí bé hơn 0 thì kí tự ở đó sẽ là 0;
		    }		
		    if(index2 >= 0) {
			  c2 = s2.charAt(index2);
		    }else {
              c2 = '0';
		    }	
		  s = c1 - '0' + c2 - '0' + nho;                  // cộng 2 số nguyên vừa chuyển đổi được với biến nhớ nếu có;
		  
		  finalResult = (s % 10) + finalResult;         // gán finalResult bằng phần dư chia cho 10 của s+finalResult
		                                                // gán vào bên trái biến finalResult;
		  nho = s / 10;                                 // biến nhớ sẽ lấy phần nguyên chia cho 10;
		}                                               // kết thúc vòng lặp for
		    if(nho > 0) {                               // đến lúc này nếu biến nhớ lớn hơn 0 thì cộng vào phía trước 
		      finalResult = nho + finalResult;          // finalResult;
		    }
		return finalResult;                             // hàm String phải có tham số trả về;
	}
	/*
	public static void main(String[] args){             //hàm test sum(s1,s2)
	String s1="1234";
	String s2="45";
	String sum1="";
	sum1=sum(s1,s2);
	System.out.print(sum1);
    }
	*/
}
		
		
		  
		
	
	