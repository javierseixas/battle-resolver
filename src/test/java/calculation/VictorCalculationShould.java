package calculation;

import org.junit.Test;

import static org.junit.Assert.*;

public class VictorCalculationShould {

  VictorCalculation victorCalculation = new VictorCalculation();

  @Test
  public void returnAccordingToTheFunction() throws Exception {


    double result = this.victorCalculation.calculate(20.0f);

    assertEquals(result, 96.4, 10);

    result = this.victorCalculation.calculate(100.0f);

    assertEquals(result, 10, 10);

  }

}