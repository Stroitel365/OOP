package sem_3_hw.data;

import java.util.Comparator;

public class StreamComparator  implements Comparator<Streams>{

    @Override
    public int compare(Streams o1, Streams o2) {
        int resultOfComparing = o1.compareTo(o2);
        return resultOfComparing;
    }

}
