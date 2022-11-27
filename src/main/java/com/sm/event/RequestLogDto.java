package com.sm.event;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@Builder
public class RequestLogDto {
    private Map<String, String> data;
}
