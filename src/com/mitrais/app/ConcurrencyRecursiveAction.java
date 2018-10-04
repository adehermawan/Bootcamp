package com.mitrais.app;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.logging.Logger;

import javax.annotation.processing.ProcessingEnvironment;

public class ConcurrencyRecursiveAction extends RecursiveAction {


	
	private String workload = "";
	private static final int TRESHOLD = 4;
	
	private static Logger logger = Logger.getAnonymousLogger();
	
	public ConcurrencyRecursiveAction(String workload) {
		this.workload = workload;
	}
	
	@Override
	protected void compute() {
		if (workload.length() > TRESHOLD) {
			ForkJoinTask.invokeAll(createSubtasks());
		}else {
			Processing(workload);
		}
	}

	private void Processing(String work) {
		// TODO Auto-generated method stub
		String result = work.toUpperCase();
		logger.info("This result - ("+result+") - was processed"+ Thread.currentThread().getName());		
	}

	private Collection<ConcurrencyRecursiveAction> createSubtasks() {
		List<ConcurrencyRecursiveAction> subtasks = new ArrayList<>();
		
		String partOne = workload.substring(0,workload.length() / 2);
		String partTwo = workload.substring(workload.length() / 2, workload.length());
		
		subtasks.add(new ConcurrencyRecursiveAction(partOne));
		subtasks.add(new ConcurrencyRecursiveAction(partTwo));
		
		return subtasks;
	}
	
	
}

