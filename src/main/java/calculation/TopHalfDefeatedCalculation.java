package calculation;

public class TopHalfDefeatedCalculation implements Calculation {

  @Override
  public double calculate(float defeatedPercentage) {
    return - defeatedPercentage / 2 + 60;
  }
}
