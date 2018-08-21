package auto.demo2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransactionTest {

  @Test
  public void builder() {
    Transaction a = Transaction.builder().id(1).user("foo").build();
    Transaction b = Transaction.of(1, "foo");
    assertEquals(a, b);
  }
}
