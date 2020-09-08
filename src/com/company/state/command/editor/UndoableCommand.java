package com.company.state.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
