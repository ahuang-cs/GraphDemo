package edu.sdccd.cisc190;

public class ArrayDecisionNode extends DecisionNode {
    DecisionNode[] decisionNodes;

    public ArrayDecisionNode(String prompt) {
        super(prompt);
    }

    public ArrayDecisionNode(String prompt, int numDecisions) {
        super(prompt);
        this.decisionNodes = new DecisionNode[numDecisions];
    }

    public ArrayDecisionNode(String prompt, DecisionNode[] decisionNodes) {
        super(prompt);
        this.decisionNodes = decisionNodes;
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
}
