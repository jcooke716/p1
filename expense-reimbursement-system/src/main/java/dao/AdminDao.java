package dao;

import java.util.List;

import pojo.AdminPojo;
import pojo.EmployeePojo;
import pojo.ExpensePojo;
import pojo.FinalExpensesPojo;
import pojo.PendingExpensesPojo;

public interface AdminDao {
	
	EmployeePojo fetchEmployee(int empId);
	
	AdminPojo fetchAdmin(int adminId);
	
	List<EmployeePojo> fetchAllEmployees();
	
	List<ExpensePojo> fetchAllExpenses(int empId);
	
	List<ExpensePojo> fetchAllPendingExpenses();
	
	List<ExpensePojo> fetchAllFinalExpenses();
	
	PendingExpensesPojo fetchPendingExpense(int expenseId);
	
	FinalExpensesPojo approveExpense(PendingExpensesPojo pendPojo);
	
	FinalExpensesPojo denyExpense(PendingExpensesPojo pendPojo);
	
	ExpensePojo deletePendingExpense(int expenseId);
	
	ExpensePojo fetchNewestExpense();
	
	AdminPojo loginAdmin(AdminPojo pojoIn);
	
	default void exitApplication() {
		DBUtil.closeConnection();
	}
	

}
