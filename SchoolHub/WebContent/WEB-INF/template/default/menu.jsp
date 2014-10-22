<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="menu">
    <p>Menu</p>
	<ul>
	    <li>
	    	<spring:url value="/" var="homeUrl" htmlEscape="true"/>
 			<a href="${homeUrl}">Home</a>
 		</li>
 		<li>
	    	<spring:url value="/hello" var="helloUrl" htmlEscape="true"/>
 			<a href="${helloUrl}">Hello</a>
 		</li>
	    <li>
	    	<spring:url value="/student" var="studentUrl" htmlEscape="true"/>
 			<a href="${studentUrl}">Student</a>
 		</li>
	</ul>
</div>