package com.directi.training.lsp.exercise_refactored;

public interface Duck {
    public default void quack() throws Exception{}
    public default void swim() throws Exception {}
}
