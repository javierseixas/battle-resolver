package calculation;

public class VictorCalculation implements Calculation {

  @Override
  public double calculate(double defeatedPercentage) {
    return -9 * Math.pow(defeatedPercentage, 2) / 1000 + 100;
  }
}
