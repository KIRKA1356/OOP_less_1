import java.util.*;

public class VendingMashine {
    private List<Produkt> goods = new ArrayList<>();
    public void initProduct(List<Produkt> produkt){
        for (Produkt item: produkt) {
            goods.add(item);

        }
    }

    public List<Produkt> getGoods(){
        return goods;
    }

    public void getProdukt(String name){
        for (Produkt item: goods) {
            if (item.getName().equals(name)){
                System.out.printf("Цена товара " + '"' + name +  '"' + " = " + item.getCost());
            };
        }
    }


}


////
////    public List<Produkt> getGoods() {
////        return goods;
////    }