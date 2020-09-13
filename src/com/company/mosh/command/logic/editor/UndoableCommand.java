package com.company.mosh.command.logic.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
