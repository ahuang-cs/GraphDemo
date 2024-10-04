package edu.sdccd.cisc190;

public class EndNode extends DecisionNode {
    public final boolean isSucessfulEscape;
    public EndNode(String prompt, boolean isSucessfulEscape) {
        super(prompt);
        this.isSucessfulEscape = isSucessfulEscape;
    }
}
