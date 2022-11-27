package com.sm.event.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sm.event.AuditEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AuditEventHandler {

    @Async
    @EventListener
    public void handleEvent(AuditEvent auditEvent) {
        try {
            String data = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(auditEvent.getData());
            System.out.println("Json Data : " + data);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
