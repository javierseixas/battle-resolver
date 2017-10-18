package calculation;

public class HalfDownDefeatedCalculation implements Calculation {

  @Override
  public double calculate(float defeatedPercentage) {
    return minimumZero(defeatedPercentage - 15);
  }

  private double minimumZero(float number) {
    return (number < 0) ? 0 : number;
  }
}
