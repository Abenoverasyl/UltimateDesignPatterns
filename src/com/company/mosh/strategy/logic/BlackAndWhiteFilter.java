package com.company.state.strategy.logic;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W");
    }
}
