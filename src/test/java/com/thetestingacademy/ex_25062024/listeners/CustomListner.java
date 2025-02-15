package com.thetestingacademy.ex_25062024.listeners;

import org.testng.IExecutionListener;
import org.testng.ISuiteListener;

public class CustomListner implements IExecutionListener, ISuiteListener {
    @Override
    public void onExecutionStart() {
        System.out.println("OnExecutionStart");
        long startTime= System.currentTimeMillis();
        System.out.println(" ****   *** Started execution at - "+ startTime + "****   *** ");

    }

    @Override
    public void onExecutionFinish() {
        System.out.println("OnExecutionFinish");
        long endTime= System.currentTimeMillis();
        System.out.println("****   *** Finished execution at- "+ endTime +"****   *** ");
    }
}
