<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%><!DOCTYPE html>
<html lang="en">
<head>
  <title>SchoolHub</title>

  <meta charset="utf-8">
  <meta name="author" content="">
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta name="generator" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <link rel="shortcut icon" href="/resources/img/favicon.png" type="image/ico">

  <!-- CSS Style and Files -->
  <style type="text/css">
    body{padding-top: 70px;padding-bottom: 20px;}
  </style>

  <link rel="stylesheet" type="text/css" href="/resources/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="/resources/css/bootstrap-theme.min.css">
  <!-- End CSS -->

  <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
  <!--[if lt IE 9]>
    <script charset="UTF-8" src="/resources/js/html5shiv-printshiv.min.js"></script>
    <script charset="UTF-8" src="/resources/js/respond.min.js"></script>
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
  <tiles:insertAttribute name="navigation" />
  <!-- End Navigation -->

  <!-- Header -->
  <tiles:insertAttribute name="header" />
  <!-- End Header -->

  <!-- Body -->
  <main class="container" role="main">
    <tiles:insertAttribute name="body" />
  </main>
  <!-- End Body -->

  <br>
  <!-- Footer -->
  <footer role="contentinfo">
    <tiles:insertAttribute name="footer" />
  </footer>
  <!-- End Footer -->

  <!-- JavaScript -->
  <script charset="UTF-8" src="/resources/js/jquery.min.js"></script>
  <script charset="UTF-8" src="/resources/js/bootstrap.min.js"></script>
  <!-- End JavaScript -->
</body>
</html>