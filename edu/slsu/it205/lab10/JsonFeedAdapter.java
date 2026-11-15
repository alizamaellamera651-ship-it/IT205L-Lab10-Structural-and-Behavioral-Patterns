package edu.slsu.it205.lab10;

// Adapter
public class JsonFeedAdapter implements ModernDataSource {

    private LegacyJsonFeed legacyFeed;

    public JsonFeedAdapter(LegacyJsonFeed legacyFeed) {
        this.legacyFeed = legacyFeed;
    }

    @Override
    public String fetch() {
        return legacyFeed.pull();
    }
}