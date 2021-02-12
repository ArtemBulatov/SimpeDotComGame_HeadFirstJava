package SimpleDotComGame;

import java.util.ArrayList;

public class SimpleDotComGame {

    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper gameHelper = new GameHelper();

        DotCom dotCom1 = new DotCom();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        dotCom1.setLocationCells(locations);

        boolean isAlive = true;

        ArrayList<String> listOfNums = new ArrayList<>();
        while (isAlive) {

            String guess = gameHelper.getUserInput("Введите число");
            if (!listOfNums.contains(guess)) {
                listOfNums.add(guess);
                String result = dotCom1.checkYourself(guess);
                numOfGuesses++;

                if (result.equals("Потопил")) {
                    isAlive = false;
                    System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
                }
            }
            else {
                System.out.println("Это число уже вводилось ранее. Попробуйте снова");
                numOfGuesses++;
            }
        }


    }
}
