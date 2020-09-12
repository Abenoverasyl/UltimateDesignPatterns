package com.company.state.strategy;

import com.company.state.strategy.logic.BlackAndWhiteFilter;
import com.company.state.strategy.logic.ImageStorage;
import com.company.state.strategy.logic.JpegCompressor;
import com.company.state.strategy.logic.PngCompressor;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a",
                new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a",
                new PngCompressor(), new BlackAndWhiteFilter());
    }
}
