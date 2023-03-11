package HM3;


/*
 Домашнее задание на закрепление:

1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
3)Создать класс Basket, содержащий массив купленных товаров.
4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
5)Вывести на консоль каталог продуктов. (все продукты магазина)
6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
 */

public class Program {
    public static void main(String[] args) {

        
        Store store = new Store();
        store.shipment();
        store.print();

        // user 1
        User arnold_schwarzenegger = new User("arnold_schwarzenegger", "astalavistababy");
        if(store.contains("food", "apple"))
            arnold_schwarzenegger.basket.shopping.add(store.get("food", "apple"));
        /*
        if(store.contains("food", "bread"))
            arnold_schwarzenegger.basket.shopping.add(store.get("food", "bread"));
        if(store.contains("food", "milk"))
            arnold_schwarzenegger.basket.shopping.add(store.get("food", "milk"));
        */
        
        // user 2
        User mickey_rourke = new User("mickey_rourke", "marlboroman");
        if(store.contains("alcohol", "vodka"))
            mickey_rourke.basket.shopping.add(store.get("alcohol", "vodka"));


        //store.print();
        
        store.payment(arnold_schwarzenegger);
        store.print();

        store.payment(mickey_rourke);
        store.print();

    }
}

