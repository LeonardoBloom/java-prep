public class Main {

    public static void main(String[] args) {

        /*
        generics = a concept where you can write a class, interface, or method
                   that is compatible with different data types.
                   <T> type parameter (placeholder that gets replaced with the actual type)
                   <Integer> type argument (specifies the type);
         */

        Box<String> box = new Box<>();

        box.setItem("banana");

        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("GTA VI", 99.99);
        Product<String, Integer> product2 = new Product<>("GTA V", 59);

        System.out.println(product1.getItem() + " is priced at " + product1.getPrice() + " AWARE!");
        System.out.println(product2.getItem() + " is priced at " + product2.getPrice() + " YES!");

    }
}
