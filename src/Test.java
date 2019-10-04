public class Test {
    public static void main(String[] args) {
        Category category1 = new Category("Słodycze ", "Słodycze bez cukru ");
        Category category2 = new Category("Przekąski słone ", "Paluszki ");
        Product product1 = new Product("Czekolada ", 3.50, "Czekolada gorzka z orzechami ", category1);
        Product product2 = new Product("Ciastka maślane ", 5.50, "Ciasteczka maślane bez cukru ", category1);
        Product product3 = new Product("Paluszki Lajkonik", 2.30, "Paluszki słone dla dzieci", category2);
        Product product4 = new Product("Płyn do naczyń", 4.80, "Płyn ekologiczny do naczyń", null);

        System.out.printf("Produkt: %s\nCena:  %2.2f zł\nOpis produktu: %s\nKategoria: %s\nOpis kategorii: %s\n\n",
                product1.name, product1.price, product1.description,
                product1.category.name, product1.category.description);

        System.out.printf("Produkt: %s\nCena:  %2.2f zł\nOpis produktu: %s\nKategoria: %s\nOpis kategorii: %s\n\n",
                product2.name, product2.price, product2.description,
                product2.category.name, product2.category.description);

        System.out.printf("Produkt: %s\nCena:  %2.2f zł\nOpis produktu: %s\nKategoria: %s\nOpis kategorii: %s\n\n",
                product3.name, product3.price, product3.description,
                product3.category.name, product3.category.description);

        SpecialOffer promocja1 = new SpecialOffer(product1, "Promocja zimowa", "od 20.05 do 12.06", 0.20);
        System.out.printf("Opis promocji: %s\nCzas promocji: %s\nRabat: %2.2f zł \n" +
                "Produkt: %s\nCena: %2.2f zł\nOpis produktu: %s\nKategoria: %s\nOpis kategorii: %s\n",
                promocja1.description, promocja1.time, product1.price * promocja1.discount,
                promocja1.promotion.name, promocja1.promotion.price, promocja1.promotion.description,
                promocja1.promotion.category.name, promocja1.promotion.category.description);
    }
}