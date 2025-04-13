package controllers;




import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.AccountOperations;
import db.TransactionOperations;
import entity.Account;
import entity.Transaction;
import entity.User;


@WebServlet("/ViewPassbookController")
public class ViewPassbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ViewPassbookController() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = null;
		HttpSession session = request.getSession();
		String filter = request.getParameter("filter");
		User user = (User) session.getAttribute("user");
		AccountOperations accOps = new AccountOperations();
		TransactionOperations transOps = new TransactionOperations();

		Account account = accOps.getAccountByUserId(user.getUserId());
		
		if (account == null) {
			request.setAttribute("message", "You don't have an account. Please contact the bank.");
		} else {

			int accountNo = account.getUserId();
			List<Transaction> transactions = transOps.getTransactionsByAccountNo(accountNo);
			
			if(filter.equalsIgnoreCase("deposit") || filter.equalsIgnoreCase("withdraw") || filter.equalsIgnoreCase("transfer")) {
				transactions = transactions.stream()
						.filter(t -> t.getType().equalsIgnoreCase(filter))
						.collect(Collectors.toList());
			}
			
			request.setAttribute("balance", account.getBalance());
			request.setAttribute("transactions", transactions);
			request.setAttribute("account", account);
			
			dispatcher = request.getRequestDispatcher("/viewPassbook.jsp");
		}
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

