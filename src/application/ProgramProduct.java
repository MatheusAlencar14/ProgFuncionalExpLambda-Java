package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ProgramProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 90.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Teclado", 69.00));

        System.out.print("Digite o valor mínimo: ");
        int min = sc.nextInt();

        //Expressão Lambda: traz a declaração para a mesma linha
        list.removeIf(p -> p.getPrice() <= min);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
