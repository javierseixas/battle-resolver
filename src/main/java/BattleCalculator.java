import calculation.Calculation;
import calculation.HalfDownDefeatedCalculation;
import calculation.TopHalfDefeatedCalculation;
import calculation.VictorCalculation;

public class BattleCalculator {

  private Calculation victorCalculation = new VictorCalculation();
  private Calculation halfDownDefeatedCalculation = new HalfDownDefeatedCalculation();
  private Calculation topHalfDefeatedCalculation = new TopHalfDefeatedCalculation();

  public BattleResult calculate(
          Army attacker,
          Army defender
  ) {

    // Resolve victor and defeated
    Army victorArmy = resolveVictorArmy(attacker, defender);
    Army defeatedArmy = resolveDefeatedArmy(attacker, defender);

    // Calculates armies relation percentage
    double percentage = percentageBasePowerFromDefeatedToVictor(victorArmy, defeatedArmy);

    // Calculates survivors percentage per army
    double victorSurvivorsPercentage = victorCalculation.calculate(percentage);
    double defeatedSurvivorsPercentage = calculateDefeatedSurvivors(percentage);

    // Builds Battle Result
    return new BattleResult(
            new RemainingArmy(calculateVictorRemainingPower(victorArmy, victorSurvivorsPercentage)),
            new RemainingArmy(calculateDefeatedRemainingPower(defeatedArmy, defeatedSurvivorsPercentage))
    );
  }

  private double percentageBasePowerFromDefeatedToVictor(Army victor, Army defeated) {
    return (double) defeated.getTotalPower() * 100 / (double) victor.getTotalPower();
  }

  private Army resolveVictorArmy(Army attacker, Army defender) {
    if (attacker.getTotalPower() > defender.getTotalPower()) {
      return attacker;
    }
    return defender;
  }

  private Army resolveDefeatedArmy(Army attacker, Army defender) {
    if (attacker.getTotalPower() <= defender.getTotalPower()) {
      return attacker;
    }
    return defender;
  }

  private double calculateDefeatedSurvivors(double percentage) {
    if (percentage > 50) {
      return topHalfDefeatedCalculation.calculate(percentage);
    }

    return halfDownDefeatedCalculation.calculate(percentage);
  }

  private int calculateVictorRemainingPower(Army victorArmy, double percentage) {
    int remaining = (int) Math.floor(victorArmy.getBasePower() * percentage / 100);

    return remaining < 1 ? 1 : remaining;
  }

  private int calculateDefeatedRemainingPower(Army defeatedArmy, double percentage) {
    return (int) Math.floor(defeatedArmy.getBasePower() * percentage / 100);
  }
}

