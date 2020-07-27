package ships;

public class BattleShip extends Vechicles {
    int nrLifes = 3;
    final int attackPower = -3;
    int nrAttacks = 1;
    int reloadingTime = 2; //facut sa astept 2 ture sa pot folosii din nou?
    final int sizeOnMap = 4;
    int[][] coordonates = new int[sizeOnMap][numberOfCoordonates];//inputul tre sa fie marimea asta
    int[] attackCoordonates = new int[2];

    public BattleShip(String name, int[][] coordonates) {
        super(name, coordonates);
    }

    public void attack(int xAxis, int yAxis) {
        attackCoordonates[0] = xAxis;
        attackCoordonates[1] = yAxis;
        if (TestInstruments.checkCoordonatesExist(attackCoordonates)) {
            TestInstruments.checkCoordonatesExist(attackCoordonates, player);//tre sa instantiez la inceput 2 jucatotori
            //atacat celalalt jucator
            //            vechicle.setNrLifes(attackPower);
            //dupa ce am atacat 1 pixel din nava,nu mai pot ataca acolo si trebuie sa imni zica

        } else {
            //throw
        }

    }
}

