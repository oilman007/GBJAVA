package HM3;

public class Category {
    public Category(String title) {
        this.title = title;
    }
    public String title = "";
    public java.util.Map<String, java.util.List<Product>> products = new java.util.HashMap<String, java.util.List<Product>>();
}

