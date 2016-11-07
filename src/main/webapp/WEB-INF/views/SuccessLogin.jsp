<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SuccesLogin</title>
  </head>
  <body>
  <br>
  <h1>Enter the system</h1>
  <form action="WriteMessage" method="post">
      User: <input type="text" name="Name" size="10"><br>
      Password: <input type="password" name="Password" size="10"><br>
      <p>
      <table>
          <tr>
          <th><small>
              <input type="submit" name="login" value="Enter the system">
          </small>
          <th><small>
              <input type="button" class="button_active" onclick="location.href='Registration.html';"value="Registration" />
              </small>
      </table>
  </form>
  <br>
  </body>
</html>