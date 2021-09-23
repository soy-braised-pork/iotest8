package org.language.i;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        //创建Optional实例，也可以通过方法返回值得到
        Optional<String> name=Optional.of("Sanaulla");

        //创建没有值的Optional实例，例如值为“null”
        Optional empty=Optional.ofNullable(null);

        //isPresent方法用来检查Optional实例是否有值
        if (name.isPresent()){
            //调用get()返回Optional值
            System.out.println(name.get());
        }try {
            //在Optional实例上调用get()抛出NoSuchElementExcepion
            System.out.println(empty.get());
        }catch (Exception e){
            e.printStackTrace();
        }
        //ifPresent方法接收lambda表达式参数
        //如果Optional值不为空，lambda表达式会处理并在其上执行操作
        name.ifPresent((value)->{
            System.out.println("The length of the value"+value+"is:"+value.length());
        });
        //如果有值orElse方法会返回Optional实例，否则返回传入的错误信息
        System.out.println(empty.orElse("There is no value present!"));
        System.out.println(name.orElse("There is some value!"));
        //orElseGet与orElse类似，区别在于传入的默认值
        //orElseGet接受lambda表达式生成默认值
        System.out.println(empty.orElseGet(()->"Default Value"));
        System.out.println(name.orElseGet(()->"Default Value"));
        try {
            //orElseThrow与orElse方法类似，区别在于返回值
            //orElseThrow抛出由传入的lambda表达式/方法生成异常
            empty.orElseThrow(Exception::new);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        //map方法通过传入的lambda表达式修改Optional实例默认值
        //lambda表达式返回值会包装为Optional实例
        Optional<String> upperName=name.map((value)->value.toUpperCase());
        System.out.println(upperName.orElse("No value found"));

    }
}
