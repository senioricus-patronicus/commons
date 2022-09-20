package ru.splendidpdf.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class FileStorageInfo {
    String type;
    Integer days;
}
