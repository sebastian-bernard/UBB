package ro.ubb.sebi.hotelmanager.databinding;
import ro.ubb.sebi.hotelmanager.R;
import ro.ubb.sebi.hotelmanager.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HotelCardBindingImpl extends HotelCardBinding implements ro.ubb.sebi.hotelmanager.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HotelCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private HotelCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.dateText.setTag(null);
        this.fullText.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.nameText.setTag(null);
        this.priceText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new ro.ubb.sebi.hotelmanager.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.clickListener == variableId) {
            setClickListener((ro.ubb.sebi.hotelmanager.ui.hotelList.ClickHotelListener) variable);
        }
        else if (BR.hotel == variableId) {
            setHotel((ro.ubb.sebi.hotelmanager.data.models.Hotel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable ro.ubb.sebi.hotelmanager.ui.hotelList.ClickHotelListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setHotel(@Nullable ro.ubb.sebi.hotelmanager.data.models.Hotel Hotel) {
        this.mHotel = Hotel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.hotel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        ro.ubb.sebi.hotelmanager.ui.hotelList.ClickHotelListener clickListener = mClickListener;
        ro.ubb.sebi.hotelmanager.data.models.Hotel hotel = mHotel;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            ro.ubb.sebi.hotelmanager.ui.BindingUtilsKt.setHotelDate(this.dateText, hotel);
            ro.ubb.sebi.hotelmanager.ui.BindingUtilsKt.setHotelFull(this.fullText, hotel);
            ro.ubb.sebi.hotelmanager.ui.BindingUtilsKt.setHotelName(this.nameText, hotel);
            ro.ubb.sebi.hotelmanager.ui.BindingUtilsKt.setHotelPrice(this.priceText, hotel);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // clickListener
        ro.ubb.sebi.hotelmanager.ui.hotelList.ClickHotelListener clickListener = mClickListener;
        // hotel
        ro.ubb.sebi.hotelmanager.data.models.Hotel hotel = mHotel;
        // clickListener != null
        boolean clickListenerJavaLangObjectNull = false;



        clickListenerJavaLangObjectNull = (clickListener) != (null);
        if (clickListenerJavaLangObjectNull) {



            clickListener.onClick(hotel);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListener
        flag 1 (0x2L): hotel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}