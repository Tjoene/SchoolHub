<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
  <body>  
     <div class="row">     
        <h1>Title : ${title}</h1>
		<h1>Message : ${message}</h1>
		
		<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h2>Welcome : ${pageContext.request.userPrincipal.name} 
		               | <a href="<c:url value="/logout" />" > Logout</a></h2>  
		</c:if>
     </div>
 </body>
</html>