package neox.video.exception_handler.server_exception.exceptions;

import neox.video.exception_handler.server_exception.ServerIOException;

public class VideoCompessException extends ServerIOException {
    public VideoCompessException(String fileName) {
        super(String.format("File %S compression error", fileName));
    }
}
