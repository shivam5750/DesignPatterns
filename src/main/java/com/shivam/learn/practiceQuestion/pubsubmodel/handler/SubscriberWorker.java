package com.shivam.learn.practiceQuestion.pubsubmodel.handler;

import com.shivam.learn.practiceQuestion.pubsubmodel.model.Message;
import com.shivam.learn.practiceQuestion.pubsubmodel.model.Topic;
import com.shivam.learn.practiceQuestion.pubsubmodel.model.TopicSubscriber;

public class SubscriberWorker implements Runnable {

    private final Topic topic;
    private final TopicSubscriber topicSubscriber;

    public SubscriberWorker(final Topic topic, final TopicSubscriber topicSubscriber) {
        this.topic = topic;
        this.topicSubscriber = topicSubscriber;
    }

    @Override
    public void run() {
        synchronized (topicSubscriber) {
            try {
                do {
                    int cutOffset = topicSubscriber.getOffset().get();
                    while(cutOffset >= topic.getMessages().size()) {
                        topicSubscriber.wait();
                    }
                    Message msg = topic.getMessages().get(cutOffset);
                    topicSubscriber.getSubscriber().consume(msg);

                    // We cannot just increment here since subscriber offset can be reset while it
                    // is consuming. So, after
                    // consuming we need to increase only if it was previous one.
                    topicSubscriber.getOffset().compareAndSet(cutOffset, cutOffset + 1);

                } while (true);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    synchronized public void wakeUpIfNeeded() {
        synchronized (topicSubscriber) {
            topicSubscriber.notify();
        }
    }

}
