package auto.demo2;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Transaction {

  public static Builder builder() {
    return new AutoValue_Transaction.Builder();
  }

  public static Transaction of(long id, String user) {
    return new AutoValue_Transaction.Builder().id(id).user(user).build();
  }

  public abstract long id();

  public abstract String user();

  @AutoValue.Builder
  public abstract static class Builder {
    abstract Builder id(long id);

    abstract Builder user(String user);

    abstract Transaction build();
  }
}
