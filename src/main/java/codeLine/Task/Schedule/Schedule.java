package codeLine.Task.Schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "30 13 * * 4L-0")
    public void schedule() {
        System.out.println("Drink Water!");
    }

}
