package edu.sdccd.cisc190;

abstract public class DecisionNode {
    public final String prompt;

    public DecisionNode(String prompt) {
        this.prompt = prompt;
    }

    abstract DecisionNode makeDecision(String s) throws InvalidDecisionException;

    abstract String getPromptWithOptions();
}
