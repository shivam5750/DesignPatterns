package com.shivam.learn.BehaviouralDesignPattern.memento.command;

import com.shivam.learn.BehaviouralDesignPattern.memento.WorkflowDesigner;

public class AddStepCommand extends AbstractWorkflowCommand {

    private String step;

    public AddStepCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();

        receiver.addStep(step);
    }
}
