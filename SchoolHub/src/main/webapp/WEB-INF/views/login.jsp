<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1>Debug</h1>
<div>
    <table class="table table-striped">
        <tr><th>User</th><th>Password</th><th>Permission</th></tr>
        <tr><td>admin</td><td>password</td><td>ROLE_USER,ROLE_ADMIN</td></tr>
        <tr><td>tjoene</td><td>password</td><td>ROLE_USER</td></tr>
    </table>        
</div>
<br>
<h1>Login</h1>

<div class="section">
	<c:if test="${not empty error}">
		<div id="errorAlert" class="alert alert-dismissable alert-danger fade in" role="alert">
	      <button style="button" class="close" data-dismiss="alert" aria-hidden="true" sourceindex="1">×</button>
	      <strong>Reason:</strong> This is the staging environment! Use this enviroment for developing only!
	    </div>
	</c:if>
</div>

<div class="col-lg-8">
	<form name="f" class="form-horizontal " method="POST" action="<c:url value="/loginProcess" />" role="form" accept-charset="UTF-8">
	    <fieldset class="form-group">
	        <label class="col-sm-2 control-label" for="user">Username</label>
	        <label class="sr-only" for="j_username">username</label>
	        <div class="col-sm-10">
	            <input type="text" class="form-control" id="j_username" name="j_username" value="${SPRING_SECURITY_LAST_USERNAME}" placeholder="username" required>
	        </div>
	    </fieldset>
	    <fieldset class="form-group">
	        <label class="col-sm-2 control-label" for="j_password">Password</label>
	        <label class="sr-only" for="j_password">password</label>
	        <div class="col-sm-10">
	            <input type="password" class="form-control" id="j_password" name="j_password" placeholder="password" required>
	        </div>
	    </fieldset>
	    <fieldset class="form-group">
	        <label class="col-sm-2 control-label">Remember</label>
	        <div class="col-sm-10">
	            <div class="checkbox">
	                <label for="remember">
	                    <input type="checkbox" name="_spring_security_remember_me" id="_spring_security_remember_me" value="true" checked />
	                    remember
	                </label>
	            </div>
	        </div>
	    </fieldset>
	    <fieldset class="form-group">
	        <div class="col-sm-offset-2 col-sm-10">
	            <button type="submit" class="btn btn-primary" id="submit" name="submit">Sign in</button>
	        </div>
	    </fieldset>
	</form>
</div>
