package com.company.state.strategy.logic;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG");
    }
}
