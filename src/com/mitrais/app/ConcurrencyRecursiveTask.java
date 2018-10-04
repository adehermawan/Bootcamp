package com.mitrais.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ConcurrencyRecursiveTask extends RecursiveTask<Integer>{
	
	private int[] arr;
	
	private static final int THRESHOLD = 20;
	
	public ConcurrencyRecursiveTask(int[] arr) {
		// TODO Auto-generated constructor stub
		this.arr = arr;
	}

	@Override
	protected Integer compute() {
		if (arr.length > THRESHOLD) {
			return ForkJoinTask.invokeAll(createSubtasks()).stream().mapToInt(ForkJoinTask::join).sum();
		}else {
			return processing(arr);
		}
	}

	private Integer processing(int[] arr) {
		return Arrays.stream(arr).filter(a -> a > 10 && a < 27).map(a -> a * 10).sum();
	}

	private Collection<ConcurrencyRecursiveTask> createSubtasks() {
		// TODO Auto-generated method stub
		List<ConcurrencyRecursiveTask> devidedTask = new ArrayList<>();
		
		devidedTask.add(new ConcurrencyRecursiveTask(Arrays.copyOfRange(arr, 0, arr.length / 2)));
		devidedTask.add(new ConcurrencyRecursiveTask(Arrays.copyOfRange(arr, arr.length/2, arr.length)));
		
		return devidedTask;
	}
	
}
