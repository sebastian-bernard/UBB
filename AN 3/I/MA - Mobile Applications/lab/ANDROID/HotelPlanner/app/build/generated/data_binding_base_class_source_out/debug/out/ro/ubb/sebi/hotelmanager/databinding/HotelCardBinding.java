// Generated by data binding compiler. Do not edit!
package ro.ubb.sebi.hotelmanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import ro.ubb.sebi.hotelmanager.R;
import ro.ubb.sebi.hotelmanager.data.models.Hotel;
import ro.ubb.sebi.hotelmanager.ui.hotelList.ClickHotelListener;

public abstract class HotelCardBinding extends ViewDataBinding {
  @NonNull
  public final TextView dateText;

  @NonNull
  public final TextView fullText;

  @NonNull
  public final TextView nameText;

  @NonNull
  public final TextView priceText;

  @Bindable
  protected Hotel mHotel;

  @Bindable
  protected ClickHotelListener mClickListener;

  protected HotelCardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView dateText, TextView fullText, TextView nameText, TextView priceText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dateText = dateText;
    this.fullText = fullText;
    this.nameText = nameText;
    this.priceText = priceText;
  }

  public abstract void setHotel(@Nullable Hotel hotel);

  @Nullable
  public Hotel getHotel() {
    return mHotel;
  }

  public abstract void setClickListener(@Nullable ClickHotelListener clickListener);

  @Nullable
  public ClickHotelListener getClickListener() {
    return mClickListener;
  }

  @NonNull
  public static HotelCardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.hotel_card, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HotelCardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HotelCardBinding>inflateInternal(inflater, R.layout.hotel_card, root, attachToRoot, component);
  }

  @NonNull
  public static HotelCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.hotel_card, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HotelCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HotelCardBinding>inflateInternal(inflater, R.layout.hotel_card, null, false, component);
  }

  public static HotelCardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static HotelCardBinding bind(@NonNull View view, @Nullable Object component) {
    return (HotelCardBinding)bind(component, view, R.layout.hotel_card);
  }
}
