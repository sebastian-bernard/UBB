package ro.ubb.sebi.hotelmanager;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ro.ubb.sebi.hotelmanager.databinding.ActivityMainBindingImpl;
import ro.ubb.sebi.hotelmanager.databinding.HotelCardBindingImpl;
import ro.ubb.sebi.hotelmanager.databinding.HotelEditFragmentBindingImpl;
import ro.ubb.sebi.hotelmanager.databinding.HotelListFragmentBindingImpl;
import ro.ubb.sebi.hotelmanager.databinding.LoginFragmentBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_HOTELCARD = 2;

  private static final int LAYOUT_HOTELEDITFRAGMENT = 3;

  private static final int LAYOUT_HOTELLISTFRAGMENT = 4;

  private static final int LAYOUT_LOGINFRAGMENT = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(ro.ubb.sebi.hotelmanager.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ro.ubb.sebi.hotelmanager.R.layout.hotel_card, LAYOUT_HOTELCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ro.ubb.sebi.hotelmanager.R.layout.hotel_edit_fragment, LAYOUT_HOTELEDITFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ro.ubb.sebi.hotelmanager.R.layout.hotel_list_fragment, LAYOUT_HOTELLISTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ro.ubb.sebi.hotelmanager.R.layout.login_fragment, LAYOUT_LOGINFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_HOTELCARD: {
          if ("layout/hotel_card_0".equals(tag)) {
            return new HotelCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for hotel_card is invalid. Received: " + tag);
        }
        case  LAYOUT_HOTELEDITFRAGMENT: {
          if ("layout/hotel_edit_fragment_0".equals(tag)) {
            return new HotelEditFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for hotel_edit_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_HOTELLISTFRAGMENT: {
          if ("layout/hotel_list_fragment_0".equals(tag)) {
            return new HotelListFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for hotel_list_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_LOGINFRAGMENT: {
          if ("layout/login_fragment_0".equals(tag)) {
            return new LoginFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for login_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clickListener");
      sKeys.put(2, "hotel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", ro.ubb.sebi.hotelmanager.R.layout.activity_main);
      sKeys.put("layout/hotel_card_0", ro.ubb.sebi.hotelmanager.R.layout.hotel_card);
      sKeys.put("layout/hotel_edit_fragment_0", ro.ubb.sebi.hotelmanager.R.layout.hotel_edit_fragment);
      sKeys.put("layout/hotel_list_fragment_0", ro.ubb.sebi.hotelmanager.R.layout.hotel_list_fragment);
      sKeys.put("layout/login_fragment_0", ro.ubb.sebi.hotelmanager.R.layout.login_fragment);
    }
  }
}
