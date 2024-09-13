package sem_4_hw.view;

import sem_4_hw.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
