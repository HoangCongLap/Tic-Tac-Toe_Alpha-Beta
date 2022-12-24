- Giới Thiệu:
 	+ Chúng tôi trình bày về việc xây dựng một chương trình chơi trò chơi tic-tac-toe với người đấu với máy sử dụng thuật toán cắt tỉa alpha-beta.
	+ Tic-tac-toe là một trò chơi phổ biến dùng viết trên bàn cờ có 9 ô, 3x3. Hai người chơi, người dùng ký hiệu O, máy dùng ký hiệu X, lần lượt điền ký hiệu của mình vào các ô. Người thắng là người có thể tạo được đầu tiên một dãy ba ký hiệu của mình, ngang dọc hay chéo đều được.
- Điều kiện: Hãy đảm bảo bạn đáp ứng các yêu cầu sau: 
	+ Bạn đã cài đặt "Intellij IDEA Community Edition 2021.32". 
	+ Bạn sử dụng Windows. 
	+ Được viết bằng ngôn ngữ java.
- Sử dụng:
	+ Bước 1:Sau khi bạn Download ZIP về máy, hãy mở nén.
	+ Bước 2:Bạn hãy mở ứng dụng "Intellij IDEA" ->vào "Open" -> mở Project.
	+ Bước 3: Setup SDK "1.8 Oracle OpenJDK version 1.80_45".
	+ Bước 4:Mở thư mục "TicTacToe" ->"Window" ->"run".
- Các Package:
   	 + ArtificialIntelligence
		* Algorithms: Sử dụng các thuật toán khác nhau để chơi Tic Tac Toe.
	  	   ** AlphaBetaPruning: Sử dụng thuật toán Cắt tỉa Alpha-Beta để chơi một nước đi trong trò chơi Tic Tac Toe.
		   ** AlphaBetaAdvanced: Sử dụng thuật toán Cắt tỉa Alpha-Beta để chơi một nước đi nhưng bao gồm độ sâu trong chức năng đánh giá.
	+ Image: Chứa hình ảnh của bàn cờ.
	+ TicTacToe:
		* Board:Quản lí bàn cờ.
		* Window:Chứa hàm chính.