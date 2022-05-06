public class FProperties implements Properties {
    private String S;
    public FProperties(String S) {
        this.S = S;
    }

    @Override
    public void Fire() {
        S = "Spit fire";
    }

    @Override
    public void Water() {
        S = "Spit water";
    }

    @Override
    public void Land() {
        S = "Spit land";
    }

    @Override
    public void Thunder() {
        S = "Spit Thunder";
    }

    @Override
    public String toString() {
        return "FProperties{" +
                "S='" + S + '\'' +
                '}';
    }
}
