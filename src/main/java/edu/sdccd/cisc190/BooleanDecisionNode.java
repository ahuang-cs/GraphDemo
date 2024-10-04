package edu.sdccd.cisc190;

public class BooleanDecisionNode extends DecisionNode {
    private DecisionNode yes;
    private DecisionNode no;

    public BooleanDecisionNode(String prompt) {
        super(prompt);
    }

    public BooleanDecisionNode(String prompt, DecisionNode yes, DecisionNode no) {
        super(prompt);
        this.yes = yes;
        this.no = no;
    }

    public DecisionNode getYes() {
        return yes;
    }

    public void setYes(DecisionNode yes) {
        this.yes = yes;
    }

    public DecisionNode getNo() {
        return no;
    }

    public void setNo(DecisionNode no) {
        this.no = no;
    }
}
