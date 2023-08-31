package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ProgramExercicioEmployee {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Digite o local do arquivo: ");
        String path = sc.nextLine();

        System.out.print("Digite o valor do salário: ");
        double sl = sc.nextDouble();

        Comparator<String> comp = (em1, em2) -> em1.toUpperCase().compareTo(em2.toUpperCase());

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> emails = list.stream()
                    .filter(x -> x.getSalary() > sl)
                    .map(p -> p.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());

            System.out.println("Email dos funcionários com " +
                    "salário maior que R$ " + String.format("%.2f", sl) + ": ");
            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x,y) -> x + y);

            System.out.println("A soma dos salários das pessoas cujo nome " +
                    "começa com a letra M é: R$ " + String.format("%.2f", sum));
        }catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}
