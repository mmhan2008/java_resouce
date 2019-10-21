package com.Lambda;

import com.entity.Employee;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author user01
 * @create 2019/1/31
 */
public class TestStream {

    //创建stream
    @Test
    public void test1 () {
        //1.可以通过Collection 系列集合提供的stream() 或 parallelStream
        List list = new ArrayList();
        Stream stream1 = list.stream();

        //2.通过Arrays 中的静态方法stream()获取数组流
        Employee [] emps = new Employee[10];
        Stream<Employee> stream2 = Arrays.stream(emps);

        //3.通过Stream 类中的静态方法 of()
        Stream<String> stream3 = Stream.of("aa", "bb", "cc");

        //4.创建无限流  迭代
        Stream<Integer> stream4 = Stream.iterate(0, (x) -> x + 2);
        stream4.forEach(System.out::println);

        //生成
        Stream.generate(() -> Math.random())
                        .limit(5)
                        .forEach(System.out::println);
    }

    List<Employee> emps = Arrays.asList(
            new Employee(102, "李四", 59, 6666.66, Employee.Status.BUSY),
            new Employee(101, "张三", 18, 9999.99, Employee.Status.FREE),
            new Employee(103, "王五", 28, 3333.33, Employee.Status.VOCATION),
            new Employee(104, "赵六", 8, 7777.77, Employee.Status.BUSY),
            new Employee(104, "赵七", 8, 7777.77, Employee.Status.VOCATION),
            new Employee(104, "赵七", 8, 7777.77, Employee.Status.VOCATION),
            new Employee(104, "赵七", 8, 7777.77, Employee.Status.VOCATION),
            new Employee(104, "赵七", 8, 7777.77, Employee.Status.VOCATION),
            new Employee(104, "赵八", 8, 7777.77, Employee.Status.FREE),
            new Employee(105, "田七", 38, 5555.55, Employee.Status.BUSY)
    );

    @Test
    public void test2 () {
        emps.stream()
            .filter((e) -> e.getAge() >= 35)
            .forEach(System.out::println);
    }

    @Test
    public void test3 () {
        emps.stream()
            .filter(e -> e.getSalary() > 5000)
                //取前两个
            .limit(2)
            .forEach(System.out::println);
        System.out.println("--------------------------");

        emps.stream()
                .filter(employee -> employee.getSalary() > 5000)
                //取后两个
                .skip(2)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        Stream<Employee> distinct = emps.stream()
                .filter(employee -> employee.getSalary() > 5000)
                //去重
                .distinct();
        List<Employee> collect = distinct.collect(Collectors.toList());

        System.out.println(collect);
    }

    @Test
    public void test4 () {
        List<String> list = Arrays.asList("aaa","bbb","ccc","ddd");

        list.stream()
                //映射  提取
                .map(e -> e.toUpperCase())
                .forEach(System.out::println);

        System.out.println("--------------------------");
    }

    /*
        排序
        sorted() 自然排序 Comparable
        sorted(Comparator com) 定制排序  Comparator
     */
    @Test
    public void test7 () {
        List<String> list = Arrays.asList("ccc","bbb","aaa","eee","ddd");

        list.stream()
                .sorted()
                .forEach(System.out::println);


        System.out.println("----------------------");

        emps.stream()
                .sorted((e1,e2) -> {
                    if (e1.getAge().equals(e2.getAge()))
                        return e1.getName().compareTo(e2.getName());
                    else
                        return -e1.getAge().compareTo(e2.getAge());
                }).forEach(System.out::println);
    }

    /*
        查找与匹配
        allMatch 检查是否匹配所有元素
        anyMatch 检查是否至少有一个元素
        noneMatch 检查是否没有匹配所元素
        findFirst 返回第一个元素
        findAny 返回当前流中的任意元素
        count 返回流中元素的总个数
        max  返回流中最大值
        min  返回流中最小值

     */
    @Test
    public void test8 () {
        boolean b1 = emps.stream()
                .allMatch(e -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b1);

        boolean b2 = emps.stream()
                .anyMatch(e -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b2);

        boolean b3 = emps.stream()
                .noneMatch(e -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b3);

        Optional<Employee> op1 = emps.stream()
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .findFirst();
        
        System.out.println(op1.get());

        //串行流 stream()
        Optional<Employee> op2 = emps.stream()
                .filter(e -> e.getStatus().equals(Employee.Status.VOCATION))
                .findAny();
        System.out.println(op2.get());

        //并行流 parallelStream()
        Optional<Employee> op3= emps.parallelStream()
                .filter(e -> e.getStatus().equals(Employee.Status.VOCATION))
                .findAny();
        System.out.println(op2.get());

        long count = emps.stream()
                .count();
        System.out.println(count);

        Optional<Employee> max = emps.stream()
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(max.get());

        Optional<Double> min = emps.stream()
                .map(Employee::getSalary)
                .min(Double::compare);
        System.out.println(min.get());
    }
    /*
        规约
        reduce(T identity, BinaryOperator) /reduce(BinaryOperator)
        可以将流中的元素反复结合起来  得到一个值
     */
    @Test
    public void test9 () {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Integer reduce = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(reduce);

        System.out.println("---------------------------");

        Optional<Double> reduce1 = emps.stream()
                .map(Employee::getSalary)
                .reduce(Double::sum);
        System.out.println(reduce1.get());
    }

    /*
        收集
        collect 将流转换为其他形式，接收一个Collector接口的实现，用于给Stream中
        的元素混总的方法
     */
    @Test
    public void test10 () {
        List<String> list = emps.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println("-------------------");

        Set<String> set = emps.stream()
                .map(Employee::getName)
                .collect(Collectors.toSet());
        set.forEach(System.out::println);

        System.out.println("-----------------------------------");


        HashSet<String> hashSet = emps.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(HashSet::new));
        hashSet.forEach(System.out::println);

    }
    @Test
    public  void test11 () {
        //总数
        Long count = emps.stream()
                .collect(Collectors.counting());
        System.out.println(count);


        System.out.println("--------------------------");

        //平均值
        Double avg = emps.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avg);


        //工资总和
        Double sum = emps.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));

        System.out.println(sum);


        //最大值
        Optional<Employee> collect = emps.stream()
                .collect(Collectors.maxBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));
        System.out.println(collect);
        
        
        //最小值
        Optional<Double> collect1 = emps.stream()
                .map(Employee::getSalary)
                .collect(Collectors.minBy(Double::compare));
        System.out.println(collect1);

    }
}

