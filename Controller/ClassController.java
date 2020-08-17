package Controller;

import java.sql.ResultSet;

import Model.ClassModel;
import View.ClassView;

public class ClassController {
	
	private ClassModel classModel;
	private ClassController classController;
	private ClassView classView;
	private ResultSet result;
	
	public ClassController(ClassModel classModel, ClassView classView ) {
		
		this.classModel = classModel;		
		this.classModel.classement();
		this.classView = classView;
		
		result = this.classModel.getRs();
		this.classView.classement(result);
		
		
	}

}
