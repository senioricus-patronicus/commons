package ru.splendidpdf.event;

import lombok.Builder;
import lombok.Value;
import ru.splendidpdf.model.TaskStatus;

@Value
@Builder
public class UploadFileEvent implements Event {
    String taskId;
    String fileName;
    String timestamp;
    TaskStatus status;
    String encodedFile;
}