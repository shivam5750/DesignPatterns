package com.shivam.learn.BehaviouralDesignPattern.memento.command;

import com.shivam.learn.BehaviouralDesignPattern.memento.WorkflowDesigner;

public abstract class AbstractWorkflowCommand implements WorkflowCommand {

    protected WorkflowDesigner.Memento memento;

    protected WorkflowDesigner receiver;

    public AbstractWorkflowCommand(WorkflowDesigner designer) {
        this.receiver = designer;
    }

    @Override
    public void undo() {
        receiver.setMemento(memento);
    }
}
