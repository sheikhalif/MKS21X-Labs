import java.util.Random;
public abstract class Adventurer implements Damageable{
    private String name;
    private int HP;

    //Abstract methods are meant to be implemented in child classes.
    public abstract String attack(Damageable other);
    public abstract String specialAttack(Damageable other);

    public Adventurer(){
  	   this("Lester");
    }

    public Adventurer(String name){
  	   this(name, 10);
    }

    public Adventurer(String name, int hp){
       this.name = name;
       this.HP = hp;
    }

    //toString method
    public String toString(){
    	return this.getName();
    }

    //Get Methods
    public String getName(){
    	return name;
    }

    public int getHP(){
	     return HP;
    }

    public void applyDamage(int amount){
      this.HP -= amount;
    }

    //Set Methods
    public void setHP(int health){
	     this.HP = health;
    }

    public void setName(String s){
	     this.name = s;
    }

    public String playerAbilityType(){
      return "Error: this playerAbilityType() call is in the parent adventurer class";
    }

    public int getAbility(){
      return -1;
    }

    public int getMaxHp(){
      return -1;
    }


}
