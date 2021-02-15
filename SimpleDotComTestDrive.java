package SimpleDotComGame;


import java.util.ArrayList;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {

        DotCom dot = new DotCom();

        ArrayList<String> locations = new ArrayList<>();
        locations.add("A1");
        locations.add("A2");
        locations.add("A3");
        dot.setLocationCells(locations);

        String userGuess = "A3";
        String result = dot.checkYourself(userGuess);
        String testResult = "Неудача";

        if (result.equals("Попал")){
            testResult = "Тест пройден";
        }

        System.out.println(testResult);

    }
}
