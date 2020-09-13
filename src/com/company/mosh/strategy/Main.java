package com.company.mosh.strategy;

import com.company.mosh.strategy.logic.BlackAndWhiteFilter;
import com.company.mosh.strategy.logic.ImageStorage;
import com.company.mosh.strategy.logic.JpegCompressor;
import com.company.mosh.strategy.logic.PngCompressor;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a",
                new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a",
                new PngCompressor(), new BlackAndWhiteFilter());
    }
}
