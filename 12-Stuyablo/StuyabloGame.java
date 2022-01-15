import java.util.*;
public class StuyabloGame{
  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;
  public static final int BLACK = 30;
  public static final int RED = 31;
  public static final int GREEN = 32;
  public static final int YELLOW = 33;
  public static final int BLUE = 34;
  public static final int MAGENTA = 35;
  public static final int CYAN = 36;
  public static final int WHITE = 37;
  public static final int BACKGROUND = 10;
  public static final int BRIGHT = 60;
  public static final int BOLD = 1;
  public static final int UNDERLINE = 4;
  public static final int INVERTED = 7;

  public static void reset(){
    System.out.print("\u001b[0m");
  }


  public static void hideCursor(){
    System.out.print("\u001b[?25l");
  }

  public static void showCursor(){
    System.out.print("\u001b[?25h");
  }

  public static void go(int row,int col){
      System.out.print("\u001b[" + row + ";" + col + "f");
  }

  public static void clear(){
    System.out.print("\u001b[2J");
  }

  public static String colorize(String text,int c1){
    return ("\u001b[" + c1 + "m"+text+"\u001b[0m");
  }
  public static String colorize(String text,int c1,int c2){
    return ("\u001b[" + c1 + ";" + c2 + "m"+text+"\u001b[0m");
  }
  public static String colorize(String text,int c1,int c2,int c3){
    return ("\u001b[" + c1 + ";" + c2 + ";" + c3 + "m"+text+"\u001b[0m");
  }

  public static void main(String[] args) {
    run();
  }

  //Display a List of 1-4 adventurers on the rows row through row+3 (4 rows max)
  //Should include Name and HP on 2 separate lines. (more to be added later)
  public static void drawParty(ArrayList<Adventurer> party,int startRow){
    int start = 17;
    int gap = 20;
    for(int i = 0; i < party.size(); i++){
      go(startRow, start + gap*i);
      System.out.print(party.get(i).getName());
      go(startRow+1, start + gap*i);
      System.out.print(party.get(i).playerAbilityType() + ": " + party.get(i).getAbility());
      go (startRow+2, start + gap*i);
      System.out.print("Health: " + party.get(i).getHP() + "/" + party.get(i).getMaxHp());
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
    hideCursor();
    clear();
    go(1,1);


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
      hideCursor();
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
      reset();
      go(HEIGHT+1,1);
      showCursor();
      System.out.print(">");
      //Read user input
      input = in.nextLine();
    }

    //After quit reset things:
    reset();
    showCursor();
    go(32,1);
  }




}
