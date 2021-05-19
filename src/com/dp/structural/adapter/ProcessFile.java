package com.dp.structural.adapter;

import java.util.Arrays;

public class ProcessFile implements IFileType {
	
	public ProcessFile() {
	}
	
	@Override
	public void process(String type, String name) {
		if (type == null || type.trim().isEmpty()
				|| name == null || name.trim().isEmpty()
				|| !Arrays.asList("csv", "xml", "tsv").contains(type.toLowerCase())) {
			System.out.println("Invalid file name or type");
			return;
		}
		if (type.equals("csv")) {
			new ProcessCsvFile().process(name);
			return;
		}
		if (type.equals("xml")) {
			System.out.println("Processing XML file: '" + name + "'.");
			return;
		}
		System.out.println("Processing TSV file: '" + name + "'.");
	}
}