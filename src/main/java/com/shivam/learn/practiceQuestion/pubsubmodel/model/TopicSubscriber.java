package com.shivam.learn.practiceQuestion.pubsubmodel.model;

import java.util.concurrent.atomic.AtomicInteger;

import com.shivam.learn.practiceQuestion.pubsubmodel.public_interface.ISubscriber;

public class TopicSubscriber {
    private final AtomicInteger offset;
    private final ISubscriber subscriber;

    public TopicSubscriber(final ISubscriber subscriber) {
        this.subscriber = subscriber;
        this.offset = new AtomicInteger(0);
    }

    public AtomicInteger getOffset() {
        return this.offset;
    }


    public ISubscriber getSubscriber() {
        return this.subscriber;
    }



}
