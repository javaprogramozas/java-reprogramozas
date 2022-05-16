package v67;

public class Pair<RIGHT, LEFT> {

    private RIGHT left;
    private LEFT right;

    public Pair(RIGHT left, LEFT right) {
        this.left = left;
        this.right = right;
    }

    public RIGHT getLeft() {
        return left;
    }

    public void setLeft(RIGHT left) {
        this.left = left;
    }

    public LEFT getRight() {
        return right;
    }

    public void setRight(LEFT right) {
        this.right = right;
    }
}
