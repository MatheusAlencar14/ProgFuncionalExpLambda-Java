package application;

import entities.Product;
import util.ProductConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class ProgramProductCosumer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 90.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Teclado", 69.00));

        System.out.print("Digite a porcentagem de aumento: ");
        double percent = sc.nextDouble();

        Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * (1 + (percent / 100)));

        list.forEach(consumer);

        list.forEach(System.out::println);
    }
}
