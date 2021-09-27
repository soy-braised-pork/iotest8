package org.language.i;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> nums= asList(1,1,null,2,3,4,null,5,6,7,8,9,10);
        System.out.println("sum is:"+nums.stream().filter(num->num!=null).
                distinct().mapToInt(num->num*2).
                peek(System.out::println).skip(2).limit(4).sum());

        List<Integer> nums1= asList(1,1,null,2,3,4,null,5,6,7,8,9,10);
        List<Integer> numsWithoutNull=nums1.stream().filter(num->num!=null).distinct().
              //collect方法的三个参数，都是lambda形式的函数
              //第一个函数生成一个新的Arraylist实例；
              //第二个函数接受两个参数，第一个是前面生成的ArrayList对象，二个是stream中包含的元素，函数体就是把stream中的元素加入Arraylist对象中。第二个函数被反复调用直到原stream的元素被消耗完毕；
              //第三个函数也是接受两个参数，这两个都是Arraylist类型的，函数体就是把第二个Arraylist全部加入到第一个中；
                collect(()->new ArrayList<Integer>(),
                       (list,item)->list.add(item),
                      (list1,list2)->list1.addAll(list2));
        numsWithoutNull.stream().forEach((e)-> System.out.println(e));

        numsWithoutNull=nums.stream().filter(num->num!=null).
                collect(toList());
        numsWithoutNull.stream().forEach((e)-> System.out.println(e));

        List<Integer> together= Stream.of(asList(1,2),asList(3,4)).flatMap(numbers->numbers.stream()).collect(toList());
        together.stream().forEach((e)->System.out.println(e));

        List<Integer> ints=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("ints sum is:"+ints.stream().reduce((sum,item)->sum+item).get());

        List<Integer> ints1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("ints1 sum is:"+ints1.stream().reduce(10,(sum,item)->sum+item));

        List<Integer> ints2=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("ints2 sum is:"+ints2.stream().count());

        List<Integer> ints3=Arrays.asList(1,2,3,4,5,6,7,8,9,1000000);
        System.out.println(ints3.stream().allMatch(item->item<100));
        ints3.stream().max((o1, o2) -> o1.compareTo(o2)).ifPresent(System.out::println);
    }
}
