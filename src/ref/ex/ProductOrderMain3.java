package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int orderCount = inputOrderCount(sc);

            ProductOrder[] orders = new ProductOrder[orderCount];

            inputOrders(sc, orders);

            printOrdersAndTotal(orders);
        }
    }

    // 주문 개수 입력
    static int inputOrderCount(Scanner sc) {
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        String line = sc.nextLine();
        return Integer.parseInt(line);
    }

    // 각 주문 정보 입력
    static void inputOrders(Scanner sc, ProductOrder[] orders) {
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격 : ");
            int price = Integer.parseInt(sc.nextLine());

            System.out.print("수량 : ");
            int quantity = Integer.parseInt(sc.nextLine());

            ProductOrder order = new ProductOrder();
            order.productName = productName;
            order.price = price;
            order.quantity = quantity;

            orders[i] = order;
        }
    }

    // 주문 정보 + 총 결제 금액 출력
    static void printOrdersAndTotal(ProductOrder[] orders) {
        int sum = 0;

        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName
                    + ", 가격: " + order.price
                    + ", 수량: " + order.quantity);

            sum += order.price * order.quantity;
        }

        System.out.println("총 결제 금액: " + sum);
    }
}
