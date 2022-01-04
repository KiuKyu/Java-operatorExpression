package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        // Khai báo 2 biến width + height với kiểu dữ liệu float
        Scanner userInput = new Scanner(System.in);
        // Khai báo đối tượng userInput thuộc lớp Scanner
        System.out.println("Enter width: ");
        // In ra chuỗi "Enter width: "
        width = userInput.nextFloat();
        // gán value cho biến width = đối tượng userInput.nextFloat() nhận giá trị nhập vào từ người dùng với datatype float
        System.out.println("Enter height: ");
        // In ra chuỗi "Enter height: "
        height = userInput.nextFloat();
        // gán value cho biến height = đối tượng userInput.nextFloat() nhận giá trị nhập vào từ người dùng với datatype float
        float area = width * height;
        // khai báo biến area với kiểu dữ liệu float. giá trị area = width x height
        System.out.println("Area is: " + area);
        // In ra "Area is: " + biến area
    }
}
