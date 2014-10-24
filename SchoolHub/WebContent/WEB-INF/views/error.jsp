<html>
<head>
    <title>Spring Error Page</title>
</head>
<body>



<p>An error occured, please contact webmaster.</p>

<c:if test="${not empty error}">
   Error: ${error}
</c:if>

</body>
</html>