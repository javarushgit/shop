package org.example.dao;

import org.example.exception.GoodNotFoundException;
import org.example.models.Check;
import org.example.models.EmployeeType;
import org.example.models.Good;
import org.example.models.Shop;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
ShopDAO
1. addGood;
2. findGood;
3. removeGood;
4. createCheck;
5. showGoods;
6. addEmployee
7.
 */
public class ShopDAO {

    private final Shop shop = Shop.getINSTANCE();
    Check check;
    public ShopDAO(){
        fillShopWithGoods();
    }

    {
        fillShopWithGoods();
    }
    private void fillShopWithGoods() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("goods.txt"))) {
            while (bufferedReader.ready()) {
                String str = bufferedReader.readLine();
                String[] goods = str.split(",", 3);
              //  addGood(new Good(goods[0], Float.parseFloat(goods[1])), Integer.parseInt(goods[2]));
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public Map<Good, Integer> findAll() throws GoodNotFoundException
    {
        Map<Good, Integer> store = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("goods.txt"))) {
            while (bufferedReader.ready()) {
                String str = bufferedReader.readLine();
                String[] goods = str.split(",", 3);
                store.put(new Good(goods[0],Float.parseFloat(goods[1])), Integer.valueOf(goods[2]));
            }
        } catch (IOException e) {
            e.getMessage();
        }
        if(store.size() == 0)
            throw new GoodNotFoundException("No any goods found");
        return store;
    }
//
//    public final Shop getShop() {
//        return shop;
//    }
//
//    public void addGood(Good good, int amount) {
//        HashMap<Good, Integer> store = shop.getStore();
//        Set<Good> goods = store.keySet();
//        for (Good goodIterator : goods) {
//            if (goodIterator.getProductName().equals(good.getProductName())) {
//                store.put(goodIterator, store.get(goodIterator) + amount);
//                shop.setStore(store);
//                return;
//            }
//        }
//
//        store.put(good, amount);
//        shop.setStore(store);
//
//    }
//
//    public Good findGood(String name) {
//
//        HashMap<Good, Integer> store = shop.getStore();
//        Set<Good> goods = store.keySet();
//
//        for (Good goodIterator : goods)
//            if (goodIterator.getProductName().equals(name))
//                return goodIterator;
//
//
//        return null;
//    }
//    public HashMap<Good,Integer>  findAll()
//    {
//        HashMap<Good, Integer> store = new HashMap<>();
//
//    }
//
//    public boolean removeGood(String name) {
//        HashMap<Good, Integer> store = shop.getStore();
//        Set<Good> goods = store.keySet();
//
//        for (Good goodIterator : goods)
//            if (goodIterator.getProductName().equals(name)) {
//                store.remove(goodIterator);
//                shop.setStore(store);
//                return true;
//            }
//        return false;
//    }
//
//    public void addCash(Float amount) {
//        shop.setCash(shop.getCash() + amount);
//    }
//
//    public boolean removeGood(String name, Integer amount) {
//
//        HashMap<Good, Integer> store = shop.getStore();
//        Set<Good> goods = store.keySet();
//        for (Good good : goods) {
//            if (good.getProductName().equals(name)) {
//
//                int currAmount = store.get(good);
//
//                if (currAmount > amount) {
//                    shop.getStore().put(good, (currAmount - amount));
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public Check createCheck(Map<Good, Integer> basket, String name) {
//        check = new Check(basket, name);
//        return check;
//    }
//
//    public void writeClientsCheck() {
//        File file = new File("clientCheck.txt");
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true)))
//        {
//            if (file.length() != 0){bufferedWriter.newLine();}
//            for (Map.Entry<Good, Integer> product : check.getGoodList().entrySet())
//            {
//                bufferedWriter.write(product.getKey().getProductName()
//                        + "," + product.getKey().getPrice()
//                        + "," + product.getValue()
//                        + ":");
//            }
//            bufferedWriter.write("cashier," + check.getCashier());
//            bufferedWriter.write(":time," + String.valueOf(check.getSellTime()) + ";");
//
//        } catch (IOException e) {
//            e.getMessage();
//        }
//    }
//
//        public HashMap<Good, Integer> showGoods ()
//        {
//            return shop.getStore();
//        }
//        public void addEmployee (String name, EmployeeType employeeType)
//        {
//            shop.getEmployees().put(name, employeeType);
//        }
//

}
