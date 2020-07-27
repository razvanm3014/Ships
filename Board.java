package ships;


//harta e invers si ncepe de sus in jos
import java.util.Arrays;

//afisat ambele harti la pc vs pc


//print dupa fiecare atac harta sa vad unde o atacat,deci facut harta statica?
//salvat coordonatele  si scris separat coordonate corecte/gresite
//facut board cu output steam

// https://www.youtube.com/watch?v=3YRahx2ltSg

//salvat tot arayul in fila?
//pot salva dupa primul joc harta goala+harta finala (pus finale la random)
//extends game?
public class Board  {
    String[][] board ;
    String pixelOnMap = "O"; //sa poti customiza harta?
    final String fileExtension = ".txt";
    int mapSize=10; //modificat

    String boardName; //playername+board + fileExtension;
    String lineOnBoard;
    public Board(Player playerName){
//        mapSize = boardSize(playerName.getLevel());
    }


    //pot pune line direct in createboard daca nu mai am nevoie altundeva?
    //createboard trebuie sa ia coordonatele navei(tre sa fie in total 10 puncte)



//    public int boardSize(int level){
//        if (level == 1){
//            return 10;
//        }
//        else if (level == 2){
//            return 12;
//        }
//        else if (level == 3){
//            return 15;
//        }
//        else {
//            return 11; //facut doar 3 level,altfel exceptie?
//        }
//    }



    public String[][] createBoard(){
        board = new String[mapSize][mapSize];
        System.out.println(mapSize);
        for(String[] row: board){
            Arrays.fill(row,pixelOnMap);
        }
        return board;
    }

    public void printPresentBoard(){
        for(String[] row: board) {
            //printat spatiu intre caractere?
            System.out.println(Arrays.toString(row));
            System.out.println("");

        }

    }

    public void addVehicleOnBoar(int xAxis,int yAxis){
        board[xAxis - 1] [yAxis -1 ] = "S";
        printPresentBoard();

    }

//    public void addVechiclesOnBoard(int[][] coordonates){ // am nevoie de tot dictionarul
//        !!!!inlocuit array vechi cu coordonate
//        for (Vechicles key : coordonates.keySet()) {
//            System.out.println(coordonates.get(key));
//        }
//
//    }



//    public void saveBoard() throws IOException {
//        //if file exists anuntat
//        //eventual stres filele la sfarsit
//        File path = new File(boardName.join(fileExtension));
//        OutputStream outputStream = new FileOutputStream(path);
//        outputStream.write(lineOnBoard.getBytes()); // trebuie sa adaug si navele
//        outputStream.close();


//    }

    //printat margine 1-10,a-j


    //printat margine 1-10,a-j
    //public void printBoardAfterAttack(){}

//    public String[][] generateRandomBoard{}


}
