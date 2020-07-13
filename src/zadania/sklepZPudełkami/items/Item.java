package zadania.sklepZPudełkami.items;

public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double volume() {
        return 0;
    }

    public String getInfo() {
        return name;
    }
}