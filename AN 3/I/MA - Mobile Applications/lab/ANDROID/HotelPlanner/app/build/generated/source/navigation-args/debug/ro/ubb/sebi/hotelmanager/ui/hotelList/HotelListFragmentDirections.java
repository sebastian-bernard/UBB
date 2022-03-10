package ro.ubb.sebi.hotelmanager.ui.hotelList;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import ro.ubb.sebi.hotelmanager.R;

public class HotelListFragmentDirections {
  private HotelListFragmentDirections() {
  }

  @NonNull
  public static ActionHotelListFragmentToHotelEditFragment actionHotelListFragmentToHotelEditFragment(
      @Nullable String hotelId) {
    return new ActionHotelListFragmentToHotelEditFragment(hotelId);
  }

  public static class ActionHotelListFragmentToHotelEditFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionHotelListFragmentToHotelEditFragment(@Nullable String hotelId) {
      this.arguments.put("hotelId", hotelId);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHotelListFragmentToHotelEditFragment setHotelId(@Nullable String hotelId) {
      this.arguments.put("hotelId", hotelId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("hotelId")) {
        String hotelId = (String) arguments.get("hotelId");
        __result.putString("hotelId", hotelId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_hotelListFragment_to_hotelEditFragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getHotelId() {
      return (String) arguments.get("hotelId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHotelListFragmentToHotelEditFragment that = (ActionHotelListFragmentToHotelEditFragment) object;
      if (arguments.containsKey("hotelId") != that.arguments.containsKey("hotelId")) {
        return false;
      }
      if (getHotelId() != null ? !getHotelId().equals(that.getHotelId()) : that.getHotelId() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getHotelId() != null ? getHotelId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHotelListFragmentToHotelEditFragment(actionId=" + getActionId() + "){"
          + "hotelId=" + getHotelId()
          + "}";
    }
  }
}
