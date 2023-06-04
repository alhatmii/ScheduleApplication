package codeLine.Task.Schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "* 30 16 * 7,8 0-4")
    public void schedule() {
        System.out.println("Drink Water!");
    }

}
