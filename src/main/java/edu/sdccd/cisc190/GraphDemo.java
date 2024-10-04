package edu.sdccd.cisc190;

public class GraphDemo {
    public static void main(String[] args) {
        DecisionNode start = new BooleanDecisionNode("Is this a dream? Do I wake up?");

        DecisionNode fail = new EndNode("You wake up, fall out of bed, crack your head on the skateboard you left out and die.", false);
        DecisionNode win = new EndNode("You ", true);
    }
}
