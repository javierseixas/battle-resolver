public class BattleResult {
  RemainingArmy victor;
  RemainingArmy defeated;

  public BattleResult(RemainingArmy victor, RemainingArmy defeated) {
    this.victor = victor;
    this.defeated = defeated;
  }

  public RemainingArmy getVictor() {
    return victor;
  }

  public RemainingArmy getDefeated() {
    return defeated;
  }
}
