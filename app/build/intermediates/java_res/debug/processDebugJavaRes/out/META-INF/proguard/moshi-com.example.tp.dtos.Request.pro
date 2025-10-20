-if class com.example.tp.dtos.Request
-keepnames class com.example.tp.dtos.Request
-if class com.example.tp.dtos.Request
-keep class com.example.tp.dtos.RequestJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
