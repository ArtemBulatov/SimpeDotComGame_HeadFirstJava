package SimpleDotComGame;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private int numOfHits = 0;
    private String name;

    public String checkYourself(String stringGuess) {
        String result = "Мимо";

        int index = locationCells.indexOf(stringGuess);
        if (index>=0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result = "Потопил";
                System.out.println("Вы потопили " + name);
            }
            else {
                result = "Попал";
            }
        }

        return result;
    }

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
