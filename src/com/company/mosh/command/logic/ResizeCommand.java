package com.company.mosh.command.logic;

import com.company.mosh.command.logic.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
