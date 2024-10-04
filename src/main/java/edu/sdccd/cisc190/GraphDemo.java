package edu.sdccd.cisc190;

import java.util.Scanner;

public class GraphDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecisionNode curDecision = generateDecisionGraph();

        do {
            System.out.println(curDecision.getPromptWithOptions());

            String nextDecision = input.next();
            try {
                curDecision = curDecision.makeDecision(nextDecision);
            } catch(InvalidDecisionException e) {
                System.out.println("Invalid decision entered, try again.");
            }
        } while(curDecision != null);
    }

    // TODO: replace with loading from file
    public static DecisionNode generateDecisionGraph() {
        // root is the starting node of the graph
        BooleanDecisionNode root = new BooleanDecisionNode("Is this a dream? Do I wake up?");
        root.setYes(new EndNode("You wake up, fall out of bed, crack your head on the skateboard you left out and die.", root, false));

        ArrayDecisionNode stayAsleep = new ArrayDecisionNode("You open your eyes and the room is pitch dark. You smell something burning.",3);
        stayAsleep.setDecisionMessage(0, "You crawl out of bed on your hands and knees and head towards the burning smell.");
        stayAsleep.setDecisionMessage(1, "You close your eyes and go back to sleep.");
        stayAsleep.setDecisionMessage(2, "You hop out of bed on your feet and reach for the curtain.");
        root.setNo(stayAsleep);

        DecisionNode win = new EndNode("You wake up sweaty and your jaw is sore from clenching. Hurray, it was just a bad dream!", root, true);
        stayAsleep.setDecisionNode(0, win);
        stayAsleep.setDecisionNode(1, win);
        stayAsleep.setDecisionNode(2, win);

        return root;
    }
}
