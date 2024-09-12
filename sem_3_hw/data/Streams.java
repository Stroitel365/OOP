package sem_3_hw.data;

import java.util.Iterator;
import java.util.List;

public class Streams implements Iterable<StudentGroup>, Comparable<Streams>{

    private final List<StudentGroup> studentGroups = null;



    public void addGroupToStream(StudentGroup group){
        studentGroups.add(group);
    }
    public List<StudentGroup> getGroups(){
        return studentGroups;
    }

    public Integer getStreamSize(){
        return studentGroups.size();
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }
    @Override
    public int compareTo(Streams o) {
        return this.getStreamSize().compareTo(o.getStreamSize());
    }

}
