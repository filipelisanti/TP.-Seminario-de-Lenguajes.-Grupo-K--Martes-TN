package com.example.tp.dtos;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00b3\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u000fH\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\u00b7\u0001\u0010:\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00052\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u00052\b\b\u0003\u0010\u0011\u001a\u00020\u00052\b\b\u0003\u0010\u0012\u001a\u00020\u00052\b\b\u0003\u0010\u0013\u001a\u00020\u00052\b\b\u0003\u0010\u0014\u001a\u00020\u00052\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020\u0005H\u00d6\u0001J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018\u00a8\u0006@"}, d2 = {"Lcom/example/tp/dtos/Current;", "", "observationTime", "", "temperature", "", "weatherCode", "weatherIcons", "", "weatherDescriptions", "windSpeed", "windDegree", "windDir", "pressure", "precip", "", "humidity", "cloudcover", "feelslike", "uvIndex", "visibility", "isDay", "(Ljava/lang/String;IILjava/util/List;Ljava/util/List;IILjava/lang/String;IDIIIIILjava/lang/String;)V", "getCloudcover", "()I", "getFeelslike", "getHumidity", "()Ljava/lang/String;", "getObservationTime", "getPrecip", "()D", "getPressure", "getTemperature", "getUvIndex", "getVisibility", "getWeatherCode", "getWeatherDescriptions", "()Ljava/util/List;", "getWeatherIcons", "getWindDegree", "getWindDir", "getWindSpeed", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Current {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String observationTime = null;
    private final int temperature = 0;
    private final int weatherCode = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> weatherIcons = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> weatherDescriptions = null;
    private final int windSpeed = 0;
    private final int windDegree = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String windDir = null;
    private final int pressure = 0;
    private final double precip = 0.0;
    private final int humidity = 0;
    private final int cloudcover = 0;
    private final int feelslike = 0;
    private final int uvIndex = 0;
    private final int visibility = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String isDay = null;
    
    public Current(@com.squareup.moshi.Json(name = "observation_time")
    @org.jetbrains.annotations.NotNull()
    java.lang.String observationTime, @com.squareup.moshi.Json(name = "temperature")
    int temperature, @com.squareup.moshi.Json(name = "weather_code")
    int weatherCode, @com.squareup.moshi.Json(name = "weather_icons")
    @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> weatherIcons, @com.squareup.moshi.Json(name = "weather_descriptions")
    @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> weatherDescriptions, @com.squareup.moshi.Json(name = "wind_speed")
    int windSpeed, @com.squareup.moshi.Json(name = "wind_degree")
    int windDegree, @com.squareup.moshi.Json(name = "wind_dir")
    @org.jetbrains.annotations.NotNull()
    java.lang.String windDir, @com.squareup.moshi.Json(name = "pressure")
    int pressure, @com.squareup.moshi.Json(name = "precip")
    double precip, @com.squareup.moshi.Json(name = "humidity")
    int humidity, @com.squareup.moshi.Json(name = "cloudcover")
    int cloudcover, @com.squareup.moshi.Json(name = "feelslike")
    int feelslike, @com.squareup.moshi.Json(name = "uv_index")
    int uvIndex, @com.squareup.moshi.Json(name = "visibility")
    int visibility, @com.squareup.moshi.Json(name = "is_day")
    @org.jetbrains.annotations.Nullable()
    java.lang.String isDay) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getObservationTime() {
        return null;
    }
    
    public final int getTemperature() {
        return 0;
    }
    
    public final int getWeatherCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getWeatherIcons() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getWeatherDescriptions() {
        return null;
    }
    
    public final int getWindSpeed() {
        return 0;
    }
    
    public final int getWindDegree() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWindDir() {
        return null;
    }
    
    public final int getPressure() {
        return 0;
    }
    
    public final double getPrecip() {
        return 0.0;
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final int getCloudcover() {
        return 0;
    }
    
    public final int getFeelslike() {
        return 0;
    }
    
    public final int getUvIndex() {
        return 0;
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String isDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int component15() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tp.dtos.Current copy(@com.squareup.moshi.Json(name = "observation_time")
    @org.jetbrains.annotations.NotNull()
    java.lang.String observationTime, @com.squareup.moshi.Json(name = "temperature")
    int temperature, @com.squareup.moshi.Json(name = "weather_code")
    int weatherCode, @com.squareup.moshi.Json(name = "weather_icons")
    @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> weatherIcons, @com.squareup.moshi.Json(name = "weather_descriptions")
    @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> weatherDescriptions, @com.squareup.moshi.Json(name = "wind_speed")
    int windSpeed, @com.squareup.moshi.Json(name = "wind_degree")
    int windDegree, @com.squareup.moshi.Json(name = "wind_dir")
    @org.jetbrains.annotations.NotNull()
    java.lang.String windDir, @com.squareup.moshi.Json(name = "pressure")
    int pressure, @com.squareup.moshi.Json(name = "precip")
    double precip, @com.squareup.moshi.Json(name = "humidity")
    int humidity, @com.squareup.moshi.Json(name = "cloudcover")
    int cloudcover, @com.squareup.moshi.Json(name = "feelslike")
    int feelslike, @com.squareup.moshi.Json(name = "uv_index")
    int uvIndex, @com.squareup.moshi.Json(name = "visibility")
    int visibility, @com.squareup.moshi.Json(name = "is_day")
    @org.jetbrains.annotations.Nullable()
    java.lang.String isDay) {
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