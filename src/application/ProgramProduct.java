package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgramProduct {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 90.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Teclado", 69.00));

        //Referência para método: (Nome da Classe::Nome do método)
        list.removeIf(Product::staticProductPredicate);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
