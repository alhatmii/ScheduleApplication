package codeLine.Task.Schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "*/10 9-16 * * 1-")
    public void schedule() {
        System.out.println("Drink Water!");
    }

}
