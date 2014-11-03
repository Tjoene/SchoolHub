<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>SchoolHub</title>

  <meta charset="utf-8">
  <meta name="author" content="">
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta name="generator" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <link rel="shortcut icon" href="<c:url value="/resources/img/favicon.png" />" type="image/ico">

  <!-- CSS Style and Files -->
  <style type="text/css">
    html {position: relative; min-height: 100%;}
    body {padding-top: 70px; margin-bottom: 70px;}
    footer {position: absolute; bottom: 0; width: 100%; height: 70px;}
  </style>

  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />">
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap-theme.min.css" />">
  <!-- End CSS -->

  <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
  <!--[if lt IE 9]>
    <script charset="UTF-8" src="<c:url value="/resources/js/html5shiv-printshiv.min.js" />"></script>
    <script charset="UTF-8" src="<c:url value="/resources/js/respond.min.js" />"></script>
  <![endif]-->
</head>

<body>
  <!-- Detection -->
  <noscript>
    <div class="container">
      <div class="alert alert-dismissable alert-danger fade in">
        <strong>WARNING:</strong><br>
        Javascript seems to be disabled on your browser.<br>
        This site may possibly not function properly, because some parts requirements JavaScript to work.<br>
        Please enable JavaScript or upgrade to a Javascript-capable browser to use this site!
      </div>
    </div>
  </noscript>

  <!--[if lte IE 7]>
  <div class="alert alert-dismissable alert-danger fade in">
    <strong>WARNING:</strong> You are using an <strong>outdated</strong> Internet Explorer browser!<br>
    Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience and security.<br>
  </div>
  <![endif]-->
  <!-- End Detection -->

  <!-- Navigation -->
  <c:import url="/WEB-INF/views/tags/navbar.jsp"/>
  <!-- End Navigation -->

  <!-- Header -->
  <c:import url="/WEB-INF/views/tags/header.jsp"/>
  <!-- End Header -->

  <!-- Body -->
  <main class="container" role="main">
    <decorator:body />
  </main>
  <!-- End Body -->

  <br>
  <!-- Footer -->
  <footer role="contentinfo">
    <c:import url="/WEB-INF/views/tags/footer.jsp"/>
  </footer>
  <!-- End Footer -->

  <!-- JavaScript -->
  <script charset="UTF-8" src="<c:url value="/resources/js/jquery.min.js" />"></script>
  <script charset="UTF-8" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
  <!-- End JavaScript -->
</body>
</html>