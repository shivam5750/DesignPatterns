package com.shivam.learn.practiceQuestion.pubsubmodel.handler;

import java.util.HashMap;
import java.util.Map;

import com.shivam.learn.practiceQuestion.pubsubmodel.model.Topic;
import com.shivam.learn.practiceQuestion.pubsubmodel.model.TopicSubscriber;

public class TopicHandler {
    private final Topic topic;
    private final Map<String, SubscriberWorker> subscriberWorkers;

    public TopicHandler(final Topic topic) {
        this.topic = topic;
        subscriberWorkers = new HashMap<>();
    }

    public void publish() {
        for (TopicSubscriber topicSubscriber:topic.getSubscribers()) {
            startSubsriberWorker(topicSubscriber);
        }
    }

    public void startSubsriberWorker(final TopicSubscriber topicSubscriber) {
        final String subscriberId = topicSubscriber.getSubscriber().getId();
        if (!subscriberWorkers.containsKey(subscriberId)) {
            final SubscriberWorker subscriberWorker = new SubscriberWorker(topic, topicSubscriber);
            subscriberWorkers.put(subscriberId, subscriberWorker);
            new Thread(subscriberWorker).start();
        }
        final SubscriberWorker subscriberWorker = subscriberWorkers.get(subscriberId);
        subscriberWorker.wakeUpIfNeeded();
    }
}
