package ro.ubb.sebi.hotelmanager.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lro/ubb/sebi/hotelmanager/data/ConnectivityLiveData;", "Landroidx/lifecycle/LiveData;", "", "connectivityManager", "Landroid/net/ConnectivityManager;", "(Landroid/net/ConnectivityManager;)V", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "onActive", "", "onInactive", "app_debug"})
public final class ConnectivityLiveData extends androidx.lifecycle.LiveData<java.lang.Boolean> {
    private final android.net.ConnectivityManager connectivityManager = null;
    private final android.net.ConnectivityManager.NetworkCallback networkCallback = null;
    
    public ConnectivityLiveData(@org.jetbrains.annotations.NotNull()
    android.net.ConnectivityManager connectivityManager) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onActive() {
    }
    
    @java.lang.Override()
    protected void onInactive() {
    }
}