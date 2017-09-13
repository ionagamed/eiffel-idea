package com.eiffel;
import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class EiffelFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(EiffelProjectFileType.INSTANCE, "ecf");
        fileTypeConsumer.consume(EiffelSourceFileType.INSTANCE, "e");
    }
}