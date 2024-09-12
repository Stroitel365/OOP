package sem_3_hw.service;


import java.util.List;

import sem_3_hw.data.StreamComparator;
import sem_3_hw.data.Streams;

public class StreamService {

    private List<Streams> streams;
    private Streams singleStream;

    public void createStream() {
        this.singleStream = new Streams();
    }

    public List<Streams> getStreams(){
        return streams;
    }

    public List<Streams> sortStreamsBySize(List<Streams> streams){
        streams.sort(new StreamComparator());
        return streams;
    }







}
