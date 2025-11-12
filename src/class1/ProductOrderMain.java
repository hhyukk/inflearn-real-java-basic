package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        int sum=0;
        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;

        ProductOrder[] list = new ProductOrder[]{tofu, kimchi, coke};

        for (ProductOrder productOrder : list) {
            sum+= productOrder.price* productOrder.quantity;
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
        }
        System.out.println("총 결제 금액: "+sum);


    }
}
