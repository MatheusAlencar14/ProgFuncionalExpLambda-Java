package application;

import entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramProductService {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 90.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Teclado", 69.00));
        list.add(new Product("Monitor", 1199.00));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getPrice() <= 500);

        System.out.println("Soma: " + String.format("%.2f", sum));
    }
}

    /*Fazer um programa que, a partir de uma lista de produtos, calcule a
    soma dos preços somente dos produtos cujo nome começa com "T"*/