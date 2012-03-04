<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="<%=request.getContextPath()%>/css/login.css" type="text/css" rel="stylesheet">
<title>Login</title>
</head>
<body id="login">
		<div id="wrappertop"></div>
			<div id="wrapper">
					<div id="content">
						<div id="header">
						</div>
						<div id="darkbanner" class="banner320">
							<h2>Login</h2>
						</div>
						<div id="darkbannerwrap">
						</div>
						<form name="form1" method="post" action="login.do">
						<fieldset class="form">
                        	                                                                                       <p>
								<label for="user_name">Username:</label>
								<input name="user_name" id="user_name" type="text" value="" />
							</p>
							<p>
								<label for="user_password">Password:</label>
								<input name="user_password" id="user_password" type="password" />
							</p>
							<button type="submit" class="positive" name="Submit">
								<img src="<%=request.getContextPath()%>/image/key.png" alt="Announcement"/>Login</button>
								<ul id="forgottenpassword">
								<li class="boldtext">|</li>
								<li><a href="">Forgotten it?</a></li>
							</ul>
                            </fieldset>
                            </form>
						
						
					</div>
				</div>   

		<div id="wrapperbottom_branding">
			<div id="wrapperbottom_branding_text">catfish team</div>
		</div>
</body>
</html>