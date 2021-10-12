package com.yjjxt.ch;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * @author procedure sail
 * @date 2021/10/16 15:50
 */
public class TestEnums1 {

    public static void main(String[] args) {
        Employee[] employees={
                new Employee("张三",19,1,Employees.BUSY,new Date(),15000),
                new Employee("李四",21,2,Employees.NORMAL,new Date(),18000),
                new Employee("王五",19,3,Employees.BUSY,new Date(),17000),
                new Employee("赵六",21,4,Employees.BUSY,new Date(),22000),
                new Employee("five",20,5,Employees.BUSY,new Date(),15500),
                new Employee("star",22,6,Employees.BUSY,new Date(),250000)
        };
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        for (Employee employee:employees){
          String times= sdf.format(employee.getStartTime()).split("-")[0];
            if ("2021".equals(times)){
                System.out.println(employee);
            }
            //找到工作状态忙碌的员工,薪资涨%6
            if (employee.getEmployees().equals(Employees.BUSY)){
                employee.setPrice(employee.getPrice()*1.06);
            }
        }
        
    }
}
