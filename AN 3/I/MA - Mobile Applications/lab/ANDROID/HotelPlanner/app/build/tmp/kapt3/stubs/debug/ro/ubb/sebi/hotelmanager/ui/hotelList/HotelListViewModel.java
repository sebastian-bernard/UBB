package ro.ubb.sebi.hotelmanager.ui.hotelList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0012R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lro/ubb/sebi/hotelmanager/ui/hotelList/HotelListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "hotels", "Landroidx/lifecycle/LiveData;", "", "Lro/ubb/sebi/hotelmanager/data/models/Hotel;", "getHotels", "()Landroidx/lifecycle/LiveData;", "mutableHotels", "Landroidx/lifecycle/MutableLiveData;", "mutableNavigateToEditHotel", "", "navigateToEditHotel", "getNavigateToEditHotel", "setNavigateToEditHotel", "(Landroidx/lifecycle/LiveData;)V", "logout", "", "onCardClicked", "_id", "onEditCardNavigated", "refresh", "app_debug"})
public final class HotelListViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<ro.ubb.sebi.hotelmanager.data.models.Hotel>> mutableHotels = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<ro.ubb.sebi.hotelmanager.data.models.Hotel>> hotels = null;
    private androidx.lifecycle.MutableLiveData<java.lang.String> mutableNavigateToEditHotel;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.String> navigateToEditHotel;
    
    public HotelListViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<ro.ubb.sebi.hotelmanager.data.models.Hotel>> getHotels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getNavigateToEditHotel() {
        return null;
    }
    
    public final void setNavigateToEditHotel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.String> p0) {
    }
    
    public final void refresh() {
    }
    
    public final void onCardClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String _id) {
    }
    
    public final void onEditCardNavigated() {
    }
    
    public final void logout() {
    }
}