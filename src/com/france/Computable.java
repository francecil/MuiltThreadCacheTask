package com.france;

public interface Computable<A, V> {
	V compute(A arg)throws InterruptedException;
}
