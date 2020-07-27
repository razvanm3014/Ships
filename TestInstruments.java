package ships;

import java.util.Arrays;
import java.util.Map;

//in ce clasa sa pun daca vreau sa folosesc doar metodele?
public class TestInstruments {


    //facut fara bool?
    //filtrat/lambda?
    //return array / eroare /array gol



    //check if 2 elemtns numne
    public static boolean checkIfArrayIsValid(int[][] coordonates){
        boolean b = false; //rezolvat
        for(int[] row : coordonates){
            if (row.length > 2){
                //exception
                return false;
                //thriow exception
            }
            else if(row[0] > 2 || row[0] < 0){
                return false;
            }
            else return row[1] <= 2 && row[1] >= 0;
            //exceptiuoin/retun arrayh
        }
        return b;
    }


//check beetween0-10
    public static boolean checkCoordonatesExist(int[] attackCoordonates){
        if (attackCoordonates[0] < 10 && attackCoordonates[0] > 0 && attackCoordonates[1] < 10 && attackCoordonates[1] > 0 ){
            return true;
        }
        else{
            return  false;
        }
    }


//nume general
     public static void checkCoordonatesExist(int[] attackCoordonates, Player player){
         for (Map.Entry single : player.getPlayersVechicles().entrySet()){
             if(Arrays.equals(attackCoordonates, (int[]) single.getValue())){
                 //get array,replace wityhout coordonates,replace in dictionary
                 //replacearray(alta metoda
                 //System.out.println("You hit ship {}",%s(player.getName()));
             }
             else{
                 System.out.println("You didn`t hit any vechicle. Better luck next time!");
             }
         }

     }
}
