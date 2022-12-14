package org.example.controllers;
import org.example.dao.ClientDAO;
import org.example.dao.ShopDAO;
import org.example.exception.GoodNotFoundException;
import org.example.models.Check;
import org.example.models.Client;
import org.example.models.Good;
import java.io.*;
import java.util.*;

public class ClientController {

//    public static void main(String[] args) {
//        clientBuy();
//    }
//    public static void clientBuy() {
//        String name = "Anton";
//        Client client = new Client(12500F);
//        ClientDAO clientDAO = new ClientDAO(client);
//        ShopDAO shopDAO = new ShopDAO();
//        //Fill shop store with goods from file goods.txt
//        shopDAO.fillShopWithGoods();
//        //Print goods from the shop
//        System.out.println("========Show Goods========");
//        HashMap<Good, Integer> goodsHashMap = shopDAO.showGoods();
//        for(Map.Entry<Good, Integer> product : goodsHashMap.entrySet())
//        {
//            System.out.println("Name= " + product.getKey().getProductName()
//                    + ", price= " + product.getKey().getPrice()
//                    + ", amount= " + product.getValue());
//        }
//
//        // Достаем из базы корзину покупателя
//        Map<Good, Integer> clientBasket = clientDAO.getClient().getBasket();
//        // Создаем корзину покупок и уменьшаем количество товара на  складе
//        Map<Good, Integer> basket = new HashMap<>();
//        for(Map.Entry<Good, Integer> product : goodsHashMap.entrySet())
//        {
//            switch (product.getKey().getProductName()) {
//                case "cheese":
//                    basket.put(product.getKey(), 5);
//                    goodsHashMap.put(product.getKey(), product.getValue() - 5);
//                    break;
//                case "apple":
//                    basket.put(product.getKey(), 15);
//                    goodsHashMap.put(product.getKey(), product.getValue() - 15);
//                    break;
//                case "chicken":
//                    basket.put(product.getKey(), 3);
//                    goodsHashMap.put(product.getKey(), product.getValue() - 3);
//                    break;
//            }
//
//        }
//        //Выводим чек покупателю
//        Check check = shopDAO.createCheck(basket, "Anton");
//        System.out.println("============Check Output=========");
//        System.out.print("Goods in basket :" );
//        for(Map.Entry<Good, Integer> product : check.getGoodList().entrySet()) {
//            System.out.print(
//                    "\nProduct: " + product.getKey().getProductName()
//                            +"\nPrice: " + product.getKey().getPrice()
//                            +"\nAmount: " + product.getValue());
//        }
//        System.out.println("\nCashier: " + check.getCashier()
//                +"\nTime " + check.getSellTime()
//                +"\nThank you for purchase. See you later!");
//        //Записываем чек в файл
//        shopDAO.writeClientsCheck();
//        // Перекидываем деньги от клиента магазину
//        shopDAO.addCash(clientDAO.removeCash());
//        // Передаем чек клиенту
//        clientDAO.addCheck(check);
//    }

    public static void showGoods()
    {
        /*
        создать обьект DAO
        у обьекта DAO вызвать метод который возвращает все товары на складе
        вывести их клиенту
         */

        ShopDAO shopDAO = new ShopDAO();
        Map<Good,Integer> store = new HashMap<>();
        try {
            store = shopDAO.findAll();
            System.out.println(store);
        } catch (GoodNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans;
        while (true)
        {
            System.out.println(intefaceString());
            ans = sc.nextInt();
            switch(ans)
            {
                case 1:
                    showGoods();
                    break;
                case 2:
                    System.out.println("To do");
                    break;
                case 3:
                    return;

            }
        }
    }

    public static String intefaceString()
    {
        return "Enter 1 to show all goods\n" +
                "Enter 2 to find good by name\n" +
                "Enter 3 to exit";

    }

    }