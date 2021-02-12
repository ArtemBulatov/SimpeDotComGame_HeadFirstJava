package SimpleDotComGame;

import SimpleDotComGame.DotCom;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {

        DotCom dot = new DotCom();

        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "Неудача";

        if (result.equals("Попал")){
            testResult = "Тест пройден";
        }

        System.out.println(testResult);

    }
}
