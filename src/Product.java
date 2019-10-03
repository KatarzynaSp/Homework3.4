public class Product {
    String name;
    double price;
    String prodDescription;
    Category category;

    public Product(String n, double pr, String prodDescr, Category cat) {
        name = n;
        price = pr;
        prodDescription = prodDescr;
        category = cat;
    }
}
