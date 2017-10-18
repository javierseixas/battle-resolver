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
            { 100.0f, 10.0 }, { 90.0f, 15.0 }, { 80.0f, 20 }, { 70.0f, 25 }, { 60.0f, 30 }, { 50.0f, 35 }
    });
  }

  @Parameterized.Parameter
  public /* NOT private */ float defeatedPercentage;

  @Parameterized.Parameter(1)
  public /* NOT private */ double expectedSurvivorsPercentage;

  @Test
  public void calculate() throws Exception {

    double result = this.defeatedCalculation.calculate(defeatedPercentage);

    assertEquals(result, expectedSurvivorsPercentage, 0);
  }

}