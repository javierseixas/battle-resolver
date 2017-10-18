package calculation;

public class HalfDownDefeatedCalculation implements Calculation {

  @Override
  public double calculate(float defeatedPercentage) {
    return defeatedPercentage - 15;
  }
}
