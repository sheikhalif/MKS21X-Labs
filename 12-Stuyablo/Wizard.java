public class Wizard extends Adventurer {
  private int mana;
  private String spellName;

  public Wizard(){
    this("Harry");
  }

  public Wizard(String name){
    this(name, "Hocus Pocus", 20);
  }

  public Wizard(String name, String spellName, int mana){
    super(name,30+(int)(Math.random()*10));
    setSpellName(spellName);
    setMana(mana);
  }

  public void attack(Damageable other){
      int damage = (int)(Math.random()*10)+1;
      other.applyDamage(damage);
      setMana(getMana() + 1);
      System.out.println(this +
          " attacked " + other + " for " +
          damage + " damage!");
  }

  public void specialAttack(Damageable other){
     if(getMana() >= 10){
          int damage = (int)(Math.random()*20)+1;
          other.applyDamage(damage);
          System.out.println(this + " cast a spell on "
           + other + " for " + damage + " damage! "+ spellName);
          setMana(getMana() - 10);
    }else{
        System.out.println("Not enough mana! ");
        attack(other);
    }
  }

  public int getMana(){
     return mana;
  }

  public void setMana(int r){
     this.mana = r;
  }

  public void setSpellName(String spellName){
     this.spellName = spellName;
  }
}
