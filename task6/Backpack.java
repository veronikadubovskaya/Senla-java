package task6;
import java.util.List;
class Backpack {
    private double maxW;
    private double maxC;
    private List<Item> bestItems = null;
    public Backpack(double maxW){
        this.maxW = maxW;
    }
    public double getMaxW(){
        return this.maxW;
    }
}
