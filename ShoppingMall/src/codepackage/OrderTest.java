package codepackage;

public class OrderTest {

	public static void main(String[] args) {
		Order order1 = new Order();
		order1.orderNum = 20180312001L;
		order1.id = "abc123";
		order1.name = "홍길순";
		order1.orderDate = "2018년 3월 12일";
		order1.packNum = "PD0345-12";
		order1.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : "+order1.orderNum);
		System.out.println("주문자 아이디 : "+order1.id);
		System.out.println("주문 날짜 : "+order1.orderDate);
		System.out.println("주문자 이름 : "+order1.name);
		System.out.println("주문 상품 번호 : "+order1.packNum);
		System.out.println("배송 주소 : "+order1.address);
	}

}
