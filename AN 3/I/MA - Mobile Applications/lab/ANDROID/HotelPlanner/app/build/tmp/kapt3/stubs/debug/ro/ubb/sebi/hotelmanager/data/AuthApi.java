package ro.ubb.sebi.hotelmanager.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lro/ubb/sebi/hotelmanager/data/AuthApi;", "", "()V", "authService", "Lro/ubb/sebi/hotelmanager/data/AuthApi$AuthService;", "login", "", "username", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "", "retrofitLogin", "user", "Lro/ubb/sebi/hotelmanager/data/models/User;", "(Lro/ubb/sebi/hotelmanager/data/models/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateToken", "token", "AuthService", "app_debug"})
public final class AuthApi {
    @org.jetbrains.annotations.NotNull()
    public static final ro.ubb.sebi.hotelmanager.data.AuthApi INSTANCE = null;
    private static final ro.ubb.sebi.hotelmanager.data.AuthApi.AuthService authService = null;
    
    private AuthApi() {
        super();
    }
    
    private final java.lang.Object retrofitLogin(ro.ubb.sebi.hotelmanager.data.models.User user, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    public final void updateToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    public final void logout() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lro/ubb/sebi/hotelmanager/data/AuthApi$AuthService;", "", "login", "Lro/ubb/sebi/hotelmanager/data/models/TokenHolder;", "user", "Lro/ubb/sebi/hotelmanager/data/models/User;", "(Lro/ubb/sebi/hotelmanager/data/models/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    static abstract interface AuthService {
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.POST(value = "/api/auth/login")
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Body()
        ro.ubb.sebi.hotelmanager.data.models.User user, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super ro.ubb.sebi.hotelmanager.data.models.TokenHolder> continuation);
    }
}