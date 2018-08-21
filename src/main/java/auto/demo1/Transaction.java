package auto.demo1;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Transaction {

  public static Transaction of(long id, String user) {
    return new AutoValue_Transaction(id, user);
  }

  public abstract long id();

  public abstract String user();
}
