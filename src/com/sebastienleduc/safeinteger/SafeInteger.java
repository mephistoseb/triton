package com.sebastienleduc.safeinteger;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SafeInteger {

	private int intVar = 0;
	private AtomicInteger atomicVar = new AtomicInteger(0);
	private ReadWriteLock rwLock = new ReentrantReadWriteLock();

	public synchronized int firstWay() {
		return intVar++;
	}

	public int secondWay() {
		return atomicVar.incrementAndGet();
	}

	public int thirdWay() {
		rwLock.writeLock().lock();
		intVar++;
		rwLock.writeLock().unlock();

		rwLock.readLock().lock();
		try {
			return intVar;
		} finally {
			rwLock.readLock().unlock();
		}
	}

}
