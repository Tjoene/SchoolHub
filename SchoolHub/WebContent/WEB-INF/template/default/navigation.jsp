<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
  <a id="start-navbar-main" href="#end-navbar-main" class="sr-only sr-only-focusable">Skip to the end of navigation menu</a>
  <!-- Brand and toggle get grouped for better mobile display -->
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">MVC-framework</a>
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-main">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="navbar-main">
      <ul class="nav navbar-nav">
        <spring:url value="/" var="homeUrl" htmlEscape="true"/>
        <li><a href="${homeUrl}">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="navbar-item-authenication">Others<span class="caret"></span></a>
          <ul class="dropdown-menu" aria-labelledby="navbar-item-authenication" role="menu">
            <spring:url value="/hello" var="helloUrl" htmlEscape="true"/>
            <li><a href="${helloUrl}">Hello</a></li>
            <spring:url value="/student" var="studentUrl" htmlEscape="true"/>
            <li><a href="${studentUrl}">Student</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
  <a id="end-navbar-main" href="#start-navbar-main" class="sr-only sr-only-focusable">Return to the start of navigation menu</a>
</nav>