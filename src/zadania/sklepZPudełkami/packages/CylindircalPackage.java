package zadania.sklepZPudełkami.packages;

import zadania.sklepZPudełkami.items.BallItem;
import zadania.sklepZPudełkami.items.Item;
import zadania.sklepZPudełkami.items.StandardItem;

class CylindircalPackage extends ItemPackage {
    private double r;
    private double height;

    public CylindircalPackage(double r, double height) {
        this.r = r;
        this.height = height;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean checkFit(Item item) {
        if(item instanceof StandardItem) {
            StandardItem standardItem = (StandardItem) item;
            double itemA = standardItem.getA();
            double itemB = standardItem.getB();
            double itemC = standardItem.getC();
            double abHalfDiagonal = Math.sqrt((Math.pow(itemA, 2) + Math.pow(itemB, 2))) / 2;
            double acHalfDiagonal = Math.sqrt((Math.pow(itemA, 2) + Math.pow(itemC, 2))) / 2;
            double bcHalfDiagonal = Math.sqrt((Math.pow(itemB, 2) + Math.pow(itemC, 2))) / 2;
            return abHalfDiagonal <= r && itemC <= r ||
                    acHalfDiagonal <= r && itemB <= r ||
                    bcHalfDiagonal <= r && itemA <= r;
        } else if(item instanceof BallItem) {
            BallItem ballItem = (BallItem) item;
            double itemR = ballItem.getR();
            return itemR <= r && itemR * 2 <= height;
        } else {
            return false;
        }
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(r, 2) * height;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " R: " + r + ", H: " + height;
    }
}
