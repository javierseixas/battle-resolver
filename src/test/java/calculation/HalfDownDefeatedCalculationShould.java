package calculation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class HalfDownDefeatedCalculationShould {

  HalfDownDefeatedCalculation defeatedCalculation = new HalfDownDefeatedCalculation();

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
            { 10.0, 0.0 }, { 20.0, 5.0 }, { 30.0, 15 }, { 40.0, 25 }, { 50.0, 35 }
    });
  }

  @Parameterized.Parameter
  public /* NOT private */ double defeatedPercentage;

  @Parameterized.Parameter(1)
  public /* NOT private */ double expectedSurvivorsPercentage;

  @Test
  public void calculate() throws Exception {

    double result = this.defeatedCalculation.calculate(defeatedPercentage);

    assertEquals(result, expectedSurvivorsPercentage, 0);
  }

}