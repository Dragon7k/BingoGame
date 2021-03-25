package sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NUmber {

    ArrayList<Integer> forShaffle;
    ArrayList<Integer> num;
    NUmber(){
         forShaffle = new ArrayList(40);
         num = new ArrayList(16);
    }

    public void shaffleList(ArrayList list){
        for(int i=1;i<=40;i++){
            forShaffle.add(i);
        }
        Collections.shuffle(forShaffle);
        System.out.println(forShaffle.toString());
    }

    public void addNum(ArrayList list,ArrayList forAdd){
        for(int i=0;i<16;i++) {
            list.add(forAdd.get(i));
        }
    }
    public ArrayList<Integer> getList(){
        shaffleList(forShaffle);
        addNum(num,forShaffle);
        return num;
    }
}
