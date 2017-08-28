package coursera;

/**
 * initialize N 回
 * union N 回
 * find 1 会
 *
 * Quick-find is too slow
 */
public class QuickFindUF {

    private int [] id; // id が中身。インデックスが比較対象 (インデックスの中に id がある)

    // set id of each object to itself(N array accesses)
    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0 ; i < N ; i ++){
            id[i] = i;
        }
    }

    // check whether p and q are in the same component ( 2 array accesses)
    public boolean connectecd(int p, int q) {
        return id[p] == id[q];
    }

    // change all entries with id[p] to id[q] (at most 2N + 2 array accesses)
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length ; i ++) {
            if (id[p] == id[q]) id[i] = qid;
        }
    }
}
