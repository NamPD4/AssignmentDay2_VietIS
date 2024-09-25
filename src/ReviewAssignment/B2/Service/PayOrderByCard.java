package ReviewAssignment.B2.Service;

import ReviewAssignment.B2.PayOrder;

public class PayOrderByCard implements PayOrder {

    @Override
    public void pay() {
        System.out.println("Thanh toan bang the thanh cong");
    }
}
