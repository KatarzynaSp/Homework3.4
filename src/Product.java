public class Product {
    String name;
    double price;
    String description;
    Category category;

    public Product(String n, double pr, String descr, Category categ) {
        name = n;
        price = pr;
        description = descr;
        category = categ;
    }
}
