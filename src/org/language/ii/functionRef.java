package org.language.ii;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class functionRef {

    public static class Car{
        public static Car creat(final Supplier<Car> supplier){
            return supplier.get();
        }
        public static void colllide(final Car car){
            System.out.println("Collided"+car.toString());
        }
        public void follow(final Car another){
            System.out.println("Following the"+another.toString());
        }
        public void repair(){
            System.out.println("Repaired"+this.toString());
        }
    }

    public static void main(String[] args) {
        //第一种方法引用是构造方法引用
        final Car car=Car.creat(Car::new);

        final List<Car> cars= Arrays.asList(car);
        //第二种方法引用是静态方法引用
        cars.forEach(Car::colllide);
//        cars.forEach((n)->System.out.println(n));
//        cars.forEach(System.out::print);
        //第三种方法引用是类实例方法引用
        cars.forEach(Car::repair);
//        cars.forEach((n)->n.repair());
        //最后一种方法引用是引用特殊类方法
        final Car police=Car.creat(Car::new);
        cars.forEach(police::follow);
    }
}
