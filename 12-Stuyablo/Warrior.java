public class Warrior extends Adventurer {
    private int  rage;
    private String warcry;
    private int maxHp;

    public Warrior(){
	     this("Magnus");
    }

    public Warrior(String name){
	     this(name,"Valhalllaaaaa!!", 18);
    }

    public Warrior(String name, String warcry, int rage){
      super(name, 30+(int)(Math.random()*10));
      maxHp = this.getHP();
      setAbilityCall(warcry);
      setAbility(rage);
    }

    //warrior methods

    public String attack(Damageable other){
    	  int damage = (int)(Math.random()*10)+1;
  	    other.applyDamage(damage);
  	    setAbility(getAbility() + 1);
  	    return (this + " attacked " + other + " for " + damage + " damage!");
    }

    public String specialAttack(Damageable other){
	     if(getAbility() >= 10){
  	        int damage = (int)(Math.random()*20)+1;
            other.applyDamage(damage);
            setAbility(getAbility() - 10);
            return (this + " unleashes his fury upon " + other + " for " + damage + " damage! "+warcry);
	    }else{
        attack(other);
			  return("Not enough rage!");
	    }
    }

    //get methods

    public int getAbility(){
	     return rage;
    }

    //set methods
    public void setAbility(int r){
      int maxCheck = r;
      if (maxCheck > 45)maxCheck = 45;
	     this.rage = maxCheck;
    }

    public void setAbilityCall(String warcry){
	     this.warcry = warcry;
    }

    public int getMaxHp(){
      return maxHp;
    }

    public String playerAbilityType(){
      return "Rage";
    }


}
