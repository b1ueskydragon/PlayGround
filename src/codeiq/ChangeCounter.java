package codeiq;

public class ChangeCounter {
    int cents[] = {50, 25, 10, 5, 1};

    public int count(int amount) {
        return count(amount, 0);
    }

    private int count(int amount, int idx) {
        if (amount == 0)
            return 1;
        else if (amount < 0 || idx >= cents.length)
            return 0;
        else
            return count(amount - cents[idx], idx) + count(amount, idx + 1);
    }

    public static void main(String [] args) {
        System.out.println(new ChangeCounter().count(5));
    }
}
