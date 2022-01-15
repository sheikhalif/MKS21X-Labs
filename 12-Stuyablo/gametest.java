import java.util.*;
import java.io.*;
import java.lang.*;

public class gametest{
  /*Base colors*/
  public static final int BLACK = 30;
  public static final int RED = 31;
  public static final int GREEN = 32;
  public static final int YELLOW = 33;
  public static final int BLUE = 34;
  public static final int MAGENTA = 35;
  public static final int CYAN = 36;
  public static final int WHITE = 37;

  /*Text modifiers to be ADDED to a color*/
  public static final int BACKGROUND = 10;
  public static final int BRIGHT = 60;

  /*Text modifiers that are separate from color*/
  public static final int BOLD = 1;
  public static final int UNDERLINE = 4;
  public static final int INVERTED = 7;

  /*Reset colors*/
  public static void reset(){
    System.out.print("\u001b[0m");
  }


  public static void hideCursor(){
    System.out.print("\u001b[?25l");
  }

  public static void showCursor(){
    System.out.print("\u001b[?25h");
  }

  /*Move the cursor to a specified row/col on the terminal*/
  public static void go(int row,int col){
      System.out.print("\u001b[" + row + ";" + col + "f");
  }

  /*Erases all text on the terminal.*/
  public static void clear(){
    System.out.print("\u001b[2J");
  }

  /*Overloaded Colorize methods.
    c1,c2 and c3 are any color modifiers such as bold/color/background color etc.
  */
  public static String colorize(String text,int c1){
    return ("\u001b[" + c1 + "m"+text+"\u001b[0m");
  }
  public static String colorize(String text,int c1,int c2){
    return ("\u001b[" + c1 + ";" + c2 + "m"+text+"\u001b[0m");
  }
  public static String colorize(String text,int c1,int c2,int c3){
    return ("\u001b[" + c1 + ";" + c2 + ";" + c3 + "m"+text+"\u001b[0m");
  }

  public static void makeScreen () {
    for (int i=0; i<80; i++) {
      System.out.print(colorize(" ", BLUE, BLUE+BACKGROUND));
    }
    for (int i=0; i<29; i++) {
      System.out.print("\n"+colorize(" ", BLUE, BLUE+BACKGROUND));
    }
    go (30,1);
    for (int i=0; i<80; i++) {
      System.out.print(colorize(" ", BLUE, BLUE+BACKGROUND));
    }
    for (int i=1; i<31; i++) {
      go (i,80);
      System.out.print(colorize(" ", BLUE, BLUE+BACKGROUND));
    }
  }

  public static void redrawArray (int[] ary) {
    int inc = 78/5+1;
    for (int i = 0; i<ary.length; i++) {
      String temp = "" + ary[i];
      go(2, inc);
      if (ary[i]<25) {
        System.out.print(colorize(temp, RED));
      }
      else if (ary[i]>75) {
        System.out.print(colorize(temp, GREEN));
      }
      else {
        System.out.print(colorize(temp, WHITE));
      }
      inc+=78/5;
    }
  }

  //Tested and working in:
  //git-bash (windows 10),    wsl (windows 10+11),   powershell windows 11
  public static void main(String[] args) {
    int count = 31;

    // making array

    int[] a = new int[4];
    for (int i =0; i<4; i++) {
      a[i] = (int)(Math.random()*100);
    }

    clear();
    go(1,1);
    makeScreen();

    // designing game screen

    go(count,1);
    System.out.print(">");
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();

    while (!(input.equals("q") || input.equals("quit"))) {
      showCursor();
      //count+=30;
      if (input.equals("")) {
        clear();
        go(1,1);
        makeScreen();
        redrawArray(a);
      }
      else {
        clear();
        go(1,1);
        makeScreen();
        for (int i=0; i<4; i++) {
          a[i] = (int)(Math.random()*100);
        }
        redrawArray(a);
      }
      go(count,1);
      input = in.nextLine();
    }
    System.exit(1);
  }
}
