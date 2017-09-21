package com.example.kylemiller.list_practise;

import java.util.ArrayList;

/**
 * Created by kylemiller on 20/09/2017.
 */

public class Chart {

    private ArrayList<Album> chart;

    public Chart(){
        chart = new ArrayList<>();
        chart.add(new Album(1, "X", "Pop", "Ed Sheeran"));
        chart.add(new Album(2, "Broken Machine", "Pop", "Nothing but Thieves"));
        chart.add(new Album(3, "Human", "Pop", "Rag'n Bone Man"));
        chart.add(new Album(4, "Freedom Child", "Indie Rock", "The Script"));
        chart.add(new Album(5, "Hitchhiker", "Rock", "Neil Young"));
        chart.add(new Album(6, "Out of all This Blue", "RnB", "The Waterboys"));
        chart.add(new Album(7,"Villans", "Rock", "Queens of the Stone Age"));
        chart.add(new Album(8, "Dua Lipa", "Alternative", "Dua Lipa"));
        chart.add(new Album(9, "Forest Hills Drives", "Rap", "J Cole"));
        chart.add(new Album(10, "Gang Signs n Prayers", "Grime", "Stormzy"));
    }


        public ArrayList<Album> getChart(){
            return new ArrayList<>(chart);
        }
}
