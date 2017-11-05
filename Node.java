import java.util.ArrayList;

public class Node {
    public int f;
    public int g;
    public int h;
    public int[][] state = new int[3][3];
    public ArrayList<Node> successors;
    public Node ancestor;

    public Node() {
    }
    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int[][] getState() {
        return state;
    }

    public void setState(int[][] state) {
        this.state = state;
    }

    public ArrayList<Node> getSuccessors() {
        return successors;
    }

    public void setSuccessors(ArrayList<Node> successors) {
        this.successors = successors;
    }

    public Node getAncestor() {
        return ancestor;
    }

    public void setAncestor(Node ancestor) {
        this.ancestor = ancestor;
    }

    public void setF(int g, int h) {
        this.f = g+h;
    }

}
