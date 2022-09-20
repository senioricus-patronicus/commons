package ru.splendidpdf.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UserClientDetails {
    String userId;
    String deviceId;
    String sessionId;
}