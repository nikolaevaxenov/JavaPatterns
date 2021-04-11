package app.Application;

import java.io.IOException;
import app.Application.Interfaces.UserRepository;
import app.Application.Interfaces.PostRepository;

public interface ScheduleMXBean {
    void doScheduledTask() throws IOException;
}
