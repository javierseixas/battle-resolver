package calculation;

public class TopHalfDefeatedCalculation implements Calculation {

  @Override
  public double calculate(double defeatedPercentage) {
    return - defeatedPercentage / 2 + 60;
  }
}
