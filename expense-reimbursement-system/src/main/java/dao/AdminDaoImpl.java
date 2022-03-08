package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.AdminPojo;
import pojo.EmployeePojo;
import pojo.ExpensePojo;
import pojo.FinalExpensesPojo;
import pojo.PendingExpensesPojo;

public class AdminDaoImpl implements AdminDao {

	@Override
	public EmployeePojo fetchEmployee(int empId) {
		Connection conn = DBUtil.getConnection();
		EmployeePojo empPojo = null;
		try {
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM employee_details WHERE emp_id=" + empId;
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next()) {
				empPojo = new EmployeePojo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getLong(5), rs.getString(6), rs.getString(7), rs.getInt(8));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return empPojo;

	}

	@Override
	public AdminPojo fetchAdmin(int adminId) {
		Connection conn = DBUtil.getConnection();
		AdminPojo adminPojo = null;
		try {
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM admin_details WHERE admin_id=" + adminId;
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next()) {
				adminPojo = new AdminPojo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getLong(5), rs.getString(6), rs.getString(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return adminPojo;
	}

	@Override
	public List<EmployeePojo> fetchAllEmployees() {
		Connection conn = DBUtil.getConnection();
		List<EmployeePojo> allEmployees = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM employee_details";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				EmployeePojo empPojo = new EmployeePojo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getLong(5), rs.getString(6), rs.getString(7), rs.getInt(8));
				allEmployees.add(empPojo);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return allEmployees;
	}

	@Override
	public List<ExpensePojo> fetchAllExpenses(int empId) {
		Connection conn = DBUtil.getConnection();
		List<ExpensePojo> EmployeeExpenses = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			String query1 = "SELECT reimbursements_pending.pend_id AS expense_id, employee_details.emp_first_name AS employee_name, reimbursements_pending.pend_amount AS amount, reimbursements_pending.pend_reason AS reason, reimbursements_pending.pend_request_time AS created_at, reimbursements_pending.pend_resolve_time AS resolved_at, admin_details.admin_first_name AS manager, reimbursements_pending.pend_status AS status FROM reimbursements_pending LEFT JOIN employee_details ON reimbursements_pending.pend_request=employee_details.emp_id LEFT JOIN admin_details ON reimbursements_pending.pend_response=admin_details.admin_id WHERE pend_request="
					+ empId;
			ResultSet rs = stmt.executeQuery(query1);
			while (rs.next()) {
				ExpensePojo pendPojo = new ExpensePojo(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4),
						rs.getTimestamp(5).toString(), rs.getString(6), rs.getString(7), rs.getString(8));
				EmployeeExpenses.add(pendPojo);
			}
			String query2 = "SELECT reimbursements_final.final_id AS expense_id, employee_details.emp_first_name AS employee_name, reimbursements_final.final_amount AS amount, reimbursements_final.final_reason AS reason, reimbursements_final.final_request_time AS created_at, reimbursements_final.final_resolve_time AS resolved_at, admin_details.admin_first_name AS manager, reimbursements_final.final_status AS status FROM reimbursements_final LEFT JOIN employee_details ON reimbursements_final.final_request=employee_details.emp_id LEFT JOIN admin_details ON reimbursements_final.final_response=admin_details.admin_id WHERE final_request="
					+ empId;
			ResultSet rs2 = stmt.executeQuery(query2);
			while (rs2.next()) {
				ExpensePojo finalPojo = new ExpensePojo(rs2.getInt(1), rs2.getString(2), rs2.getDouble(3),
						rs2.getString(4), rs2.getTimestamp(5).toString(), rs2.getTimestamp(6).toString(), rs2.getString(7), rs2.getString(8));
				EmployeeExpenses.add(finalPojo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EmployeeExpenses;
	}

	@Override
	public List<ExpensePojo> fetchAllPendingExpenses() {
		Connection conn = DBUtil.getConnection();
		List<ExpensePojo> allEmployeeExpenses = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			String query = "SELECT reimbursements_pending.pend_id AS expense_id, employee_details.emp_first_name AS employee_name, reimbursements_pending.pend_amount AS amount, reimbursements_pending.pend_reason AS reason, reimbursements_pending.pend_request_time AS created_at, reimbursements_pending.pend_resolve_time AS resolved_at, admin_details.admin_first_name AS manager, reimbursements_pending.pend_status AS status FROM reimbursements_pending LEFT JOIN employee_details ON reimbursements_pending.pend_request=employee_details.emp_id LEFT JOIN admin_details ON reimbursements_pending.pend_response=admin_details.admin_id;";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				ExpensePojo pendPojo = new ExpensePojo(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4),
						rs.getTimestamp(5).toString(), rs.getString(6), rs.getString(7), rs.getString(8));
				allEmployeeExpenses.add(pendPojo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allEmployeeExpenses;
	}

	@Override
	public List<ExpensePojo> fetchAllFinalExpenses() {
		Connection conn = DBUtil.getConnection();
		List<ExpensePojo> allResolvedExpenses = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			String query = "SELECT reimbursements_final.final_id AS expense_id, employee_details.emp_first_name AS employee_name, reimbursements_final.final_amount AS amount, reimbursements_final.final_reason AS reason, reimbursements_final.final_request_time AS created_at, reimbursements_final.final_resolve_time AS resolved_at, admin_details.admin_first_name AS manager, reimbursements_final.final_status AS status FROM reimbursements_final LEFT JOIN employee_details ON reimbursements_final.final_request=employee_details.emp_id LEFT JOIN admin_details ON reimbursements_final.final_response=admin_details.admin_id;";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				ExpensePojo finalPojo = new ExpensePojo(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4),
						rs.getTimestamp(5).toString(), rs.getTimestamp(6).toString(), rs.getString(7), rs.getString(8));
				allResolvedExpenses.add(finalPojo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allResolvedExpenses;
	}

	@Override
	public AdminPojo loginAdmin(AdminPojo pojoIn) {
		Connection conn = DBUtil.getConnection();
		AdminPojo loginPojo = new AdminPojo(0, "", "", "", 0, "", "");
		AdminPojo fetchedPojo = fetchAdmin(pojoIn.getAdminId());
		if (fetchedPojo.getAdminPassword().equals(pojoIn.getAdminPassword())) {
			loginPojo = fetchedPojo;
		}
		return loginPojo;

	}

	@Override
	public PendingExpensesPojo fetchPendingExpense(int expenseId) {
		Connection conn = DBUtil.getConnection();
		Statement stmt;
		PendingExpensesPojo fetchedExpense = null;
		try {
			stmt = conn.createStatement();
			String query = "SELECT * FROM reimburesments_pending WHERE pend_id=" + expenseId;
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				fetchedExpense = new PendingExpensesPojo(rs.getInt(1), rs.getInt(2), rs.getDouble(3), rs.getString(4),
						rs.getTimestamp(5), rs.getString(6), rs.getInt(7), rs.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fetchedExpense;
	}

	@Override
	public ExpensePojo deletePendingExpense(int expenseId) {
		Connection conn = DBUtil.getConnection();
		ExpensePojo deletedExpense = null;
		try {
			Statement stmt = conn.createStatement();
			String query1 = "DELETE FROM reimbursements_pending WHERE pend_id=" + expenseId;
			deletedExpense.setExpenseId(expenseId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deletedExpense;

	}

	@Override
	public FinalExpensesPojo approveExpense(PendingExpensesPojo pendPojo) {
		Connection conn = DBUtil.getConnection();
		FinalExpensesPojo approvedRequest = null;
		try {
			Statement stmt = conn.createStatement();
			String query1 = "INSERT INTO reimbursements_final VALUES("+pendPojo.getPendingId()+", " + pendPojo.getPendingRequest() + ", "
					+ pendPojo.getPendingAmount() + ", '" + pendPojo.getPendingReason() + "', "+pendPojo.getPendingCreated()+", DEFAULT, "
					+ pendPojo.getPendingResponse() + ", 'APPROVED');";
			int rows = stmt.executeUpdate(query1);
			String query2 = "SELECT MAX(final_id) FROM reimbursements_final;";
			ResultSet rs1 = stmt.executeQuery(query2);
			int finalId = rs1.getInt(1);
			String query3 = "SELECT * FROM reimbursements_final WHERE final_id=" + finalId;
			ResultSet rs2 = stmt.executeQuery(query3);
			while (rs2.next()) {
				approvedRequest = new FinalExpensesPojo(rs2.getInt(1), rs2.getInt(2), rs2.getDouble(3),
						rs2.getString(4), rs2.getTimestamp(5), rs2.getTimestamp(6), rs2.getInt(7), rs2.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return approvedRequest;

	}

	@Override
	public FinalExpensesPojo denyExpense(PendingExpensesPojo pendPojo) {
		Connection conn = DBUtil.getConnection();
		FinalExpensesPojo deniedRequest = null;
		try {
			Statement stmt = conn.createStatement();
			String query1 = "INSERT INTO reimbursements_final VALUES("+pendPojo.getPendingId()+", " + pendPojo.getPendingRequest() + ", "
					+ pendPojo.getPendingAmount() + ", '" + pendPojo.getPendingReason() + "', "+pendPojo.getPendingCreated()+", DEFAULT, "
					+ pendPojo.getPendingResponse() + ", 'DENIED');";
			int rows = stmt.executeUpdate(query1);
			String query2 = "SELECT MAX(final_id) FROM reimbursements_final;";
			ResultSet rs1 = stmt.executeQuery(query2);
			int finalId = rs1.getInt(1);
			String query3 = "SELECT * FROM reimbursements_final WHERE final_id=" + finalId;
			ResultSet rs2 = stmt.executeQuery(query3);
			while (rs2.next()) {
				deniedRequest = new FinalExpensesPojo(rs2.getInt(1), rs2.getInt(2), rs2.getDouble(3), rs2.getString(4),
						rs2.getTimestamp(5), rs2.getTimestamp(6), rs2.getInt(7), rs2.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return deniedRequest;
	}

	@Override
	public ExpensePojo fetchNewestExpense() {
		// TODO Auto-generated method stub
		return null;
	}

}
