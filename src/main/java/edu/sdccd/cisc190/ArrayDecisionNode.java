package edu.sdccd.cisc190;

public class ArrayDecisionNode extends DecisionNode {
    DecisionNode[] decisionNodes;
    String[] decisionMessages;

    public ArrayDecisionNode(String prompt) {
        super(prompt);
    }

    @Override
    DecisionNode makeDecision(String s) throws InvalidDecisionException {
        try {
            int decisionIndex = Integer.parseInt(s);
            if(decisionIndex >= 0 && decisionIndex < decisionNodes.length) {
                return decisionNodes[decisionIndex];
            } else throw new InvalidDecisionException();
        } catch (NumberFormatException e) {
            throw new InvalidDecisionException();
        }
    }

    @Override
    String getPromptWithOptions() {
        StringBuilder output = new StringBuilder(prompt);
        for(int i = 0; i < decisionNodes.length; i++) {
            output.append(String.format("%n(%d) %s", i, decisionMessages[i]));
        }
        output.append("\n(enter number): ");
        return output.toString();
    }


    public ArrayDecisionNode(String prompt, int numDecisions) {
        super(prompt);
        this.decisionNodes = new DecisionNode[numDecisions];
        this.decisionMessages = new String[numDecisions];
    }

    public ArrayDecisionNode(String prompt, DecisionNode[] decisionNodes, String[] decisionMessages) {
        super(prompt);
        this.decisionNodes = decisionNodes;
        this.decisionMessages = decisionMessages;
    }

    public DecisionNode[] getDecisionNodes() {
        return decisionNodes;
    }

    public void setDecisionNodes(DecisionNode[] decisionNodes) {
        this.decisionNodes = decisionNodes;
    }

    public DecisionNode getDecisionNode(int index) {
        return decisionNodes[index];
    }

    public void setDecisionNode(int index, DecisionNode decisionNode) {
        decisionNodes[index] = decisionNode;
    }

    public String[] getDecisionMessages() {
        return decisionMessages;
    }

    public void setDecisionMessages(String[] decisionMessages) {
        this.decisionMessages = decisionMessages;
    }

    public String getDecisionMessage(int index) {
        return decisionMessages[index];
    }

    public void setDecisionMessage(int index, String decisionMessage) {
        decisionMessages[index] = decisionMessage;
    }
}
