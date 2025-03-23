package com.shivam.learn.practiceQuestion.pubsubmodel.public_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.shivam.learn.practiceQuestion.pubsubmodel.handler.TopicHandler;
import com.shivam.learn.practiceQuestion.pubsubmodel.model.Message;
import com.shivam.learn.practiceQuestion.pubsubmodel.model.Topic;
import com.shivam.learn.practiceQuestion.pubsubmodel.model.TopicSubscriber;

public class Queue {
    private final Map<String, TopicHandler> topicProcessors;

    public Queue(){
        this.topicProcessors = new HashMap<>();
    }

     public Topic createTopic(final String topicName) {
        final Topic topic = new Topic(topicName, UUID.randomUUID().toString());
        TopicHandler topicHandler = new TopicHandler(topic);
        topicProcessors.put(topic.getTopicId(), topicHandler);
        System.out.println("Created topic: " + topic.getTopicName());
        return topic;
    }

    public void subscribe(final ISubscriber subscriber, final Topic topic) {
        topic.addSubscriber(new TopicSubscriber(subscriber));
        System.out.println(subscriber.getId() + " subscribed to topic: " + topic.getTopicName());
    }

    public void publish(final Topic topic, final Message message) {
        topic.addMessage(message);
        System.out.println(message.getMsg() + " published to topic: " + topic.getTopicName());
        new Thread(() -> topicProcessors.get(topic.getTopicId()).publish()).start();
    }

    public void resetOffset(final Topic topic, final ISubscriber subscriber, final Integer newOffset) {
        for (TopicSubscriber topicSubscriber : topic.getSubscribers()) {
            if (topicSubscriber.getSubscriber().equals(subscriber)) {
                topicSubscriber.getOffset().set(newOffset);
                System.out.println(topicSubscriber.getSubscriber().getId() + " offset reset to: " + newOffset);
                new Thread(() -> topicProcessors.get(topic.getTopicId()).startSubsriberWorker(topicSubscriber)).start();
                break;
            }
        }
    }
}
