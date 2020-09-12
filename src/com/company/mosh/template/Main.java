package com.company.state.template;

import com.company.state.template.logic.TransferMoneyTask;

public class Main {
    public static void main(String[] args) {
        var task = new TransferMoneyTask();
        task.execute();
    }
}