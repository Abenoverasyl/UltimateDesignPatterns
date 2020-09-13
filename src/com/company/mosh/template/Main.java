package com.company.mosh.template;

import com.company.mosh.template.logic.TransferMoneyTask;

public class Main {
    public static void main(String[] args) {
        var task = new TransferMoneyTask();
        task.execute();
    }
}
