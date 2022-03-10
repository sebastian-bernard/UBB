package ro.ubb.sebi.hotelmanager.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lro/ubb/sebi/hotelmanager/data/HotelApi;", "", "()V", "HOTEL_SERVICE", "Lro/ubb/sebi/hotelmanager/data/HotelApi$HotelService;", "getHotel", "Lro/ubb/sebi/hotelmanager/data/models/Hotel;", "hotelId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHotels", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "hotel", "(Lro/ubb/sebi/hotelmanager/data/models/Hotel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "HotelService", "MockHotel", "app_debug"})
public final class HotelApi {
    @org.jetbrains.annotations.NotNull()
    public static final ro.ubb.sebi.hotelmanager.data.HotelApi INSTANCE = null;
    private static final ro.ubb.sebi.hotelmanager.data.HotelApi.HotelService HOTEL_SERVICE = null;
    
    private HotelApi() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getHotels(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ro.ubb.sebi.hotelmanager.data.models.Hotel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getHotel(@org.jetbrains.annotations.NotNull()
    java.lang.String hotelId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ro.ubb.sebi.hotelmanager.data.models.Hotel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    ro.ubb.sebi.hotelmanager.data.models.Hotel hotel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object save(@org.jetbrains.annotations.NotNull()
    ro.ubb.sebi.hotelmanager.data.models.Hotel hotel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0082\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lro/ubb/sebi/hotelmanager/data/HotelApi$MockHotel;", "", "name", "", "price", "", "dateBooked", "Ljava/util/Date;", "full", "", "(Ljava/lang/String;ILjava/util/Date;Z)V", "getDateBooked", "()Ljava/util/Date;", "getFull", "()Z", "getName", "()Ljava/lang/String;", "getPrice", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_debug"})
    static final class MockHotel {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        private final int price = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Date dateBooked = null;
        private final boolean full = false;
        @org.jetbrains.annotations.NotNull()
        public static final ro.ubb.sebi.hotelmanager.data.HotelApi.MockHotel.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final ro.ubb.sebi.hotelmanager.data.HotelApi.MockHotel copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name, int price, @org.jetbrains.annotations.NotNull()
        java.util.Date dateBooked, boolean full) {
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
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public MockHotel(@org.jetbrains.annotations.NotNull()
        java.lang.String name, int price, @org.jetbrains.annotations.NotNull()
        java.util.Date dateBooked, boolean full) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getPrice() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Date component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Date getDateBooked() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getFull() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lro/ubb/sebi/hotelmanager/data/HotelApi$MockHotel$Companion;", "", "()V", "fromHotel", "Lro/ubb/sebi/hotelmanager/data/HotelApi$MockHotel;", "hotel", "Lro/ubb/sebi/hotelmanager/data/models/Hotel;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final ro.ubb.sebi.hotelmanager.data.HotelApi.MockHotel fromHotel(@org.jetbrains.annotations.NotNull()
            ro.ubb.sebi.hotelmanager.data.models.Hotel hotel) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lro/ubb/sebi/hotelmanager/data/HotelApi$HotelService;", "", "getHotel", "Lro/ubb/sebi/hotelmanager/data/models/Hotel;", "hotelId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHotels", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "hotel", "Lro/ubb/sebi/hotelmanager/data/HotelApi$MockHotel;", "(Lro/ubb/sebi/hotelmanager/data/HotelApi$MockHotel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "(Ljava/lang/String;Lro/ubb/sebi/hotelmanager/data/models/Hotel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    static abstract interface HotelService {
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.GET(value = "/api/hotel/filter")
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        public abstract java.lang.Object getHotels(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<ro.ubb.sebi.hotelmanager.data.models.Hotel>> continuation);
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.GET(value = "/api/hotel/{id}")
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        public abstract java.lang.Object getHotel(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "id")
        java.lang.String hotelId, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super ro.ubb.sebi.hotelmanager.data.models.Hotel> continuation);
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.PUT(value = "/api/hotel/{id}")
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "id")
        java.lang.String hotelId, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Body()
        ro.ubb.sebi.hotelmanager.data.models.Hotel hotel, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super ro.ubb.sebi.hotelmanager.data.models.Hotel> continuation);
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.POST(value = "/api/hotel/")
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        public abstract java.lang.Object save(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Body()
        ro.ubb.sebi.hotelmanager.data.HotelApi.MockHotel hotel, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super ro.ubb.sebi.hotelmanager.data.models.Hotel> continuation);
    }
}