package calculation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TopHalfDefeatedCalculationShould {

  TopHalfDefeatedCalculation defeatedCalculation = new TopHalfDefeatedCalculation();

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
            { 100.0, 10.0 }, { 90.0, 15.0 }, { 80.0, 20 }, { 70.0, 25 }, { 60.0, 30 }, { 50.0, 35 }
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