package com.driver;

public class Main{

    public static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public double product(double x, double y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }
    }
    public static void main(String[] args){

        Product p=new Product();
        p.product(10,5);
        p.product(2,3,2);
        p.product(1.1,2.1);

    }
}