import java.util.*;
public class StuyabloGame{
  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;
  private static final int BORDER_COLOR = Text.BLACK;
  private static final int BORDER_BACKGROUND = Text.WHITE + Text.BACKGROUND;

  public static void main(String[] args) {
    run();
  }

  //Display a List of 1-4 adventurers on the rows row through row+3 (4 rows max)
  //Should include Name and HP on 2 separate lines. (more to be added later)
  public static void drawParty(ArrayList<Adventurer> party,int startRow){
    int start = 78/(party.size()+1);
    for(int i = 1; i++; i <= party.size()){
      go(5, start*i - 3);
      System.out.print(party.get(i-1).getName());
      go(6, start*i-5);
      System.out.print(party.get(i-1).playerAbilityType() + ": " + party.get(i-1).getAbility());
      go (7, start*i-7);
      System.out.print("Health: " + party.get(i-1).getHP() + "/" + party.get(i-1).getMaxHp());
    }
  }

  //Display a line of text starting at column 2 of the specified row.
  public static void drawText(String s,int startRow){
    go(startRow, 2);
    System.out.print(s);
  }

  public static void drawScreen(){
    for (int i = 0; i < 80; i++){
      System.out.print(colorize(" ", WHITE, WHITE+BACKGROUND));
    }
    for (int i = 0; i < 29; i++){
      System.out.print("\n"+colorize(" ", WHITE, WHITE+BACKGROUND));
    }
    go(30, 1);
    for (int i = 0; i < 80; i++){
      System.out.print(colorize(" ", WHITE, WHITE+BACKGROUND));
    }
    for (int i = 1; i < 31; i++){
      go (i, 80);
      System.out.print(colorize(" ", WHITE, WHITE+BACKGROUND));
    }
  }


  public static void run(){
    //Clear and initialize
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);


    //Things to attack:
    //Make an ArrayList of Adventurers and add 1 enemy to it.
    ArrayList<Adventurer>enemies = new ArrayList<>();
    Adventurer Copper = new Wizard("Copper", "take that", 30);
    enemies.add(Copper);

    //Adventurers you control:
    //Make an ArrayList of Adventurers and add 3 Adventurers to it.
    ArrayList<Adventurer> party = new ArrayList<>();
    Wizard Amber = new Wizard("Amber", "Bing bong", 10);
    Warrior Ferry = new Warrior("Ferry", "ahhhhhhh", 15);
    party.add(Amber);
    party.add(Ferry);

    //Main loop
    boolean partyTurn = false;
    int whichPlayer = 0;
    int turn = 0;


    String input = "";
    Scanner in = new Scanner(System.in);
    while(! (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit"))){

      //Draw the window border
      Text.hideCursor();
      drawScreen();

      //display event based on last turn's input
      if(partyTurn){
        //Process user input:
        if(input.equals("attack")){
          party.get(whichPlayer).attack(enemies.get(0));
        }
        else if(input.equals("special")){
          party.get(whichPlayer).specialAttack(enemies.get(0));
        }
        whichPlayer++;



        if(whichPlayer < party.size()){
          drawText("Enter command for "+party.get(whichPlayer)+
                   ": attack/special/quit",HEIGHT/2);
        }else{
          drawText("press enter to see monster's turn",HEIGHT/2);
          partyTurn = false;
        }
      }else{
        //this block ignores user input!
        //display enemy attack except on turn 0.
        if(turn > 0){
          int attackVictim;
          Random rand = new Random();
          int rng1 = rand.nextInt();
          if (rng1 > 0)attackVictim = 0;
          else{
            attackVictim = 1;
          }
          int rng2 = rand.nextInt();
          int rng3 = rand.nextInt();
          if (enemies.get(0).getAbility() >= 10 && rng2 > 0 && rng3 > 0){
            enemies.get(0).specialAttack(party.get(attackVictim));
          }
          else{
            enemies.get(0).attack(party.get(attackVictim));
          }
        }

        //after enemy goes, change back to player's turn.
        partyTurn=true;
        whichPlayer = 0;
        //display which player's turn is next and prompt for action.
        drawText("Enter command for "+party.get(whichPlayer)+": attack/special/quit",HEIGHT/2);

        //end the turn.
        turn++;

      }

      //display current state of all Adventurers
      drawParty(party,2);
      drawParty(enemies,HEIGHT-5);

      //Draw the prompt
      Text.reset();
      Text.go(HEIGHT+1,1);
      Text.showCursor();
      System.out.print(">");
      //Read user input
      input = in.nextLine();
    }

    //After quit reset things:
    Text.reset();
    Text.showCursor();
    Text.go(32,1);
  }




}
