B1:
- Vi phạm Liskov vì Bicycle extends từ Car nhưng ko thể thay thế Car
- Vi phạm Single responsibility vì Car vừa có logic của Car (print()),
  vừa có hành vi chung của các đối tượng phương tiện khác (run(), stop())
  -> Tạo một interface Vehicle chứa các method chung như run(), stop() và print(), các class con Car, Bicycle sẽ implements từ interface này


B2:
- Vi phạm SRP vì class Service vừa xử lý cart vừa send email
  -> Tạo 2 service khác nhau: CartService và MailService
- Vi phạm OCP vì nếu muốn thêm phương thức thanh toán mới thì phải sửa đổi class PayOrderService,
  hay muốn thêm phương thức xử lý mới trong cart thì phải sửa class Service
  -> Tạo interface PayOrder để dễ dàng mở rộng khi cần thiết
- Vi phạm DIP vì trong Service, method addBookToCart phụ thuộc trực tiếp vào Book