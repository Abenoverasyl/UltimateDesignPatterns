package com.company.mosh.observer;

import com.company.mosh.observer.logic.Chart;
import com.company.mosh.observer.logic.DataSource;
import com.company.mosh.observer.logic.SpreadSheet;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var shet1 = new SpreadSheet(dataSource);
        var shet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(shet1);
        dataSource.addObserver(shet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}
