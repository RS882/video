package compress.video.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VideoPropsDto {

    private  int videoBitrate;
    private  int width;
    private  int height;
    private  double frameRate;
    private  int audioBitrate;
    private  long maxSize;
}
