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

    Army attacker = new Army(100, 0);
    Army defender = new Army(30, 0);

    BattleResult battleResult = battleCalculator.calculate(attacker, defender);

    assertEquals(91, battleResult.getVictor().getRemainingPower(), 0);
    assertEquals(4, battleResult.getDefeated().getRemainingPower(), 0);
  }

  @Test
  public void calculateResultWhenArmiesAreEqual_a() {

    Army attacker = new Army(7, 0);
    Army defender = new Army(7, 0);

    BattleResult battleResult = battleCalculator.calculate(attacker, defender);

    assertEquals(1, battleResult.getVictor().getRemainingPower(), 0);
    assertEquals(0, battleResult.getDefeated().getRemainingPower(), 0);
  }

  @Test
  public void calculateResultWhenArmiesAreEqual_b() {

    Army attacker = new Army(7, 0);
    Army defender = new Army(6, 0);

    BattleResult battleResult = battleCalculator.calculate(attacker, defender);

    assertEquals(2, battleResult.getVictor().getRemainingPower(), 0);
    assertEquals(1, battleResult.getDefeated().getRemainingPower(), 0);
  }

  @Test
  public void calculateResultWhenArmiesAreEqual_c() {

    Army attacker = new Army(7, 0);
    Army defender = new Army(3, 3);

    BattleResult battleResult = battleCalculator.calculate(attacker, defender);

    assertEquals(2, battleResult.getVictor().getRemainingPower(), 0);
    assertEquals(0, battleResult.getDefeated().getRemainingPower(), 0);
  }

  @Test
  public void calculateResultWhenArmiesAreEqual_d() {

    Army attacker = new Army(3, 4);
    Army defender = new Army(3, 3);

    BattleResult battleResult = battleCalculator.calculate(attacker, defender);

    assertEquals(1, battleResult.getVictor().getRemainingPower(), 0);
    assertEquals(0, battleResult.getDefeated().getRemainingPower(), 0);
  }
}