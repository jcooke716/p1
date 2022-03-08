package service;

import java.util.List;

import dao.AdminDao;
import dao.AdminDaoImpl;
import pojo.AdminPojo;
import pojo.EmployeePojo;
import pojo.ExpensePojo;
import pojo.FinalExpensesPojo;
import pojo.PendingExpensesPojo;

public class AdminServiceImpl implements AdminService {
	
	AdminDao adminDao;
	
	public AdminServiceImpl() {
		adminDao = new AdminDaoImpl();
	}

	@Override
	public EmployeePojo fetchEmployee(int empId) {
		return adminDao.fetchEmployee(empId);
	}

	@Override
	public AdminPojo fetchAdmin(int adminId) {
		return adminDao.fetchAdmin(adminId);
	}

	@Override
	public List<EmployeePojo> fetchAllEmployees() {
		return adminDao.fetchAllEmployees();
	}

	@Override
	public List<ExpensePojo> fetchAllExpenses(int empId) {
		return adminDao.fetchAllExpenses(empId);
	}

	@Override
	public List<ExpensePojo> fetchAllPendingExpenses() {
		return adminDao.fetchAllPendingExpenses();
	}

	@Override
	public List<ExpensePojo> fetchAllFinalExpenses() {
		return adminDao.fetchAllFinalExpenses();
	}

	@Override
	public PendingExpensesPojo fetchPendingExpense(int expenseId) {
		return adminDao.fetchPendingExpense(expenseId);
	}

	@Override
	public FinalExpensesPojo approveExpense(PendingExpensesPojo pendPojo) {
		return adminDao.approveExpense(pendPojo);
	}

	@Override
	public FinalExpensesPojo denyExpense(PendingExpensesPojo pendPojo) {
		return adminDao.denyExpense(pendPojo);
	}

	@Override
	public ExpensePojo deletePendingExpense(int expenseId) {
		return adminDao.deletePendingExpense(expenseId);
	}

	@Override
	public ExpensePojo fetchNewestExpense() {
		return adminDao.fetchNewestExpense();
	}

	@Override
	public AdminPojo loginAdmin(AdminPojo pojoIn) {
		return adminDao.loginAdmin(pojoIn);
	}

}
