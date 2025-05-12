package pl.rlnkoo.aiservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import pl.rlnkoo.aiservice.model.Activity;

@Service
@Slf4j
@RequiredArgsConstructor
public class ActivityMessageListener {

    @RabbitListener(queues = "activity.queue")
    public void processActivity(Activity activity) {
        log.info("Received activity for processing: {}", activity.getId());
    }
}
