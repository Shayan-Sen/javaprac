package accenture.C7.lesson4.custom_annotations;

public interface UnitTests {
    default void beforeEachTest() {}
    default void afterEachTest() {}
}
