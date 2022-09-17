package ru.splendidpdf.event;

import lombok.Builder;
import ru.splendidpdf.model.TaskStatus;

@Builder
public record UpdatedTaskEvent(String taskId,
                               String resultUrl,
                               TaskStatus taskStatus) {
}