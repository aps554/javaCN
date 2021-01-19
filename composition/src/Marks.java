public class Marks {

    private int maths;
    private int hindi;
    private int physics;

    public Marks(int maths, int hindi, int physics) {
        this.maths = maths;
        this.hindi = hindi;
        this.physics = physics;
    }

    public int getMaths() {
        return maths;
    }

    public int getHindi() {
        return hindi;
    }

    public int getPhysics() {
        return physics;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }
}
