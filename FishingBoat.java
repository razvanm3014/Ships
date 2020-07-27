package ships;
//cum fac nr nelimitat obiecte?

public class FishingBoat extends Vechicles{
    final int healingPoints = 1;
    int nrLifes=3;//nu facut final sa poata scadea?
    final int attackPower=0;
    final int nrAttacks = 0;
    int reloadingTime = 5;      //facut sa scada fiecare tura cate 1 ?

    int[][] coordonates = new int[sizeOnMap][numberOfCoordonates];//inputul tre sa fie marimea asta

    //pus if coordonates[0][1] == 0 error,excewptie?
 //coordonatele pot fi intre 0-10;eventual si a-j
    //facut inca o clasa sa testeze tot si o metoda testarray?
    public FishingBoat(String name ,int[][] coordonates){


        super(name, coordonates);
        sizeOnMap = 1;
    }
//automat adaugat in dictioar dupa ce am creeat

//doar player sa aiba acces?
    public void heatVechicle(Vechicles vechicle){
        //print all my vechicles
        vechicle.setNrLifes(healingPoints);
    }






}