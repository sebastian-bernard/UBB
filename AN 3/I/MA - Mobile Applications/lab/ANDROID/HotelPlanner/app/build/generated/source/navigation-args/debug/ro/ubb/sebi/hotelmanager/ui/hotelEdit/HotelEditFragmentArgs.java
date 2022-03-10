package ro.ubb.sebi.hotelmanager.ui.hotelEdit;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HotelEditFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private HotelEditFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private HotelEditFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static HotelEditFragmentArgs fromBundle(@NonNull Bundle bundle) {
    HotelEditFragmentArgs __result = new HotelEditFragmentArgs();
    bundle.setClassLoader(HotelEditFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("hotelId")) {
      String hotelId;
      hotelId = bundle.getString("hotelId");
      __result.arguments.put("hotelId", hotelId);
    } else {
      throw new IllegalArgumentException("Required argument \"hotelId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public String getHotelId() {
    return (String) arguments.get("hotelId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("hotelId")) {
      String hotelId = (String) arguments.get("hotelId");
      __result.putString("hotelId", hotelId);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    HotelEditFragmentArgs that = (HotelEditFragmentArgs) object;
    if (arguments.containsKey("hotelId") != that.arguments.containsKey("hotelId")) {
      return false;
    }
    if (getHotelId() != null ? !getHotelId().equals(that.getHotelId()) : that.getHotelId() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getHotelId() != null ? getHotelId().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "HotelEditFragmentArgs{"
        + "hotelId=" + getHotelId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(HotelEditFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@Nullable String hotelId) {
      this.arguments.put("hotelId", hotelId);
    }

    @NonNull
    public HotelEditFragmentArgs build() {
      HotelEditFragmentArgs result = new HotelEditFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setHotelId(@Nullable String hotelId) {
      this.arguments.put("hotelId", hotelId);
      return this;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getHotelId() {
      return (String) arguments.get("hotelId");
    }
  }
}
