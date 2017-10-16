public class Army {

  int basePower;
  int bonusPower;

  public Army(int basePower, int bonusPower) {
    this.basePower = basePower;
    this.bonusPower = bonusPower;
  }

  public int getBasePower() {
    return basePower;
  }

  public int getBonusPower() {
    return bonusPower;
  }

  public int getTotalPower() {
    return basePower + bonusPower;
  }
}
