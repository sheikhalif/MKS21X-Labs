public class WordSearch{
    private char[][]data;

    public WordSearch(int rows,int cols){
      private int rowsNum = rows;
      private int colsNum = cols;
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
      WordSearch example1 = new WordSearch(3, 4);
      example1.clear();
      System.out.println(example1.toString());
      example1.addWordHorizontal("hi", 1, 1);
      System.out.println(example1.toString());
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
      if (col > colsNum || row > (rowNum - word.length() + 1)){
        System.out.println("invalid row and col for this word");
        return false;
      }
      for (int i = 0; i < word.length(); i++){
        if (data[row-1][col+i-1] != '_' || data[row][col+i] != word.charAt(i)){
          return false;
        }
      }
      for (int i = 0; i < word.length(); i++){
        data[row-1][col+1-1] = word.chatAt(i);
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
    //public boolean addWordVertical(String word,int row, int col){
    //}
}
