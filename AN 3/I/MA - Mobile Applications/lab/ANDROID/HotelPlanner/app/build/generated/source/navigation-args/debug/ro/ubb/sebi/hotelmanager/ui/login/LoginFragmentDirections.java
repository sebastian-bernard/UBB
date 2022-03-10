package ro.ubb.sebi.hotelmanager.ui.login;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import ro.ubb.sebi.hotelmanager.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToHotelListFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_hotelListFragment);
  }
}
