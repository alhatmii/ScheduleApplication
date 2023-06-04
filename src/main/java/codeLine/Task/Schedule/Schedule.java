package codeLine.Task.Schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 0 12 1-31 7 * 1")
    public void schedule() {
        System.out.println("Drink Water!");
    }

}
