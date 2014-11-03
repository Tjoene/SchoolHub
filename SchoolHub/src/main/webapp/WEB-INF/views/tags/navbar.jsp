<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
  <a id="start-navbar-main" href="#end-navbar-main" class="sr-only sr-only-focusable">Skip to the end of navigation menu</a>
  <!-- Brand and toggle get grouped for better mobile display -->
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">SchoolHub</a>
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
        <li><a href="<c:url value="/facts" />">Weetjes</a></li>
        <li><a href="<c:url value="/bookSales" />">BoekenVerkoop</a></li>
        <li><a href="<c:url value="/uploadForm" />">Upload bestand</a></li>
        <li><a href="<c:url value="/about" />">About</a></li>
      </ul>
    </div>
  </div>
  <a id="end-navbar-main" href="#start-navbar-main" class="sr-only sr-only-focusable">Return to the start of navigation menu</a>
</nav>