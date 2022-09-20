package ru.splendidpdf.event;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ImageConversionEvent implements Event {
    String taskId;
    String fileName;
    String convertTo;
    String timestamp;
    String encodedContent;
}
