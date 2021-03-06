package calculation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class VictorCalculationShould {

  VictorCalculation victorCalculation = new VictorCalculation();

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
            { 20.0, 96.4 }, { 30.0, 91.9 }, { 50.0, 77.5 }, { 70.0, 55.9 }, { 80.0, 42.4 }, { 90.0, 27.1 }, { 100.0, 10 }
    });
  }

  @Parameterized.Parameter // first data value (0) is default
  public /* NOT private */ double defeatedPercentage;

  @Parameterized.Parameter(1)
  public /* NOT private */ double expectedSurvivorsPercentage;

  @Test
  public void returnAccordingToTheFunction() throws Exception {

    double result = this.victorCalculation.calculate(defeatedPercentage);

    assertEquals(result, expectedSurvivorsPercentage, 10);
  }

}