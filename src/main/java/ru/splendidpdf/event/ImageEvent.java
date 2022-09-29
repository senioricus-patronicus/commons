package ru.splendidpdf.event;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ImageEvent implements Event {
    String taskType;
    String taskData;
}