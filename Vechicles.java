package ships;
//sa nu pot face vechicles,doar submarin si battleshi[p
//private sau interface


//? cu submarinul ataci de 2 ori dar scazi 1 viata,cu battleship ataci odata scazi3,
//submarinul incarca odata la 10 ture si battleship la 8


public abstract class Vechicles {
    //facut toate private?
    Player player;
    String name ;
    String owner;


    int nrLifes;
    int attackPower;
    int nrAttacks;

    int reloadingTime;
    int sizeOnMap;

    final int numberOfCoordonates = 2;
    int[][] coordonates ;
    //facuut sa aiba 2 elemente in al 2-;ea array
    //altfel eroare





    public Vechicles(String name,int[][] coordonates){ //  player constructor
        this.name = name;
        if(TestInstruments.checkIfArrayIsValid(coordonates)){
            this.coordonates = coordonates;
//            this.owner = player.getName();
        }
        else{
            //exceptie
        }


    }

    public void setNrLifes(int addLifes){
        nrLifes+=addLifes;

    }

    public int getNrLifes(){
        return nrLifes;
    }

    public String getName(){
        return name;
    }

    public int getSizeOnMap(){return sizeOnMap;} // returneaza 0 la fishingboat

    //metoda magic,stai 2 ture si a 3-a ataci cu 2xpower
    //metoda invisible





}
