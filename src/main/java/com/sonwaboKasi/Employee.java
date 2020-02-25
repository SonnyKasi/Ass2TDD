package com.sonwaboKasi;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Employee {
    private String EmpName;
    private String EmpSurnm;
    private int EmpNum;

    public Employee(){

    }

    public Employee(String empName,String empSurnm,int empNum){
        this.EmpName =empName;
        this.EmpSurnm = empSurnm;
        this.EmpNum = empNum;
    }

    public String getEmpName() {
        return EmpName;
    }


    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpSurnm() {
        return EmpSurnm;
    }

    public void setEmpSurnm(String empSurnm) {
        EmpSurnm = empSurnm;
    }

    public int getEmpNum() {
        System.out.println("The employee is new");

        return EmpNum;
    }

    public void setEmpNum(int empNum) {
        EmpNum = empNum;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "EmpName='" + EmpName + '\'' +
                ", EmpSurnm='" + EmpSurnm + '\'' +
                ", EmpNum=" + EmpNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return EmpNum == employee.EmpNum &&
                EmpName.equals(employee.EmpName) &&
                EmpSurnm.equals(employee.EmpSurnm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EmpName, EmpSurnm, EmpNum);
    }
}
