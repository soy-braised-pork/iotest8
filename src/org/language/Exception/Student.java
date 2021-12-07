package org.language.Exception;

import java.util.Objects;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-17
 */
public class Student implements Comparable<Student>{
    String name;
    int age;
    String sex;



    public Student(){

    }

    public Student(String name){
        this.name=name;
    }

    public Student(String name,int age,String sex) {
        this.age=age;
        this.name=name;
        try {
            this.setSex(sex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) throws Exception{
        if (sex.equals("女")||sex.equals("男")){
            this.sex = sex;
        }else {
            //检查时
            throw new Exception("性别不对");
            //运行时
//            throw new RuntimeException("性别不对");

        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    //内部比较器
    @Override
    public int compareTo(Student o) {
        return 0;
    }
}

//外部实现类
class BiJiao implements Comparable<Student>{

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
