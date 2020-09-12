package com.company.state.strategy.logic;

public class PngCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using PNG");
    }
}
