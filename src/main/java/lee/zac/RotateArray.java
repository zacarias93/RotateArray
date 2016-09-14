package lee.zac;

import java.util.ArrayList;

/**
 * Created by zaclee on 9/14/16.
 */
public class RotateArray<E> extends ArrayList<E> {

    public void rotateList(int k) {

        for(int i = k; i>0; i--) {
            E temp = this.remove(0);
            this.add(this.size(),temp);
        }

    }


    public static void main(String[] args) {

        RotateArray<Integer> arr = new RotateArray<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr.toString());
        arr.rotateList(2);
        System.out.println(arr.toString());



    }





}
