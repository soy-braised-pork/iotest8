package org.language.TimeTest;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-18
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入想要查看的日期：（格式 1999-9-4）");
        String time=scanner.next();
        //String--->Calendar
        //1、String--->Date
        java.sql.Date date=java.sql.Date.valueOf(time);
        //2、Date--->Calendar
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        //后续操作
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        //获取本月最大天数
        int maxDay=cal.getActualMaximum(Calendar.DATE);
        //获取日期中的“日”
        int nowDay=cal.get(Calendar.DATE);

        //将日期调为本月的一号
        cal.set(Calendar.DATE,1);
        //获取一号是本周第几天
        int num=cal.get(Calendar.DAY_OF_WEEK);
        //前面空出来的天数
        int day=num-1;


        //计数器
        int count=0;
        //在日期前将空格打印出来
        for(int i=1;i<=day;i++){
            System.out.print("\t");
        }

        for(int i=1;i<=maxDay;i++){
            if (i==nowDay){
                System.out.print(i+"*"+"\t");
            }else {
                System.out.print(i+"\t");
            }
            count++;
            if((count+day)%7==0){
                System.out.println();
            }
        }
    }
}
