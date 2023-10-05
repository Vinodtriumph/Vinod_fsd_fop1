package com.greatlearning.department.driver;

import com.greatlearning.department.service.AdminDepartment;
import com.greatlearning.department.service.HrDepartment;
import com.greatlearning.department.service.TechDepartment;

public class Driver {

	public static void main(String[] args) {

		AdminDepartment adminDept = new AdminDepartment();
		HrDepartment hrDept = new HrDepartment();
		TechDepartment techDept = new TechDepartment();

		String adminDep = adminDept.departmentName();
		String adminTodayWork = adminDept.getTodaysWork();
		String adminWorkDeadLine = adminDept.getWorkDeadline();
		String isAdminHoiday = adminDept.isTodayAHoliday();

		System.out.println(adminDep);
		System.out.println(adminTodayWork);
		System.out.println(adminWorkDeadLine);
		System.out.println(isAdminHoiday);

		System.out.println();

		String hrDep = hrDept.departmentName();
		String hrTodayWork = hrDept.getTodaysWork();
		String hrWorkDeadLine = hrDept.getWorkDeadline();
		String hrHoiday = hrDept.isTodayAHoliday();
		String hrDoActivity = hrDept.doActivity();

		System.out.println(hrDep);
		System.out.println(hrDoActivity);
		System.out.println(hrTodayWork);
		System.out.println(hrWorkDeadLine);
		System.out.println(hrHoiday);

		System.out.println();

		String techDep = techDept.departmentName();
		String techTodayWork = techDept.getTodaysWork();
		String techWorkDeadLine = techDept.getWorkDeadline();
		String isTechHoiday = techDept.isTodayAHoliday();
		String getTechStack = techDept.getTechStackInformation();

		System.out.println(techDep);
		System.out.println(techTodayWork);
		System.out.println(techWorkDeadLine);
		System.out.println(getTechStack);
		System.out.println(isTechHoiday);

	}

}
