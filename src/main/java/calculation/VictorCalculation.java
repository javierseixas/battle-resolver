package calculation;

public class VictorCalculation implements Calculation {

  @Override
  public double calculate(float defeatedPercentage) {
    return -9 * Math.pow(defeatedPercentage, 2) / 1000 + 100;
  }
}
