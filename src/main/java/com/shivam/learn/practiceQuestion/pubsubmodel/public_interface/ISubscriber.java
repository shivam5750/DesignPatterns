package com.shivam.learn.practiceQuestion.pubsubmodel.public_interface;

import com.shivam.learn.practiceQuestion.pubsubmodel.model.Message;

public interface ISubscriber {
    String getId();
    void consume(Message message) throws InterruptedException;
}