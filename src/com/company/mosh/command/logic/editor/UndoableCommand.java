package com.company.state.command.logic.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
