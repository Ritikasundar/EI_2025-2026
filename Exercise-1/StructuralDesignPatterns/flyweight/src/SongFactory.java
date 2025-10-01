package src;

import java.util.HashMap;
import java.util.Map;

public class SongFactory {

    private Map<String, SongMetadata> metadataCache = new HashMap<>();

    public SongMetadata getSongMetadata(String artist, String album, double duration) {
        String key = artist + "-" + album + "-" + duration;
        if (!metadataCache.containsKey(key)) {
            metadataCache.put(key, new SongMetadata(artist, album, duration));
        }
        return metadataCache.get(key);
    }
}
