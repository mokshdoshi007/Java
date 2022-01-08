
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.bean;
import com.dao.dao;

@WebServlet("/servlet")
public class servlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("Register"))
		{
			bean ob = new bean();
			ob.setName(request.getParameter("name"));
			ob.setMobile(request.getParameter("mobile"));
			ob.setEmail(request.getParameter("email"));
			ob.setPassword(request.getParameter("password"));
			dao.insertdata(ob);
			String emailid = ob.getEmail();
			String username = ob.getName();
			final String Senderid = "mokshdoshiproject@gmail.com";
			final String password = "moksh123";
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
			Session session = Session.getInstance(props, new Authenticator() 
			{
			protected PasswordAuthentication getPasswordAuthentication() 
			{
			return new PasswordAuthentication(Senderid, password);
			}
			});

			try {
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(Senderid));
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailid));// to // mail //
																								// address.
				message.setSubject("Welcome...");
				String msg1 = "<!DOCTYPE html><html><head></head><body><center><div style='background-color:#f8f8f8; width:500px; height:200px'><div style='background-color:#00e58b; width:500px; height:50px'><h3 style='color:white; padding-top:10px;'>Welcome </h3></div><p style='color:gray; margin-left:-300px;'>Dear "
						+ username + 
						",</p><br><p style='color:gray; margin-top:-10px;'> welcome in Tops technologies.</p><div></center></body></html>";
				message.setContent(msg1, "text/html; charset=utf-8");

				Transport.send(message);

			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("login.jsp");
		}
		else if(action.equalsIgnoreCase("Login"))
		{
			bean ob = new bean();
			ob.setEmail(request.getParameter("email"));
			ob.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
			bean o = dao.checklogin(ob);
			if(email.equalsIgnoreCase("") || pass.equalsIgnoreCase(""))
			{
				out.println("Email or Password Missing");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
			else if(o==null)
			{
				out.println("Incorrect Email or Password");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
			else
			{
				HttpSession session = request.getSession();
				session.setAttribute("o", o);
				System.out.println("");
				request.getRequestDispatcher("home.jsp").forward(request, response);
			}		
		}
		else if(action.equalsIgnoreCase("Send OTP"))
		{
			bean ob = new bean();
			ob.setEmail(request.getParameter("email"));
			String email = request.getParameter("email");
			bean o = dao.checkEmail(email);
			if(o==null)
			{
				request.setAttribute("invalidemail", "Email Address Not Valid");
				request.getRequestDispatcher("forgot.jsp").forward(request, response);
			}
			else
			{
				
				String emailid=o.getEmail();
				String username=o.getName();
				final String Senderid = "mokshdoshiproject@gmail.com";
				final String password = "moksh123";
				Properties props = new Properties();
				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", "smtp.gmail.com");
				props.put("mail.smtp.port", "587");
				Session session = Session.getInstance(props, new Authenticator() 
				{
				protected PasswordAuthentication getPasswordAuthentication() 
				{
				return new PasswordAuthentication(Senderid, password);
				}
				});

				try {
					Random rand = new Random();
					int otp = rand.nextInt(900000) + 100000;
					Message message = new MimeMessage(session);
					message.setFrom(new InternetAddress(Senderid));
					message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailid));// to
																									// mail
																									// address.
					message.setSubject("OTP Request");
					String msg1 = "<!DOCTYPE html><html><head></head><body><center><div style='background-color:#f8f8f8; width:500px; height:200px'><div style='background-color:#00e58b; width:500px; height:50px'><h3 style='color:white; padding-top:10px;'>EmailDemo.com </h3></div><p style='color:gray; margin-left:-300px;'>Dear "
							+ username + ",</p><br><p style='color:gray; margin-top:-10px;'>" + otp
							+ "  is your One Time Password.Do NOT share this code with anyone for security reasons.this is valid for 10 minutes.</p><div></center></body></html>";
					message.setContent(msg1, "text/html; charset=utf-8");
					Transport.send(message);
					HttpSession otpsession = request.getSession();
					otpsession.setAttribute("otp", otp);
					otpsession.setMaxInactiveInterval(10 * 60); /*Session Set for 10 minutes*/
					otpsession.setAttribute("UserData", o);
					request.getRequestDispatcher("SendOTP.jsp").forward(request, response);

				} catch (Exception e) {
					request.setAttribute("SendOtpError", "Otp Not Send");
					request.getRequestDispatcher("forgot.jsp").forward(request, response);
					e.printStackTrace();
				}
			}

		}
	}
}

