package application;

import entities.Product;
import util.ProductFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ProgramProductFunction {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 90.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Teclado", 69.00));

        List<String> names = list.stream().map(Product::staticProductFunction).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
