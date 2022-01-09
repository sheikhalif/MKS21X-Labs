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
