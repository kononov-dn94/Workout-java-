package com.javacode.javaio;

import com.javacore.collections.map.treemap.AverageStudentGrade;
import com.javacore.collections.map.treemap.SubjectGrade;
import com.javacore.collections.map.treemap.TreeMapRunner;

import java.io.FileWriter;
import java.util.NAvigadleMap;
import java.util.Set;

public class IOMain {
	public static void main(String[] args) {
		NavigableMap<AverageStudentGrade, Set<SubjectGrade>> graes = TreeMapRunner.createGrades();
		FileWriter writer = new FileWriter("GradeBook.txt");
		for(AverageStudentSrade gradeKey: grades.keySet()){
			writer.write("==============================================/n");
			writer.write();
		}
	}
}
