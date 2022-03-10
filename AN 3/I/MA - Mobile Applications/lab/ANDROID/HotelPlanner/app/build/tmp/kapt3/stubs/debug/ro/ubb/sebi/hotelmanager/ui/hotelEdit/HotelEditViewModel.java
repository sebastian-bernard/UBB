package ro.ubb.sebi.hotelmanager.ui.hotelEdit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lro/ubb/sebi/hotelmanager/ui/hotelEdit/HotelEditViewModel;", "Landroidx/lifecycle/ViewModel;", "hotelId", "", "database", "Lro/ubb/sebi/hotelmanager/data/HotelDatabaseDao;", "(Ljava/lang/String;Lro/ubb/sebi/hotelmanager/data/HotelDatabaseDao;)V", "hotel", "Landroidx/lifecycle/LiveData;", "Lro/ubb/sebi/hotelmanager/data/models/Hotel;", "getHotel", "()Landroidx/lifecycle/LiveData;", "mutableHotel", "Landroidx/lifecycle/MutableLiveData;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "save", "", "update", "app_debug"})
public final class HotelEditViewModel extends androidx.lifecycle.ViewModel {
    private final java.lang.String hotelId = null;
    private final ro.ubb.sebi.hotelmanager.data.HotelDatabaseDao database = null;
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private final androidx.lifecycle.MutableLiveData<ro.ubb.sebi.hotelmanager.data.models.Hotel> mutableHotel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ro.ubb.sebi.hotelmanager.data.models.Hotel> hotel = null;
    
    public HotelEditViewModel(@org.jetbrains.annotations.Nullable()
    java.lang.String hotelId, @org.jetbrains.annotations.NotNull()
    ro.ubb.sebi.hotelmanager.data.HotelDatabaseDao database) {
        super();
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    ro.ubb.sebi.hotelmanager.data.models.Hotel hotel) {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    ro.ubb.sebi.hotelmanager.data.models.Hotel hotel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ro.ubb.sebi.hotelmanager.data.models.Hotel> getHotel() {
        return null;
    }
}