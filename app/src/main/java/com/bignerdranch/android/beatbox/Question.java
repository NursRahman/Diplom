package com.bignerdranch.android.beatbox;

import java.util.Random;

/**
 * Created by nurs on 5/23/17.
 */

public class Question {

        Random random = new Random();
        int first_num = random.nextInt(10) + 1;
        int second_num = random.nextInt(10) + 1;
        int flag = random.nextInt(2);

        public int getFirst_num() {
            return first_num;
        }

        public int getFlag() {
            return flag;
        }

        public int getSecond_num() {
            return second_num;
        }

        public void setQuestion(){

//            SetImageArray obj = new SetImageArray();
//            obj.ImageArray();
//
//            TestMathActivity ob = new TestMathActivity();
//            ob.a.setImageDrawable(obj.getImageArray(getFirst_num()));
        }
}
