package ro.ubb.sebi.hotelmanager.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ro.ubb.sebi.hotelmanager.data.models.Operation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HotelDatabaseDao_Impl implements HotelDatabaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Operation> __insertionAdapterOfOperation;

  private final EntityDeletionOrUpdateAdapter<Operation> __deletionAdapterOfOperation;

  public HotelDatabaseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOperation = new EntityInsertionAdapter<Operation>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `operations` (`opId`,`opType`,`name`,`price`,`dateBooked`,`full`,`_id`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Operation value) {
        stmt.bindLong(1, value.getOpId());
        stmt.bindLong(2, value.getOpType());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        stmt.bindLong(4, value.getPrice());
        stmt.bindLong(5, value.getDateBooked());
        final int _tmp = value.getFull() ? 1 : 0;
        stmt.bindLong(6, _tmp);
        if (value.get_id() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.get_id());
        }
      }
    };
    this.__deletionAdapterOfOperation = new EntityDeletionOrUpdateAdapter<Operation>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `operations` WHERE `opId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Operation value) {
        stmt.bindLong(1, value.getOpId());
      }
    };
  }

  @Override
  public Object insertOperation(final Operation operation,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOperation.insert(operation);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteOperation(final Operation[] operation,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfOperation.handleMultiple(operation);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getOperations(final Continuation<? super List<Operation>> continuation) {
    final String _sql = "SELECT * FROM operations";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Operation>>() {
      @Override
      public List<Operation> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOpId = CursorUtil.getColumnIndexOrThrow(_cursor, "opId");
          final int _cursorIndexOfOpType = CursorUtil.getColumnIndexOrThrow(_cursor, "opType");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfDateBooked = CursorUtil.getColumnIndexOrThrow(_cursor, "dateBooked");
          final int _cursorIndexOfFull = CursorUtil.getColumnIndexOrThrow(_cursor, "full");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final List<Operation> _result = new ArrayList<Operation>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Operation _item;
            final long _tmpOpId;
            _tmpOpId = _cursor.getLong(_cursorIndexOfOpId);
            final int _tmpOpType;
            _tmpOpType = _cursor.getInt(_cursorIndexOfOpType);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final long _tmpDateBooked;
            _tmpDateBooked = _cursor.getLong(_cursorIndexOfDateBooked);
            final boolean _tmpFull;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfFull);
            _tmpFull = _tmp != 0;
            final String _tmp_id;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmp_id = null;
            } else {
              _tmp_id = _cursor.getString(_cursorIndexOfId);
            }
            _item = new Operation(_tmpOpId,_tmpOpType,_tmpName,_tmpPrice,_tmpDateBooked,_tmpFull,_tmp_id);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
