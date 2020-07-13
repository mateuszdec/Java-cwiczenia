package zadania.sklepZPudełkami.test;

import zadania.sklepZPudełkami.items.BallItem;
import zadania.sklepZPudełkami.items.Item;
import zadania.sklepZPudełkami.items.StandardItem;
import zadania.sklepZPudełkami.packages.ItemPackage;
import zadania.sklepZPudełkami.packages.PackageSet;

class Shop {
    public static void main(String[] args) {
        PackageSet packageSet = new PackageSet();
        Item testItem1 = new StandardItem("cukierki", 50, 25, 25);
        Item testItem2 = new BallItem("kula do kąpieli", 10);

        ItemPackage optimalPackage = packageSet.findOptimalPackage(testItem2);
        if(optimalPackage != null) {
            System.out.println("Produkt " + testItem2.getInfo());
            System.out.println("Pudełko: " + optimalPackage.getInfo());
        } else {
            System.out.println("Brak odpowiedniego pudełka");
        }
    }
}
