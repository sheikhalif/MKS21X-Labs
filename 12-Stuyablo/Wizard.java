public class Wizard extends Adventurer {
  private int mana;
  private String spellName;
  private int maxHp;

  public Wizard(){
    this("Harry");
  }

  public Wizard(String name){
    this(name, "Hocus Pocus", 20);
  }

  public Wizard(String name, String spellName, int mana){
    super(name,30+(int)(Math.random()*10));
    maxHp = this.getHP();
    setAbilityCall(spellName);
    setAbility(mana);
  }

  public void attack(Damageable other){
      int damage = (int)(Math.random()*10)+1;
      other.applyDamage(damage);
      setAbility(getAbility() + 1);
      System.out.println(this +
          " attacked " + other + " for " +
          damage + " damage!");
  }

  public void specialAttack(Damageable other){
     if(getAbility() >= 10){
          int damage = (int)(Math.random()*20)+1;
          other.applyDamage(damage);
          System.out.println(this + " cast a spell on "
           + other + " for " + damage + " damage! "+ spellName);
          setAbility(getAbility() - 10);
    }else{
        System.out.println("Not enough mana! ");
        attack(other);
    }
  }

  public int getAbility(){
     return mana;
  }

  public void setAbility(int r){
     this.mana = r;
  }

  public void setAbilityCall(String spellName){
     this.spellName = spellName;
  }

  public int getMaxHp(){
    return maxHp;
  }

  public String playerAbilityType(){
    return "Mana";
  }
}
