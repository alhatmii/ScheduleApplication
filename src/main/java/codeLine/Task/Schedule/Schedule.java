package codeLine.Task.Schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 0 1 1,4,7,10 *")
    public void schedule() {
        System.out.println("Drink Water!");
    }

}
