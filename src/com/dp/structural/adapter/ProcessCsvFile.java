package com.dp.structural.adapter;

public class ProcessCsvFile implements IFile {
	
	public ProcessCsvFile() {
	}
	
	@Override
	public void process(String name) {
		if (name == null || name.trim().isEmpty()
				|| !name.contains(".csv".toLowerCase())) {
			System.out.println("Invalid CSV file.");
			return;
		}
		System.out.println("Processing CSV file: '" + name + "'.");
	}
}