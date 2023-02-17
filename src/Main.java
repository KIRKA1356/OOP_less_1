/*
-Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы initProducts
(List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
-Реализовать конструкторы, get/set методы, построить логику ТорговогоАвтомата на основе кода сделанного в задании 1.2
-Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды), сделать интерфейсом
ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат
-
1. Попросить вначале переопределить метод toString для Товара, запустить программу,
после этого переопределить для наследника этот метод, после запуска обратить внимание на изменение поведения. (10 минут)
2. Попросить создать перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным входным
параметром (пример: getProduct(String name) выдающий товар по имени, создать метод возвращающий
товар по имени и какому-либо параметру товара getProduct(String name, int volume) (10 минут)
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produkt buratino = new Produkt("Buratino", 120);
        Produkt cola = new Produkt("Coca-Cola", 145);
        Produkt mars =new Produkt("Mars", 220);
        List<Produkt> mygoods = new ArrayList<>();
        mygoods.add(cola);
        mygoods.add(mars);
        mygoods.add(buratino);
        VendingMashine autobox = new VendingMashine();
        autobox.initProduct(mygoods);
        System.out.println(autobox.getGoods());
        autobox.getProdukt("Coca-Cola");

    }
}