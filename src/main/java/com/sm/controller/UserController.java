package com.sm.controller;

import com.sm.event.publisher.AuditEventPublisher;
import com.sm.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final AuditEventPublisher auditEventPublisher;

    @PostMapping
    public String register(@RequestBody User user) {
        auditEventPublisher.publishEvent("User is saved, username:" + user.getUserName());
        return "User saved successfully.";
    }
}
