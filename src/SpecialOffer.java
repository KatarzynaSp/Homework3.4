public class SpecialOffer {
    Product productPromo;
    String promoDescription;
    String time;
    double discount;

    public SpecialOffer(Product proPromo, String descr, String t, double disc) {
        productPromo = proPromo;
        promoDescription = descr;
        time = t;
        discount = disc;
    }
}
