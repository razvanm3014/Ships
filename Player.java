package ships;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//select weapon fiecare tura
//player attack?
//cand dobor 1 vehicul print vechicle nume is down,la fel si la atac
//salvat in text nujme si la sf scor,sortat cu comparator top 10,metoda print top
//extends Game#?
public class Player {
    private String name;
    private int level;
    private int numberLifes; // facut dupa nivel?
    private int numberPoints = 10;

    //cand creez vehicul sa il adauge in dictionar
    Map<Vechicles, int[][]> playersVechicles = new HashMap<>();


    public Player(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

//vehiculele au vieti
//    public int getNumberLifes(){
//        return numberLifes;
//    }
//
//    public int getNumberPoints(){
//        return numberPoints;
//    }


//putifabsent?

    public void choseVechicle(Board player1Board) {
        //facut final dimensiuni array?


        Scanner input = new Scanner(System.in);

        System.out.println("What vechichle?");
        int option = input.nextInt();
        if (option == 1) {
            //pot pune metoda createFishingBoat()
            System.out.println("fishing boat");
            System.out.println("Enter the name of the vehicle");
            String name = input.nextLine();
            System.out.println("enter coordonates(1-10)");
            int xAxis = input.nextInt();
            System.out.println("enter coordonates(A-j)");
            int yAxis = input.nextInt(); //char - asciidiference
            //pot adauga direct pe board
            int[][] coordonates = new int[1][2];
            //new int[fisinghboat.sizeonmap][maxcoordonates?]
            coordonates[0][0] = xAxis;
            coordonates[0][1] = yAxis;
            FishingBoat fishingBoat = new FishingBoat(name, coordonates);
            System.out.println("________________________");



            playersVechicles.put(fishingBoat, coordonates);

            System.out.println(Arrays.deepToString(playersVechicles.get(fishingBoat)));
            player1Board.addVehicleOnBoar(xAxis,yAxis);


//            playersVechicles.put(new FishingBoat(name, coordonates), coordonates);
            //aici pus si pe harta


            //System.out.println("You have %n points left", numberPoints);
            //- eventual si recomandari din punctele ramase
            //printat cate puncte ramase am si ce vreau sa adaug?

        }
//        else if (option == 2){
//
//            System.out.println("submarine");
//
//            String name = input.nextLine();
//            int startXaxis = input.nextInt();
//            int startYaxis = input.nextInt();
//            int endXaxis = input.nextInt();
//            int endYaxis = input.nextInt();
//
//            //new int[submarine.sizeonmap][vechicles.numberOfCoordonates]
//            int[][] coordonates = new int[3][2];
//
//
//
//            //verificat sa fie diferenta sizeOnMap intre min si max
//            //alta metoda? creeateCoordonatesArray
//            if (startXaxis == endXaxis){
//                for (int i = 0;i <=3 ; i++){
//                    coordonates[i][0] = startXaxis;
//                    coordonates[i][1] = startYaxis + i;
//                }
//
//            }
//
//            else if(startYaxis == endYaxis){
//                for (int i = 0;i <=3 ; i++){
//                    coordonates[i][0] = startXaxis+ i;
//                    coordonates[i][1] = startYaxis ;
//                }
//
//
//            }
//
//            return new Submarine(name,coordonates);
//        }
//        else if (option == 3){
//            System.out.println("battleship");
//            int[][] coordonates = new int[4][2];
//            String name = input.nextLine();
//            int startXaxis = input.nextInt();
//            int startYaxis = input.nextInt();
//            int endXaxis = input.nextInt();
//            int endYaxis = input.nextInt();
//
//
//
//            if (startXaxis == endXaxis){
//
//            }
//
//            else if(startYaxis == endYaxis){
//
//
//
//            }
//
//            return new BattleShip(name,coordonates);
//        }
//


    }


    //creeateFishingBoat
    //creeateSubmarine
    //creeateBattleShip


    public int checkVechiclesLeft() {
        int pointsLeft = 10;
        for (Vechicles vechicle : playersVechicles.keySet()) {
            int vechicleSizeOnMap = vechicle.getSizeOnMap();
            System.out.println(vechicleSizeOnMap);
            pointsLeft -= vechicleSizeOnMap;
        }

        String message = String.format("You have %s%n points left:", pointsLeft);
        System.out.println(message);
        return pointsLeft;
    }


    public void addVechicles(Board playerBoard) {
        int pointsLeft = checkVechiclesLeft(); //facut cumva sa nu il folosesc pt ca printeaza de 2 ori
        while(pointsLeft> 8){
            pointsLeft = checkVechiclesLeft();
            choseVechicle(playerBoard);


            for (Vechicles key : playersVechicles.keySet()) {
//                System.out.println("value : " + Arrays.deepToString( playersVechicles.get(key)));
                System.out.println(playersVechicles.get(key)[0][0]);
                System.out.println(playersVechicles.get(key)[0][1]);

//                playerBoard.addVechiclesOnBoard(playersVechicles.get(key));
                // tre sa filtrez sa nu mearga de mai multe ori pe acelasi punct

            }



            //System.out.println(pointsLeft + "pointsLeft");
            //playerBoard.printPresentBoard();

            if (pointsLeft == 3) {
                System.out.println("Fishing/Submarine");
            } else if (pointsLeft == 2 || pointsLeft == 2) {
                System.out.println("fishing");
            } else if (pointsLeft == 0) {
                System.out.println("no points");
            }
        }
    }


    public Map<Vechicles, int[][]> getPlayersVechicles() {

        return playersVechicles;
    }
}
