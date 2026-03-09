package task5

import org.junit.*
import org.junit.Assert.*
import Optionals.*
import OptionalInt.*

class OptionalIntTest:
  @Test def emptyOptionalShouldBeEmpty(): Unit =
    val empty = Empty()
    assertTrue(isEmpty(empty))

  @Test def nonEmptyOptionalShouldNotBeEmpty(): Unit =
    val nonEmpty = Just(0)
    assertFalse(isEmpty(nonEmpty))

  @Test def orElseShouldReturnDefaultWhenEmpty(): Unit =
    val nonEmpty = Just(0)
    assertEquals(0, orElse(nonEmpty, 1))

  @Test def orElseShouldReturnValueWhenNonEmpty(): Unit =
    val empty = Empty()
    assertEquals(1, orElse(empty, 1))

  /** Task 5: do test for map * */
  @Test def shouldMapWhenNonEmpty(): Unit =
    val nonEmpty: OptionalInt = Just(5)
    assertEquals(Just(6), mapInt(nonEmpty)(_ + 1))

  @Test def mapShouldReturnEmptyWhenEmpty(): Unit =
    val empty: OptionalInt = Empty()
    assertEquals(Empty(), mapInt(empty)(_ + 1))

