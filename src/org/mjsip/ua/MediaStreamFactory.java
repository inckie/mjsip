package org.mjsip.ua;

import org.mjsip.media.FlowSpec;
import org.mjsip.media.MediaStreamer;
import org.zoolu.util.Logger;

public interface MediaStreamFactory {
    // matching Func2<>
    MediaStreamer apply(FlowSpec flowSpec, Logger logger);
}
