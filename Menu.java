
package ships;

//la sf printat harta initiala si finala(dupa atac) si posibilitatea de salvat in txt



import java.util.Scanner;
import ships.Player;
import ships.Board;
//daca le sterg se face cu rosu,dar merge si fara

public class Menu{
    Scanner input = new Scanner(System.in);


    public void countDown(int secondsLeft){
        String message=String.format("The game will start in %s%n seconds",secondsLeft);
        System.out.println(message);
        int count = 0;
        while(secondsLeft > -1)
        {
            secondsLeft--;
            try {
                Thread.sleep(1000);
                count ++;
                System.out.println(secondsLeft);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Start!");
    }

    public void start(){
        //countDown(5); pus la sf


        Player player1;
        Player player2;
        Board player1Board;
        Board player2Board;



        int choseGame = choseGame();
        if (choseGame == 1){
            player1= creeatePlayer();
            player1Board = new Board(player1);
            player1Board.createBoard();


//            player2 = creeateComputer();
            System.out.println("Creeate map");
            creeateMap(player1,player1Board);
//            System.out.println("WWWWWWWWWWWW");
//            creeateMap(player2);

        }
        else
        {
            player1= creeatePlayer();
            player2= creeatePlayer();
        }






    }

    public int choseGame(){
        System.out.println("Press 1 for Player vs Computer");
        System.out.println("Press 2 for Player vs Player");
        return input.nextInt();
        //sa nu ma lase sa pun litere sau alte nr
    }


    public Player creeatePlayer(){
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Select difficulty (1 opponent map 10x10,2 12x12, 3 15x15");
        int level = input.nextInt();
        return new Player(name,level);
    }

    public Player creeateComputer(){
        //modificat

        //pot pune si random
        System.out.println("Select difficulty (1 opponent map 10x10,2 12x12, 3 15x15");
        int level = input.nextInt();
        //apelat metoda sa genereze harta singur
        return new Player("Computer",level);

    }


    public void creeateMap(Player player,Board playerBoard){
        System.out.println("You can creeate 3 types of vechicles: ");
        System.out.println("1)Fishing boat(heals other vechicles)-1 point");
        System.out.println("2)Submarine(fast attack) - 3 points ");
        System.out.println("3) Battleship(powerfull attack) - 4 points");

        player.addVechicles(playerBoard);


//
//         whiule pct < 10L
//        Vechicle vechicle = createVechicle()
//                addInMap*(vechicle)  12
//                            vechicle : 12
//        vechicle : 13
//        vechicle : 14
//
//        creeateVecjhicle? print(totalPointsLeft)
//





        System.out.println("Where do you want to put it?");
        //showCurrentMap()
        //int[] coordonates = new int[sizeonmap][2]
        //adaugat dictionar vehicul cu coordonates si de acolo luat coordonatele?
        //        player.addVechicles();

        //dupa fiecare vehicul aratat harta









    }



    public void generateMap(Player player){

    }


    public void choseMap(Player player,Board playerBoard){

        System.out.println("Press 1 to create your map or 2 to generate a random map ");
        int choice = input.nextInt();
        if(choice == 1){
            creeateMap(player,playerBoard);
            countDown(5);
        }
        else if(choice == 2){
            generateMap(player);
            countDown(5);
        }

    }



}
