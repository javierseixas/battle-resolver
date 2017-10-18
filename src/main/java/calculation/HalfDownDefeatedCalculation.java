package calculation;

public class HalfDownDefeatedCalculation implements Calculation {

  @Override
  public double calculate(double defeatedPercentage) {
    return minimumZero(defeatedPercentage - 15);
  }

  private double minimumZero(double number) {
    return (number < 0) ? 0 : number;
  }
}
