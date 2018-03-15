package com.lj.designpattern.Observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ff on 2018/3/15.
 */

public class Observer3 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof SubjectFor3d){
            SubjectFor3d subjectFor3d = (SubjectFor3d)o;
            Log.d("observer3","subjectfor3d's message -->" +subjectFor3d.getMsg());
        }
        if(o instanceof SubjectForSSD){
            SubjectForSSD subjectForSSD = (SubjectForSSD)o;
            Log.d("observer3","subjectforssd's message -->" +subjectForSSD.getMsg());

        }
    }
}
