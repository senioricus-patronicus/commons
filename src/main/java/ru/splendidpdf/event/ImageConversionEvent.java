package ru.splendidpdf.event;

import lombok.Builder;

@Builder
public record ImageConversionEvent(String taskId,
                                   String fileName,
                                   String formatTo,
                                   String formatFrom,
                                   String encodedContent,
                                   String timestamp) {
}
