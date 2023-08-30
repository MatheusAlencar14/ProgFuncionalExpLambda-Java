package application;

import entities.Product;
import util.ProductConsumer;

import java.util.ArrayList;
import java.util.List;

public class ProgramProductCosumer {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 90.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Teclado", 69.00));

        list.forEach(new ProductConsumer());

        for (Product p : list) {
            System.out.println(p);
        }
        System.out.println();

        //Forma de usar o forEach para imprimir uma lista
        list.forEach(System.out::println);
    }
}