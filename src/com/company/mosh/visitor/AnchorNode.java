package com.company.mosh.visitor;

public class AnchorNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("highlight-anchor");
    }
}