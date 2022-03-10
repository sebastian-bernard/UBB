package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new ro.ubb.sebi.hotelmanager.DataBinderMapperImpl());
  }
}
