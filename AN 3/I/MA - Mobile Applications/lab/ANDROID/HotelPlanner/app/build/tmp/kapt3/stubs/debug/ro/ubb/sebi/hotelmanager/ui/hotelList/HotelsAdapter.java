package ro.ubb.sebi.hotelmanager.ui.hotelList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lro/ubb/sebi/hotelmanager/ui/hotelList/HotelsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lro/ubb/sebi/hotelmanager/ui/hotelList/HotelsAdapter$HotelViewHolder;", "clickListener", "Lro/ubb/sebi/hotelmanager/ui/hotelList/ClickHotelListener;", "(Lro/ubb/sebi/hotelmanager/ui/hotelList/ClickHotelListener;)V", "value", "", "Lro/ubb/sebi/hotelmanager/data/models/Hotel;", "hotels", "getHotels", "()Ljava/util/List;", "setHotels", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "HotelViewHolder", "app_debug"})
public final class HotelsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ro.ubb.sebi.hotelmanager.ui.hotelList.HotelsAdapter.HotelViewHolder> {
    private final ro.ubb.sebi.hotelmanager.ui.hotelList.ClickHotelListener clickListener = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<ro.ubb.sebi.hotelmanager.data.models.Hotel> hotels;
    
    public HotelsAdapter(@org.jetbrains.annotations.NotNull()
    ro.ubb.sebi.hotelmanager.ui.hotelList.ClickHotelListener clickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ro.ubb.sebi.hotelmanager.data.models.Hotel> getHotels() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setHotels(@org.jetbrains.annotations.NotNull()
    java.util.List<ro.ubb.sebi.hotelmanager.data.models.Hotel> value) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ro.ubb.sebi.hotelmanager.ui.hotelList.HotelsAdapter.HotelViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ro.ubb.sebi.hotelmanager.ui.hotelList.HotelsAdapter.HotelViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lro/ubb/sebi/hotelmanager/ui/hotelList/HotelsAdapter$HotelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lro/ubb/sebi/hotelmanager/databinding/HotelCardBinding;", "(Lro/ubb/sebi/hotelmanager/databinding/HotelCardBinding;)V", "bind", "", "clickListener", "Lro/ubb/sebi/hotelmanager/ui/hotelList/ClickHotelListener;", "item", "Lro/ubb/sebi/hotelmanager/data/models/Hotel;", "Companion", "app_debug"})
    public static final class HotelViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final ro.ubb.sebi.hotelmanager.databinding.HotelCardBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final ro.ubb.sebi.hotelmanager.ui.hotelList.HotelsAdapter.HotelViewHolder.Companion Companion = null;
        
        private HotelViewHolder(ro.ubb.sebi.hotelmanager.databinding.HotelCardBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        ro.ubb.sebi.hotelmanager.ui.hotelList.ClickHotelListener clickListener, @org.jetbrains.annotations.NotNull()
        ro.ubb.sebi.hotelmanager.data.models.Hotel item) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lro/ubb/sebi/hotelmanager/ui/hotelList/HotelsAdapter$HotelViewHolder$Companion;", "", "()V", "from", "Lro/ubb/sebi/hotelmanager/ui/hotelList/HotelsAdapter$HotelViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final ro.ubb.sebi.hotelmanager.ui.hotelList.HotelsAdapter.HotelViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
}