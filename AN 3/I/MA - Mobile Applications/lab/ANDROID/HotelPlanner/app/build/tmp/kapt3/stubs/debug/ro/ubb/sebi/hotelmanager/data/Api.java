package ro.ubb.sebi.hotelmanager.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lro/ubb/sebi/hotelmanager/data/Api;", "", "()V", "URL", "", "client", "Lokhttp3/OkHttpClient;", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "token", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "tokenInterceptor", "Lokhttp3/Interceptor;", "app_debug"})
public final class Api {
    @org.jetbrains.annotations.NotNull()
    public static final ro.ubb.sebi.hotelmanager.data.Api INSTANCE = null;
    private static final java.lang.String URL = "http://172.30.116.61:3000/";
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String token;
    private static final okhttp3.Interceptor tokenInterceptor = null;
    private static final okhttp3.OkHttpClient client = null;
    private static com.google.gson.Gson gson;
    @org.jetbrains.annotations.NotNull()
    private static final retrofit2.Retrofit retrofit = null;
    
    private Api() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
}