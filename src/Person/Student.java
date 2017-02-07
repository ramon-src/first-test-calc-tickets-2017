package Person;

public class Student implements Person {
    private boolean card;

    public void setCardToTrue() {
        this.card = true;
    }

    public boolean hasCard() {
        return card;
    }
}
