package neox.video.exception_handler.server_exception.exceptions;

import neox.video.exception_handler.server_exception.ServerException;

public class VideoCompessException extends ServerException {
    public VideoCompessException(String fileName) {
        super(String.format("File %S compression error", fileName));
    }
}