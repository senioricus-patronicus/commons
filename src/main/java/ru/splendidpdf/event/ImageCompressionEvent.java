package ru.splendidpdf.event;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ImageCompressionEvent implements Event {
    String taskId;
    String fileName;
    String timestamp;
    String compressFactor;
    String encodedContent;
}