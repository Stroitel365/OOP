package sem_3_hw.data;


import java.util.Iterator;
import java.util.List;


public class StreamIterator implements Iterator<StudentGroup>{

    private int counter;
    private final List<StudentGroup> studentGroups;

    public StreamIterator(Streams stream) {
        this.studentGroups = stream.getGroups();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroups.size()-1;
        }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return studentGroups.get(counter);
    }
    


}
