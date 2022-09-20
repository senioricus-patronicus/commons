package ru.splendidpdf.model;

public enum TaskStatus {
    CREATED,

    ON_CONVERSION,
    ON_COMPRESSION,

    CONVERTED,
    COMPRESSED,

    FAILED,
    FINISHED;
}