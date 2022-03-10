package ro.ubb.sebi.hotelmanager.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lro/ubb/sebi/hotelmanager/data/HotelDatabaseDao;", "", "deleteOperation", "", "operation", "", "Lro/ubb/sebi/hotelmanager/data/models/Operation;", "([Lro/ubb/sebi/hotelmanager/data/models/Operation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOperations", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOperation", "(Lro/ubb/sebi/hotelmanager/data/models/Operation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface HotelDatabaseDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertOperation(@org.jetbrains.annotations.NotNull()
    ro.ubb.sebi.hotelmanager.data.models.Operation operation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteOperation(@org.jetbrains.annotations.NotNull()
    ro.ubb.sebi.hotelmanager.data.models.Operation[] operation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM operations")
    public abstract java.lang.Object getOperations(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ro.ubb.sebi.hotelmanager.data.models.Operation>> continuation);
}