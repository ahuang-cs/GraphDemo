package edu.sdccd.cisc190;

public class EndNode extends DecisionNode {
    private final DecisionNode root;
    public final boolean isSucessfulEscape;

    public EndNode(String prompt, DecisionNode root, boolean isSucessfulEscape) {
        super(prompt);
        this.root = root;
        this.isSucessfulEscape = isSucessfulEscape;
    }


    @Override
    DecisionNode makeDecision(String s) throws InvalidDecisionException {
        if(s.equals("restart")) return root;
        else if (s.equals("exit")) {
            return null;
        }
        throw new InvalidDecisionException();
    }

    @Override
    String getPromptWithOptions() {
        return prompt + " (restart or exit):";
    }
}
