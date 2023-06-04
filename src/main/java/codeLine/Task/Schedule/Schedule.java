package codeLine.Task.Schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 */5 * * 1-5 *")
    public void schedule() {
        System.out.println("Drink Water!");
    }
    @Scheduled(cron =  "0 */15 * * 6-7 *")
    // Weekends
    public void display(){
        System.out.println("Drink water!!");
    }
}
