package hu.szamalk;

import hu.szamalk.modell.LyukasHenger;
import hu.szamalk.modell.MertaniHEnger;
import hu.szamalk.modell.TomorHenger;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<MertaniHEnger> hengerek;

    public static void main(String[] args) {
        new HengerProgram().run();
    }

    public void run(){
        int db = MertaniHEnger.getHengerDarab();
        System.out.printf(" A feladatban használt hengerek: (%d db)\n",db);
        for (MertaniHEnger henger : this.lista()) {
            System.out.println(henger);
        }

        System.out.println("Hengerek átlagtérfogata: " + this.atlagTerfogat());

        System.out.println("Csövek súlya: " + this.csovekSulya());

        System.out.println("db: " + MertaniHEnger.getHengerDarab());
    }

    public HengerProgram(){
        hengerek = new ArrayList<>();
        //hengerek.add(new MertaniHEnger(1,1));
        //hengerek.add(new TomorHenger(1,1));
       // hengerek.add(new TomorHenger(1,1, .5));
       // hengerek.add(new LyukasHenger(1,1,.1));
       // hengerek.add(new LyukasHenger(1,1,.5));
        //hengerek.add(new LyukasHenger(1,1,1));
        hengerek.add(new LyukasHenger(1,1,1));

    }

    public double atlagTerfogat(){
        double ossz = 0;
        for (MertaniHEnger henger : hengerek) {
            ossz += henger.terfogat();
        }
        return ossz / MertaniHEnger.getHengerDarab();
    }

    public double csovekSulya(){
        double o= 0;
        for (MertaniHEnger henger : hengerek) {
            if (henger instanceof LyukasHenger)
            {
                o += ((LyukasHenger) henger).suly();
            }
        }
        return o;
    }

    private List<MertaniHEnger> lista(){
        return hengerek;
    }


}