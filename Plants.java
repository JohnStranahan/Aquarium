package aquarium;

/**
 * Plants can alter or lower PH levels under certain circumstances
 * Plants Absorb Carbon Dioxide given enough light
 * Plants Produce 02
 * Too much Carbon Dioxide lowers PH (toxic)
 * when plants absorb Carbon Dioxide the PH will rise
 *
 * plants absorb Ammonium
 * Ammonium lowers ph

 * EGERIA absords minerals like calcium (Water Hardness) (lower PH)
 *
 *  plants prefer certain ph and waterhardness
 * (ex. Amazon SwordPlant - soft acidic water)
 * (ex. Egeria - hard, alkalin water)
 * (ex- anuvias - adapt to many levels)

 * PH can also affect aquarium plants
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Plants
{

	private static String name;
	private double minCarbonDioxide;
    private double maxCarbonDioxide;
    private double minOxygen;
    private double maxOxygen;
    private double minAmmonium;
    private double maxAmmonium;
    private double minPh;
    private double maxPh;
    private double minWaterHardness;
    private double maxWaterHardness;
    private double minTemperature;
    private double maxTemperature;


public Plants()
{
	
}

public static String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

public double getMinCarbonDioxide() {
	return minCarbonDioxide;
}


public void setMinCarbonDioxide(double minCarbonDioxide) {
	this.minCarbonDioxide = minCarbonDioxide;
	
}


public double getMaxCarbonDioxide() {
	return maxCarbonDioxide;
	
}


public void setMaxCarbonDioxide(double maxCarbonDioxide) {
	this.maxCarbonDioxide = maxCarbonDioxide;
	maxCarbonDioxide=40;
}


public double getMinOxygen() {
	return minOxygen;
}


public void setMinOxygen(double minOxygen) {
	this.minOxygen = minOxygen;
}


public double getMaxOxygen() {
	return maxOxygen;
}


public void setMaxOxygen(double maxOxygen) {
	this.maxOxygen = maxOxygen;
}


public double getMinAmmonium() {
	return minAmmonium;
}


public void setMinAmmonium(double minAmmonium) {
	this.minAmmonium = minAmmonium;
}


public double getMaxAmmonium() {
	return maxAmmonium;
}


public void setMaxAmmonium(double maxAmmonium) {
	this.maxAmmonium = maxAmmonium;
}


public double getMinPh() {
	return minPh;
}


public void setMinPh(double minPh) {
	this.minPh = minPh;
}


public double getMaxPh() {
	return maxPh;
}


public void setMaxPh(double maxPh) {
	this.maxPh = maxPh;
}


public double getMinWaterHardness() {
	return minWaterHardness;
}


public void setMinWaterHardness(double minWaterHardness) {
	this.minWaterHardness = minWaterHardness;
}


public double getMaxWaterHardness() {
	return maxWaterHardness;
}


public void setMaxWaterHardness(double maxWaterHardness) {
	this.maxWaterHardness = maxWaterHardness;
}

public double getMinTemperature() {
	return minTemperature;
}

public void setMinTemperature(double minTemperature) {
	this.minTemperature = minTemperature;
}

public double getMaxTemperature() {
	return maxTemperature;
}

public void setMaxTemperature(double maxTemperature) {
	this.maxTemperature = maxTemperature;
}




}


