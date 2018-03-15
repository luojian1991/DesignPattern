package com.lj.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lj.designpattern.Observer.Observer3;
import com.lj.designpattern.Observer.SubjectFor3d;
import com.lj.designpattern.Observer.SubjectForSSD;
import com.lj.designpattern.Observer.custom.ObjectFor3D;
import com.lj.designpattern.Observer.custom.Observer1;
import com.lj.designpattern.Observer.custom.Observer2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnTest = findViewById(R.id.btn_test);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ObjectFor3D objectFor3D = new ObjectFor3D();
//                Observer1 observer1 = new Observer1();
//                Observer2 observer2 = new Observer2();
//                objectFor3D.registerObserver(observer1);
//                objectFor3D.registerObserver(observer2);
//                objectFor3D.setMsg("2018年3月15号的3D号码是：154");
//                objectFor3D.setMsg("2018年3月16号的3D号码是：999");
                SubjectFor3d subjectFor3d = new SubjectFor3d();
                SubjectForSSD subjectForSSD = new SubjectForSSD();
                Observer3 observer3 = new Observer3();
                subjectFor3d.addObserver(observer3);
                subjectForSSD.addObserver(observer3);
                subjectFor3d.setMsg("3d num :5452");
                subjectForSSD.setMsg("ssd num :7848");
            }
        });
    }
}
