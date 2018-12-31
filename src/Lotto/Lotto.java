package Lotto;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    private ArrayList<Integer> answer;
    private ArrayList<Integer> mychoice;
    private int choice_number;
    private int every_number;
    private Random random = new Random();
    public Lotto(int choice_number, int every_number) {
        this.choice_number = choice_number;
        this.every_number = every_number;
    }
    private void getone(ArrayList<Integer> arr) {
        int selected = this.random.nextInt(this.every_number - 1) + 1;
        while(arr.contains(selected)) {
            selected = this.random.nextInt(this.every_number - 1) + 1;
        }
        arr.add(arr.size(), selected);
    }
    private void get(ArrayList<Integer> arr) {
        for(int i=0;i<this.choice_number;i++) {
            getone(arr);
        }
    }
    private boolean answerCheck () {
        System.out.println(this.answer);
        System.out.println(this.mychoice);
        boolean flag = true;
        for(int i=0; i<this.answer.size();i++) {
            if(!this.answer.get(i).equals(this.mychoice.get(i))) {
                flag = false;
            }
        }
        return flag;
    }
    public boolean auto_roll() {
        this.answer = new ArrayList<Integer>();
        this.mychoice = new ArrayList<Integer>();
        get(this.mychoice);
        get(this.answer);
        return answerCheck();
    }
    public boolean manual_roll(ArrayList<Integer> choice) {
        this.answer = new ArrayList<Integer>();
        this.mychoice = choice;
        get(this.answer);
        return answerCheck();
    }
}
