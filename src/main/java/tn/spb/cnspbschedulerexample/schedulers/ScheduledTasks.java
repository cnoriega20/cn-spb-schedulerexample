package tn.spb.cnspbschedulerexample.schedulers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tn.spb.cnspbschedulerexample.services.HeadRequestService;

@Component
@Slf4j
public class ScheduledTasks {

    private final HeadRequestService headRequestService;

    public ScheduledTasks(HeadRequestService headRequestService) {
        this.headRequestService = headRequestService;
    }

    @Scheduled(fixedRate = 3000)
    public void getHeadValue(){
        log.info("Value : {} ",headRequestService.doHeadRequest());
    }
}
