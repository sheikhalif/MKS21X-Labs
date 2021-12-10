/*Lab9: Word Search generator
*/
import java.util.ArrayList;

public class WordSearch{
    private char[][]data;
    int rowsNum;
    int colsNum;

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
      rowsNum = rows;
      colsNum = cols;
      data = new char[rows][cols];
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for (int i = 0; i < data.length; i++){
        for (int x = 0; x < data[i].length; x++){
          data[i][x] = '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      for (int i = 0; i < data.length; i++){
        for (int x = 0; x < data[i].length; x++){
          System.out.print(data[i][x]);
          if (x != data[i].length-1){
            System.out.print(" ");
          }
        }
        if (i != data.length-1){
          System.out.print("\n");
        }
      }
      return "";
    }
    public static void main(String args[]){
      /**
      WordSearch example1 = new WordSearch(3, 4);
      example1.clear();
      System.out.println(example1.toString());
      example1.addWordHorizontal("hi", 1, 1);
      System.out.println(example1.toString());
      example1.addWordVertical("bob", 1, 4);
      System.out.println(example1.toString());
      example1.addWordHorizontal("foub", 3, 1);
      System.out.println(example1.toString());

      WordSearch example2 = new WordSearch(5, 5);
      example2.clear();
      System.out.println(example2.toString() + "\n");
      example2.addWordDiagonal("aaaaa", 1, 1);
      System.out.println(example2.toString() + "\n");
      example2.addWordDiagonal("bbbb", 2, 1);
      System.out.println(example2.toString());
      **/

      WordSearch example3 = new WordSearch(10, 10);
      example3.clear();
      System.out.println(example3.toString() + "\n");
      example3.addWord(3, 2, "hello", 1, 1);
      System.out.println(example3.toString() + "\n");
      example3.addWord(10, 10, "tree", -1, -1);
      System.out.println(example3.toString() + "\n");
      example3.addWord(7, 4, "droe", 0, 1);
      System.out.println(example3.toString() + "\n");

    }



    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.
     */
    public boolean addWordHorizontal(String word,int row, int col){
      if (row > rowsNum || col > (colsNum - word.length() + 1)){
        System.out.println("invalid row and col for this word");
        return false;
      }
      for (int i = 0; i < word.length(); i++){
        if (data[row-1][col+i-1] != '_' && data[row-1][col+i-1] != word.charAt(i)){
          System.out.println("word does not fit");
          return false;
        }
      }
      for (int i = 0; i < word.length(); i++){
        data[row-1][col+i-1] = word.charAt(i);
      }
      return true;
    }


   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */
    public boolean addWordVertical(String word,int row, int col){
      if (col > colsNum || row > rowsNum || row > (rowsNum - word.length() + 1)){
        System.out.println("invalid row and col for this word");
        return false;
      }
      for (int i = 0; i < word.length(); i++){
        if (data[row+i-1][col-1] != '_' && data[row+i-1][col-1] != word.charAt(i)){
          System.out.println("word does not fit");
          return false;
        }
      }
      for (int i = 0; i < word.length(); i++){
        data[row+i-1][col-1] = word.charAt(i);
      }
      return true;
    }
    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left towards the bottom right, it must fit on the board,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned
     *and the board is not modified.
     */
    public boolean addWordDiagonal(String word,int row, int col){
      if (col > colsNum || row > rowsNum || row > (rowsNum - word.length() + 1) || col > (colsNum - word.length() + 1)){
        System.out.println("invalid row and col for this word");
        return false;
      }
      for (int i = 0; i < word.length(); i++){
        if (data[row+i-1][col+i-1] != '_' && data[row+i-1][col+i-1] != word.charAt(i)){
          System.out.println("word does not fit");
          return false;
        }
      }
      for (int i = 0; i < word.length(); i++){
        data[row+i-1][col+i-1] = word.charAt(i);
      }
      return true;
    }

    public boolean addWord(int row, int col, String word, int rowInc, int colInc){
      int rowR = row;
      int colR = col;
      for (int i = 0; i < word.length(); i++){
        if (data[rowR-1][colR-1] != '_' && data[rowR-1][colR-1] != word.charAt(i)){
          System.out.println("word does not fit");
          return false;
        }
        rowR += rowInc;
        colR += colInc;
      }
      rowR = row;
      colR = col;
      for (int  i = 0; i < word.length(); i++){
        data[rowR-1][colR-1] = word.charAt(i);
        rowR += rowInc;
        colR += colInc;
      }
      return true;
    }

    public void addAllWords(String filename){
      try{
        ArrayList<String> words = new ArrayList<String>();
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while (input.hasNextLine()){
          String currentWord = input.nextLine();
          if (!(currentWord.equals(""))){
            words.add(input.nextLine());
          }
        }
        

      }
    }
}
