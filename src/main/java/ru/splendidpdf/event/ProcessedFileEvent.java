package ru.splendidpdf.event;

import lombok.Value;

@Value
public class ProcessedFileEvent {
    String taskId;
    String fileName;
    String encodedFile;
    String timestamp;
}