package ships;

public class Submarine extends Vechicles{

    int nrLifes = 4;
    final int attackPower=-1;
    int nrAttacks = 2;
    int reloadingTime = 0;
    final int sizeOnMap = 3;
    int[][] coordonates = new int[sizeOnMap][numberOfCoordonates];//inputul tre sa fie marimea asta
    int[] attackCoordonates = new int[2];


    public Submarine(String name ,int[][] coordonates){
        super(name, coordonates);
    }

    public void attack(int xAxis, int yAxis){
        attackCoordonates[0] = xAxis;
        attackCoordonates[1] = yAxis;

        //facut sa atace de 2 ori,2 coordonate diferite
        if(TestInstruments.checkCoordonatesExist(attackCoordonates) ){
            TestInstruments.checkCoordonatesExist(attackCoordonates, player);//tre sa instantiez la inceput 2 jucatotori
            //atacat celalalt jucator
            //            vechicle.setNrLifes(attackPower);
            //dupa ce am atacat 1 pixel din nava,nu mai pot ataca acolo si trebuie sa imni zica

        }
        else
        {
            //throw
        }
    }

}


