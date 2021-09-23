package org.language.i;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

//（参数）-> 表达式
//（参数）-> 语句
//（参数）-> {语句}
interface B {
    int add(int a, int b); //lambda:（参数列表）=>返回值
}

public class LambdaTest {
    public static void main(String[] args) {
        B b1 = new B() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        //lamda:（参数）->返回值

        B b = (int c, int d) -> c + d;
        System.out.println(b.add(1, 2));

//Before Java 8：
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java 8,too much code for too little todo");
            }
        }).start();
//Java 8 way:
        new Thread(() -> System.out.println("ssdfdsfs")).start();
//        arr.map(x=>x+1)

//Before Java 8：
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Data and Time API");
        for (String feature : features) {
            System.out.println(feature);
        }

//In Java 8：
        List features1 = Arrays.asList("Lambdas", "Default Method", "Stream API", "Data And Time API");
        features.forEach(n -> System.out.println(n));
        features.forEach(System.out::println);

// Without lambda expressions:
        List<Integer> cosBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (Integer cost : cosBeforeTax) {
            double price = cost + .12 * cost;
            System.out.println(price);
        }
//with lambda expression:
        List<Double> costBeforeTax1 = Arrays.asList((double) 100, (double) 200, (double) 300, (double) 400, (double) 500);
        costBeforeTax1.stream().map((n) -> n + .12 * n).forEach(System.out::println);

//Old way
        List<Integer> costBeforeTax2 = Arrays.asList(100, 200, 300, 400, 500);
        double total = 0;
        for (Integer cost : costBeforeTax2) {
            double price = cost + .12 * cost;
            total = total + price;
        }
        System.out.println("Total : " + total);
//New way:
        List<Double> costBeforeTax3 = Arrays.asList((double) 100, (double) 200, (double) 300, (double) 400, (double) 500);
        double bill = costBeforeTax3.stream().map((cost) -> cost + .12 * cost).reduce((sum, cost) -> sum + cost).get();
        System.out.println("Total:" + bill);

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K", "Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(G7Countries);

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.printf("Original List:%s, Square Without duplicates:%s %n",numbers,distinct); //println报错

        List<Integer> primes=Arrays.asList(2,3,5,7,11,13,17,19,23,29);
        IntSummaryStatistics stats=primes.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println("Highest prime number in List:"+stats.getMax());
        System.out.println("Lowest prime number in List:"+stats.getMin());
        System.out.println("Sum of all prime numbers:"+stats.getSum());
        System.out.println("Average of all prime numbers:"+stats.getAverage());
    }
}
