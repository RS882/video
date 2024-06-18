package neox.video.exception_handler.not_found.exceptions;

import neox.video.exception_handler.bad_requeat.BadRequestException;
import neox.video.exception_handler.not_found.NotFoundException;

public class VideoPropertiesNotFoundException extends NotFoundException {
    public VideoPropertiesNotFoundException(String quality) {
        super(String.format("Video properties for : <%s> not found", quality));
    }
}