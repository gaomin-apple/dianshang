package com.gm.dssupportback.consumer;

import com.gm.dssupportback.mq.EmailEvent;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@RocketMQMessageListener(topic = "SendPwdResetByEmail",consumerGroup = "jcart-support-group01")
public class EmailConsumer implements RocketMQListener<EmailEvent> {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onMessage(EmailEvent emailEvent) {
    logger.info("{}",emailEvent);
    }
}
