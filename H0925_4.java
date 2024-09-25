//class Order {
//    public void processOrder(String product, int quantity) {
//        if (product.equals("Book")) {
//            System.out.println("Processing book order");
//        } else if (product.equals("Pen")) {
//            System.out.println("Processing pen order");
//        }
//    }
//}

class Order {
    public void processOrder(String product, int quantity) {
        switch (product) {
            case "Book":
                processBookOrder();
                break;
            case "Pen":
                processPenOrder();
                break;
        }
    }

    private void processBookOrder() {
        System.out.println("Processing book order");
    }

    private void processPenOrder() {
        System.out.println("Processing pen order");
    }
}