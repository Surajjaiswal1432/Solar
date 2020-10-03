<%@taglib uri="http://www.springframework.org/tags/form" prefix ="fr" %>
<%@page import="java.util.List,com.srj.Entity.*" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<html>
<head>

</head>
<body>

<hr>
<form action="SaveInfo" method="post">



 <pre>
                            
 
    Your Name                           <input type = "text" name ="name"><br>                                       
  
    Phone Number                        <input type = "text" name ="mobile"><br>                                        
   
    Email                               <input type = "email" name ="email"><br>                                        
    
    Country                             <select name="country" class="countries" id="countryId">
                                          <option value="">Select Country</option>
                                        </select><br>
    State                               <select name="state" class="states" id="stateId">
                                          <option value="">Select State</option>
                                        </select><br>
    City                                <select name="city" class="cities" id="cityId">
                                        <option value="">Select City</option >
                                        </select><br>
                                        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script> 
                                        <script src="//geodata.solutions/includes/countrystatecity.js"></script>                  
    Pin Code                            <input type = "text" name ="pc"><br>   
    
    Enter Average Monthly Electricity Bill    <input type = "text" name ="average"><br> 
                                              <input type = submit  value ="Submit">                
   
      </pre>
      </form>        
   <hr>  
              
        <br>  <a href="index.jsp">Home</a>
</body>
</html>

