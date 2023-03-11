package HM3;
import java.util.List;
import java.util.Random;




class Sortbyroll implements java.util.Comparator<Product> {
	public int compare(Product p1, Product p2) {
		return p1.title.compareTo(p2.title);
	}
}

public class Store {   

    public Store() {
        //categories.put("food", new Category("food"));
        //categories.put("alcohol", new Category("alcohol"));
        //categories.put("household", new Category("household"));
    }

    public java.util.Map<String, Category> categories = new java.util.HashMap<String, Category>();

    //java.util.List<Product> products = new java.util.ArrayList<>();


    public void print() {
        System.out.println();
        for (Category category : categories.values()) {
            System.out.println(category.title + ":");
            for (var products  : category.products.entrySet()) {
                System.out.println("  " + products.getKey() + " - " + Integer.toString(products.getValue().size()));
            }
        }
    }


    public void shipment() {
        Random r = new Random();
        int c = r.nextInt(10, 20);

        for(int i=0; i < c; ++i) {
            // Сategory food  
            add_product("food", new Product("apple", 100, 3));
            add_product("food", new Product("bread", 50, 3));
            add_product("food", new Product("milk", 150, 3));

            // ategory alcohol
            add_product("alcohol", new Product("vodka", 400, 2));
            add_product("alcohol", new Product("beer", 50, 2));
            add_product("alcohol", new Product("wine", 500, 2));
 
            // Сategory household
            add_product("household", new Product("shampoo", 200, 1));
            add_product("household", new Product("soap", 500, 1));
        }
    }


    public void add_product(String category, Product product ) {
        if(!categories.containsKey(category)) {
            java.util.List<Product> l = new java.util.ArrayList<>();
            l.add(product);
            Category c = new Category(category);        
            c.products.put(product.title, l);
            categories.put(category, c);
        }
        if(!categories.get(category).products.containsKey(product.title)) {
            java.util.List<Product> l = new java.util.ArrayList<>();
            categories.get(category).products.put(product.title, l);
            l.add(product);
        }
        categories.get(category).products.get(product.title).add(product);
        //products.add(product);
    }




    public Boolean contains(String category, String product) {
        return  categories.containsKey(category) && 
                categories.get(category).products.containsKey(product) && 
                categories.get(category).products.get(product).size() > 0;            
    }

    public Product get(String category, String product) {
        return categories.get(category).products.get(product).get(0);            
    }


    public void payment(User user) {
        for (var category : categories.values()) 
            for (var products : category.products.values())
                products.removeAll(user.basket.shopping);
    }


}
