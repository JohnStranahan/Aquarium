package acquarium;

/**
 * Created by YoungyoNa on 11/19/16.
 */
public class Fish {
    private boolean freshwater;
    private String behavior;
    private String swimmingArea;
    private int minPurchaseQuantity;
    private double fishVolume;
    private double minTankSizeRequired;
    private double extraTankSizeRequired;
    private double phMinRequired;
    private double phMaxRequired;
    private double nh4MinRequired;
    private double nh4MaxRequired;
    private double co2MinRequired;
    private double co2MaxRequired;
    private double minTempRequired;
    private double maxTemptRequired;
    private boolean needsDecorations;

    public Fish()
    {

    }

    public boolean getFreshwater()
    {
        return freshwater;
    }

    public void setFreshwater(boolean freshwater)
    {
        this.freshwater = freshwater;
    }

    public String getBehavior()
    {
        return behavior;
    }

    public void setBehavior(String behavior)
    {
        this.behavior = behavior;
    }

    public String getSwimmingArea()
    {
        return swimmingArea;
    }

    public String behavior()
    {
        return behavior;
    }
}
