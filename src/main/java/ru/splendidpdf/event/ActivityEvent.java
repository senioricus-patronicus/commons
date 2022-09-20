package ru.splendidpdf.event;

import lombok.Builder;
import lombok.Value;
import ru.splendidpdf.model.*;

@Value
@Builder
public class ActivityEvent implements Event {
    String taskId;
    String fileName;
    String fileType;
    String activityType;
    String createdAt;
    FileStorageInfo fileStorageInfo;
    UserClientDetails userClientDetails;
}