package SimpleDotComGame;

import java.util.ArrayList;

public class SimpleDotComGame {

    private int numOfGuesses = 0;
    GameHelper gameHelper = new GameHelper();
    ArrayList<DotCom> dotComList = new ArrayList<>();

    public static void main(String[] args) {
        SimpleDotComGame game = new SimpleDotComGame();
        game.setUpGame();
        game.startPlaying();
    }

    private void setUpGame() {
        DotCom dotCom1 = new DotCom();
        dotCom1.setName("Линкор");
        DotCom dotCom2 = new DotCom();
        dotCom2.setName("Крейсер");
        DotCom dotCom3 = new DotCom();
        dotCom3.setName("Эсминец");
        dotComList.add(dotCom1);
        dotComList.add(dotCom2);
        dotComList.add(dotCom3);

        System.out.println("Ваша цель - потопить три корабля:");
        System.out.println("Эсминец, Крейсер и Линкор");
        System.out.println("Попытайтесь потопить их за минимальное количство ходов!");

        for (DotCom dotCom : dotComList) {
            ArrayList<String> newLocation = gameHelper.placeDotCom(3);
            dotCom.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = gameHelper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";

        for (DotCom dotCom : dotComList) {
            result = dotCom.checkYourself(userGuess);
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                dotComList.remove(dotCom);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все корабли ушли ко дну!");
        if(numOfGuesses<=18) {
            System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток!");
        }
        else {
            System.out.println("Это заняло у вас довольно много времени... " + numOfGuesses + " попыток.");
        }
    }

}
