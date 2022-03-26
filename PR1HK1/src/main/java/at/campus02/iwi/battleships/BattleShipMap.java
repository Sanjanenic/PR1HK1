package at.campus02.iwi.battleships;

public class BattleShipMap {

    public int[][] map = {
            {0, 0, 0, 2, 0, 1, 1, 0, 0, 0 },  //i broji horizontalne  linije i ide vertikalno, prvi red je i=0, drugi I=1, i[4]j[0]= -1
            {0, 3, -1, 2, 0, 0, 0, 2, 0, 0 },
            {0, 3, -1, 0, 4, 4, 0, 0, 2, 2 },
            {0, 0, 2, 0, 0, 0, 0, 0, 0, 0 },
            {-1, 0, 2, 0, -1, 2, 2, 0, 0, 0 },
            {-3, 1, 0, 0, -3, 0, -1, 0, 0, 3 },
            {0, 0, 0, -3, 0, 0, 0, -1, 0, 3 },
            {0, 0, -2, 0, -2, 0, -2, 0, 0, 0 },

    };

//printati fino dvodimensionalni array
    public void print() {
        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0) {
                    System.out.format(" 0\t");
                } else {
                    System.out.format("%+d\t", map[i][j]);
                }
            }
            System.out.println();
        }
    }

    public int totalBattleShipStrength(char player){
        /* player == 'A' > postive Numbers */
        /* player == 'B' > negative Numbers */
        int powerPlayer=0;


        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

                if(player=='A' && map[i][j]>0 ){

                    powerPlayer=powerPlayer + map[i][j];

                }
                else if(player =='B' && map[i][j] <0 ){

                    powerPlayer=powerPlayer + map[i][j];

                }
            }
            }
//ovo mora izvan for petlje jer inace svaki put se izvrsi pa ne dobijem tacan rezultat
        if (player=='B'){
            powerPlayer=powerPlayer*(-1);
        }
         return powerPlayer;

    }


    // returns total number of ships
    public int totalCountBattleShips() {
        int sumTotalShip=0;
        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

                if(map[i][j]<0  || map[i][j]>0){
                    sumTotalShip=sumTotalShip+1;

                }
            }
            }
        return sumTotalShip;
    }

    // returns a one-dim-array with count in every line
    public int[] countOfShipsPerLine() {

        int [] shipsPerLine=new int[map.length];//pomocni niz u koji stavljam vrijednosti nove

        for(int i = 0; i < map.length; i++) { //prva for petlja ide kroz i tj.kolona 1, pa kolona 2,...vertikalno
                                          // ali horizontalno, za i=0 prodje kroz prvu horizontalnu liniju koju treba staviti u prvi clan novog arrayja
            int sumShip=0;               //ovdje setujem na 0 da bi svaki put za novi i racunao od pocetka, sa 0.

            for (int j = 0; j < map[i].length; j++) {  //druga for petlja ide kroz redove horizontalne i u redu svakom sabira brodove
                if(map[i][j]!=0 ) {
                    sumShip = sumShip + 1;
                }
            }
            shipsPerLine [i]=sumShip;// ovo upisuje brojeve u novi pomocni niz, i mora biti poslije unutrasnje for
                                     // petlje ali unutar vanjske.
            }


        return shipsPerLine;
    }

    // returns the average ship strength of player A ships (positive numbers)
    public double averageShipStrengthPlayerA(){
int a=totalBattleShipStrength('A'); //pomocna varijabla a koja prima rezultat metode koja racuna snagu brodova za aA igraca
double average=0;                          //pomocna koja racuna prosjek
int nummerOfShips=0;                      //pomocna u koju sacuvavam brojanje brodova
        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

                if( map[i][j]>0){                   //if kupi samo brojeve za igraca A i sabiram ih u pomocnu varijablu
                    nummerOfShips=nummerOfShips+1;


                }
            }
        }
        average=Double.valueOf(a)/Double.valueOf(nummerOfShips);  //konverzija int u Double, kombinacija double i int u racunanju daje pogresan rezultat
                                                                  //zato je neophodno pretvoriti.



       return average;
    }
}
