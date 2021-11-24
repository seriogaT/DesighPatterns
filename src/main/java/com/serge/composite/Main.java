package com.serge.composite;

public class Main {
    public static void main(String[] args) {
        Department financial = new FinancialDepartment(001, "financial");
        Department reception = new ReceptionDepartment(002, "reception");
        Department sales = new SalesDepartment(003, "sales");

        HeadDepartment headDepartment = new HeadDepartment(111, "HEAD");
        headDepartment.addChildDepartment(financial);
        headDepartment.addChildDepartment(reception);
        headDepartment.addChildDepartment(sales);

        headDepartment.showDepartment();
    }
}
