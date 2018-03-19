package com.example.dada.ActivityTest;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import com.example.dada.R;
import com.robotium.solo.Solo;
import android.widget.EditText;
import com.example.dada.View.RequesterDetailActivity;

public class RequesterDetailTest extends ActivityInstrumentationTestCase2{
    private Solo solo;

    public RequesterDetailTest(){
        super(com.example.dada.View.LoginActivity.class);
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

    @Override
    public void setUp() throws Exception {
        Log.d("TAG1", "setUp()");
        solo = new Solo(getInstrumentation(), getActivity());
    }

    /**
     * Test for detail click
     */
    public void testdetail(){
        solo.assertCurrentActivity("Wrong Activity", RequesterDetailActivity.class);
        solo.clickInList(0);

    }


    @Override
    protected void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}