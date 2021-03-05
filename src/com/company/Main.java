package com.company;

import com.sun.jdi.ObjectReference;

import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        readOrders();
        readOrderItems();
        readProducts();






    }

    public static void readOrders() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("orders.csv"));
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<Order> orderList = new ArrayList<Order>();

        while ((line = reader.readLine()) != null) {
            Order order = new Order();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    order.setId(data);
                else if (index == 1) {
                    order.setDate(data);
                }
                else
                    System.out.println("Некорректные данные::" + data);
                index++;
            }
            index = 0;
            orderList.add(order);
        }
    }

    public static void readOrderItems() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("order_items.csv"));
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<OrderItem> orderItemList = new ArrayList<OrderItem>();

        while ((line = reader.readLine()) != null) {
            OrderItem orderItem = new OrderItem();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    orderItem.setOrderId(data);
                else if (index == 1) {
                    orderItem.setProductId(data);
                }
                else if (index == 2) {
                    orderItem.setQuantity(Integer.parseInt(data));
                }
                else
                    System.out.println("Некорректные данные::" + data);
                index++;
            }
            index = 0;
            orderItemList.add(orderItem);
        }
    }

    public static void readProducts() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("products.csv"));
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<Product> productList = new ArrayList<Product>();

        while ((line = reader.readLine()) != null) {
            Product product = new Product();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    product.setId(data);
                else if (index == 1) {
                    product.setName(data);
                }
                else if (index == 2) {
                    product.setPricePerUnit(Integer.parseInt(data));
                }
                else
                    System.out.println("Некорректные данные::" + data);
                index++;
            }
            index = 0;
            productList.add(product);
        }
    }


}
