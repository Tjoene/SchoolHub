<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

  <body>  
     <div class="row">     
       <div class="col-md-10">
          <div class="jumbotron">
                      <c:import url="/WEB-INF/views/tags/banner.jsp"/>
                    </div>
        </div>
        <div class="col-md-4"> 
      
          <h3> 
              ${title}
          </h3>
          ${message}
     </div>

 </body>
</html>