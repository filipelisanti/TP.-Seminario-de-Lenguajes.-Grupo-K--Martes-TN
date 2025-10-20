package com.example.tp.dtos;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f\u00a8\u0006)"}, d2 = {"Lcom/example/tp/dtos/Location;", "", "name", "", "country", "region", "lat", "lon", "timezoneId", "localtime", "localtimeEpoch", "", "utcOffset", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getLat", "getLocaltime", "getLocaltimeEpoch", "()J", "getLon", "getName", "getRegion", "getTimezoneId", "getUtcOffset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Location {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String country = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String region = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lat = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lon = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String timezoneId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String localtime = null;
    private final long localtimeEpoch = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String utcOffset = null;
    
    public Location(@com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String name, @com.squareup.moshi.Json(name = "country")
    @org.jetbrains.annotations.NotNull()
    java.lang.String country, @com.squareup.moshi.Json(name = "region")
    @org.jetbrains.annotations.NotNull()
    java.lang.String region, @com.squareup.moshi.Json(name = "lat")
    @org.jetbrains.annotations.NotNull()
    java.lang.String lat, @com.squareup.moshi.Json(name = "lon")
    @org.jetbrains.annotations.NotNull()
    java.lang.String lon, @com.squareup.moshi.Json(name = "timezone_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String timezoneId, @com.squareup.moshi.Json(name = "localtime")
    @org.jetbrains.annotations.NotNull()
    java.lang.String localtime, @com.squareup.moshi.Json(name = "localtime_epoch")
    long localtimeEpoch, @com.squareup.moshi.Json(name = "utc_offset")
    @org.jetbrains.annotations.NotNull()
    java.lang.String utcOffset) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimezoneId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocaltime() {
        return null;
    }
    
    public final long getLocaltimeEpoch() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUtcOffset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final long component8() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tp.dtos.Location copy(@com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String name, @com.squareup.moshi.Json(name = "country")
    @org.jetbrains.annotations.NotNull()
    java.lang.String country, @com.squareup.moshi.Json(name = "region")
    @org.jetbrains.annotations.NotNull()
    java.lang.String region, @com.squareup.moshi.Json(name = "lat")
    @org.jetbrains.annotations.NotNull()
    java.lang.String lat, @com.squareup.moshi.Json(name = "lon")
    @org.jetbrains.annotations.NotNull()
    java.lang.String lon, @com.squareup.moshi.Json(name = "timezone_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String timezoneId, @com.squareup.moshi.Json(name = "localtime")
    @org.jetbrains.annotations.NotNull()
    java.lang.String localtime, @com.squareup.moshi.Json(name = "localtime_epoch")
    long localtimeEpoch, @com.squareup.moshi.Json(name = "utc_offset")
    @org.jetbrains.annotations.NotNull()
    java.lang.String utcOffset) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}