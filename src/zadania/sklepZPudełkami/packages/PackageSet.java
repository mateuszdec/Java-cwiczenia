package zadania.sklepZPudełkami.packages;

import zadania.sklepZPudełkami.items.Item;

public class PackageSet {

    private ItemPackage[] packages = new ItemPackage[5];

    public PackageSet() {
        packages[0] = new StandardPackage(20, 20, 20);
        packages[1] = new StandardPackage(10, 10, 10);
        packages[2] = new StandardPackage(30, 30, 30);
        packages[3] = new CylindircalPackage(10, 20);
        packages[4] = new CylindircalPackage(20, 50);
    }

    public ItemPackage findOptimalPackage(Item item) {
        ItemPackage otimumPackage = null;
        double optimumVolumeDiff = Double.MAX_VALUE;
        double itemVolume = item.volume();
        for (ItemPackage pack : packages) {
            if(pack.checkFit(item)) {
                double packageVolume = pack.volume();
                double volumeDiff = packageVolume - itemVolume;
                if(volumeDiff < optimumVolumeDiff) {
                    otimumPackage = pack;
                    optimumVolumeDiff = volumeDiff;
                }
            }
        }
        return otimumPackage;
    }
}
