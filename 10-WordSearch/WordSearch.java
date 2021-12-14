import java.util.*;
import java.io.*;
public class WordSearch{
  private char[][] grid;
  private ArrayList<String> wordsAdded;
  private Random rng;
  private int seed;

  public static void main(String args[]){
    WordSearch example1 = new WordSearch(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2]);
    if (args.length == 6){
      WordSearch example1 = new WordSearch(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2], Integer.parseInt(args[4]));
    }
    if (Integer.parseInt(args[3]) == 0){
      example1.fillInRandomLetters();
    }
    System.out.println(example1.toString());
  }

  //assume a rectangular grid

  private void fillInRandomLetters(){
    rng = new Random();
    rng = new Random(seed);
    for (int i = 0; i < grid.length; i++){
      for (int x = 0; x < grid[i].length; x++){
        if (grid[i][x] == '_'){
          grid[i][x] = (char)('A' + rng.nextInt(26));
        }
      }
    }
  }

  private void addAllWords(String filename){
    ArrayList<String> wordsToAdd = loadWordsFromFile(filename);
    for (int x = 0; x < wordsToAdd.size(); x++){
        for (int i = 0; i < grid.length * grid[0].length * 100; i++){
          int ranRowInc = randomDirection(false);
          int ranColInc = randomDirection(ranRowInc == 0);
          if (addWord(wordsToAdd.get(x), randomNum(0, grid.length), randomNum(0, grid[0].length), ranRowInc, ranColInc) == true){
            i = grid.length * grid[0].length * 100;
          }
        }
      }
    }
    private int randomDirection(boolean bool){
      while (true){
        Random random = new Random();
        random = new Random(seed);
        int num = random.nextInt(3);
        if (bool == false){
          if (num != 0){
            return num - 1;
          }
        }
        if (bool == true){
          if (num != 0 && num != 2){
            return num - 2;
          }
        }

      }
    }
    private int randomNum(int small, int large) {
      Random random = new Random();
      random = new Random(seed);
      return random.nextInt(large - small) + small;
    }

  public WordSearch(int rows,int cols, String fileName){
    rng = new Random();
    seed = rng.nextInt();
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public WordSearch(int rows,int cols, String fileName, int s){
    seed = s;
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public static ArrayList<String> loadWordsFromFile(String fileName){
    ArrayList<String>words = new ArrayList<String>();
    try{
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
        String line = input.nextLine();
        if(! line.equals("")){
          words.add(line.toUpperCase());
        }
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
      System.exit(1);
    }
    return words;
  }



  private void clear(){
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        grid[r][c]='_';
      }
    }
  }


  //precondition word grids are rectangular
  private boolean inBounds(int r, int c){
    return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
  }
  public boolean addWord(String word,int row, int col, int dr, int dc){
    //make sure there is some non 0 vector for direction
    if(dr == 0 && dc == 0){
      return false;
    }
    //check endpoints of word
    if(!inBounds(row,col) || !inBounds(row + dr * (word.length() - 1), col + dc * (word.length() - 1 ))){
      return false;
    }
    //check for conflicting letters
    for(int i = 0; i < word.length(); i++){
      char c = grid[row + i * dr][col + i * dc];
      if(c != '_' && c != word.charAt(i)){
        return false;
      }
    }
    //change
    for(int i = 0; i < word.length(); i++){
      grid[row + i * dr][col + i * dc] = word.charAt(i);
    }
    wordsAdded.add(word);
    return true;
  }

  public String toString(){
    String ans = "";
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        ans += grid[r][c]+" ";
      }
      ans+="\n";
    }
    ans += "words: ";
    for(String word:wordsAdded){
      ans+= word+" ";
    }
    ans += "\nseed: "+seed;
    return ans;
  }
}
