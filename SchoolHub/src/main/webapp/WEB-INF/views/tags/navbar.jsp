<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">                                   
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="<c:url value="/" />">SchoolHub</a>
        </div>
        <div class="navbar-collapse collapse">  
          <ul class="nav navbar-nav">
            <li><a href="<c:url value="/facts" />">Weetjes</a></li>
            <li><a href="<c:url value="/bookSales" />">BoekenVerkoop</a></li>
            <li><a href="<c:url value="/uploadForm" />">Upload bestand</a></li>
            <li><a href="<c:url value="/about" />">About</a></li>
          </ul>
        </div>   			      		 
  </div>
</div>