public class Test {
    public static void main(String[] args) {
        Category category1 = new Category("Słodycze ", "Słodycze bez cukru ");
        Category category2 = new Category("Przekąski słone ", "Paluszki ");
        Product product1 = new Product("Czekolada ", 3.50, "Czekolada gorzka z orzechami ", category1);
        Product product2 = new Product("Ciastka maślane ", 5.50, "Ciasteczka maślane bez cukru ", category1);
        Product product3 = new Product("Paluszki Lajkonik", 2.30, "Paluszki słone dla dzieci", category2);
        Product product4 = new Product("Płyn do naczyń", 4.80, "Płyn ekologiczny do naczyń", null);

        System.out.printf("Produkt: %s\nCena:  %2.2f zł\nOpis produktu: %s\nKategoria: %s\nOpis kategorii: %s\n\n",
                product1.name, product1.price, product1.prodDescription,
                product1.category.catName, product1.category.catDescription);

        System.out.printf("Produkt: %s\nCena:  %2.2f zł\nOpis produktu: %s\nKategoria: %s\nOpis kategorii: %s\n\n",
                product2.name, product2.price, product2.prodDescription,
                product2.category.catName, product2.category.catDescription);

        System.out.printf("Produkt: %s\nCena:  %2.2f zł\nOpis produktu: %s\nKategoria: %s\nOpis kategorii: %s\n\n",
                product3.name, product3.price, product3.prodDescription,
                product3.category.catName, product3.category.catDescription);

        SpecialOffer productPromo1 = new SpecialOffer(product1, "Promocja zimowa", "od 20.05 do 12.06", 0.20);
        System.out.printf("Opis promocji: %s\nCzas promocji: %s\nRabat: %2.2f zł \n" +
                "Produkt: %s\nCena: %2.2f zł\nOpis produktu: %s\nKategoria: %s\nOpis kategorii: %s\n",
                productPromo1.promoDescription, productPromo1.time, product1.price * productPromo1.discount,
                productPromo1.productPromo.name, productPromo1.productPromo.price, productPromo1.productPromo.prodDescription,
                productPromo1.productPromo.category.catName, productPromo1.productPromo.category.catDescription);
    }
}