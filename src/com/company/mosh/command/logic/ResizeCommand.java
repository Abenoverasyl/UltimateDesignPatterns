package com.company.state.command.logic;

import com.company.state.command.logic.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
