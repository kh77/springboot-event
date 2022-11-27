package com.sm.event.publisher;

import com.sm.event.AuditEvent;
import com.sm.event.RequestLogDto;
import com.sm.utils.RequestUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class AuditEventPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(String message) {
        Map<String, String> data = RequestUtils.requestData();
        data.put("message", message);
        applicationEventPublisher.publishEvent(
                new AuditEvent(RequestLogDto.builder()
                        .data(data)
                        .build()));
    }
}
