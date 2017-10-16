import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BattleCalculatorShould {

  BattleCalculator battleCalculator = new BattleCalculator();

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void calculateResultWhenArmiesAreEqual() {

    Army attacker = new Army(7, 0);
    Army defender = new Army(7, 0);

    BattleResult battleResult = battleCalculator.calculate(attacker, defender);

    assertEquals(battleResult.getVictor().getRemainingPower(), 2);
    assertEquals(battleResult.getDefeated().getRemainingPower(), 2);

  }


}