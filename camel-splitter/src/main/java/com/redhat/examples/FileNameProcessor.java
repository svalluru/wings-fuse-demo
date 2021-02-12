package com.redhat.examples;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FileNameProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        exchange.getIn().setHeader(Exchange.FILE_NAME, System.currentTimeMillis());
    }
}