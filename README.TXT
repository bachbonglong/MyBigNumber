========================
BUILD OUTPUT DESCRIPTION
========================
1. 	Tải phần mềm tại link : https://drive.google.com/drive/u/0/folders/1fqlexiHY3aNM3JJ2rJJmyKW_sdQ-IJQL
========================
2. 	Khởi động chương trình:

	Cách 1: mở trực tiếp file MyBigNumber.jar của link phía trên:
		B1: Nhập số thứ nhất vào TextBox dưới chữ "Số A".
		B2: Nhập số thứ hai vào TextBox dưới chữ "Số B".
		B3: Nhấn nút TÍNH để thực hiện phép toán. Kết quả sẽ hiển thị ở TextBox dưới chữ "Kết quả" 
			và các bước thực hiện sẽ được in ra khung text "Bài giải" phía bên dưới.
		B4: Nhấn vào XÓA để reset toàn bộ ô nhập, ô kết quả và ô bài giải.
		
	Cách 2: mở cmd và dẫn đến thư mục phần mềm đã tải có chứa file jar và file sum.cmd:
		B1: Gõ lệnh sum <s1> <s2> 
			Trong đó
				s1 là số thứ nhất
				s2 là số thứ hai
		B4: Xem kết quả trực tiếp sau khi chương trình hiển thị.
========================
3. 	Xem các testcase tại: Các yêu cầu của khách hàng đã hoàn thành.xlsx
	Để kiểm tra kết quả testcase: 	mở cmd dẫn đến thư mục chứa file MyBigNumberTest.java
									gõ lệnh: javac MyBigNumBerTest.java
========================							
4.	Khi 2 chuỗi số nhập vào không hợp lệ sẽ phát sinh lỗi:
	Khi đó: 
		TextBox Kết quả hiển thị chữ ERROR.
		Khung text Bài giải hiển thị ký tự không hợp lệ.
	Các lưu ý tránh trường hợp phát sinh lỗi:
		- KHÔNG nhập chuỗi chứa ký tự CHỮ. Ví dụ: "123a", "A", "hai", ...
		- KHÔNG nhập chuỗi chứa ký tự ĐẶC BIỆT. Ví dụ: "12^3", "12+3", ...
		- CHỈ nhập ký số '0' đến '9'. KHÔNG nhập số ÂM, số THỰC, dấu '-' và dấu '.' được xem là ký tự ĐẶC BIỆT.
========================