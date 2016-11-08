<!DOCTYPE html>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="//netdna.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
  </head>
  <body>
  <br>
  <h1>Enter the system</h1>
  <form action="Login" method="post">
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