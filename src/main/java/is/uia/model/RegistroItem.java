package is.uia.model;

public class RegistroItem {
    private String item;

    public RegistroItem() {
    }

    public RegistroItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "RegistroItem{" +
                "item='" + item + '\'' +
                '}';
    }
}
