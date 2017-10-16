public class BattleCalculator {
  public BattleResult calculate(
          Army attacker,
          Army defender
  ) {

    Army victorArmy = resolveVictorArmy(attacker, defender);

    float percentage = percentageBasePowerFromDefeatedToVictor(attacker, defender);

    return new BattleResult(
            new RemainingArmy(2),
            new RemainingArmy(2)
    );
  }

  private float percentageBasePowerFromDefeatedToVictor(Army attacker, Army defender) {
    return (defender.getBasePower()/100) * attacker.getBasePower();
  }

  private Army resolveVictorArmy(Army attacker, Army defender) {
    if (attacker.getTotalPower() > defender.getTotalPower()) {
      return attacker;
    }
    return defender;
  }
}

