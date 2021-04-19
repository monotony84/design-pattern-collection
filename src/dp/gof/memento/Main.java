package dp.gof.memento;

import dp.gof.memento.game.Gamer;
import dp.gof.memento.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for(int i = 0; i < 100; i++) {
            System.out.println("====" + i);
            System.out.println("現状:" + gamer);

            gamer.bet();

            System.out.println("所持金は" + gamer.getMoney() + "円になりました");

            if(gamer.getMoney() > gamer.getMoney())  {
                System.out.println("(だいぶ増えたので、現在の状況を保存しておこう)");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2 ) {
                System.out.println("(だいぶ減ったので、現在の状況に納得しておこう)");
                gamer.restoreMemento(memento);
            }

            //時間待ち
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {

            }
            System.out.println("");
        }

    }
}
