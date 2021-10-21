public class Kitty{
  private int kittyAge;
  private String kittyName;

  public Kitty(String name, int age){
    kittyAge = age;
    kittyName = name;
  }

  public Kitty(){
    kittyAge = 2;
    kittyName = "Mittens";
  }

  public String getName(){
    return kittyName;
  }

  public int getAge(){
    return kittyAge;
  }

  public void changeName(String newName){
    kittyName = newName;
  }

  public void makeOlder(){
    kittyAge++;
  }

  public String toString(){
    return "The amazing "+kittyName;
  }


}
