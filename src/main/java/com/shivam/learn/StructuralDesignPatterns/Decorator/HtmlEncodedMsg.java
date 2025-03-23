package com.shivam.learn.StructuralDesignPatterns.Decorator;

import org.apache.commons.lang3.StringEscapeUtils;

// Decorator implements component interface;
@SuppressWarnings("deprecation")
public class HtmlEncodedMsg implements Message{

    private Message msg;

    public HtmlEncodedMsg(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
       return StringEscapeUtils.escapeHtml4(msg.getContent());
    }
    
}
