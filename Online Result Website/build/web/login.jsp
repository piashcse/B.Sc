<%-- 
    Document   : mes_chirman
    Created on : Aug 15, 2015, 11:10:24 PM
    Author     : JOHIR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<title>Dhaka International University</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

 

<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
<link rel="icon"  href="logo.png" />
<style>
#ime{
    float: right; margin-right:20px;
 
}
.style1 {color: #000000}



</style>


</head>

<body id="top">
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row0">
  <div id="topbar" class="clear"> 
    <!-- ################################################################################################ -->
    <nav>
      <ul>
        <li><a href="index.jsp">Home</a></li>
        <li><a href="#">Contact Us</a></li>
        <li><a href="#">A - Z Index</a></li>
        <li><a href="stu_res">Student Login</a></li>
        <li><a href="login.jsp">Staff Login</a></li>
      </ul>
    </nav>
    <!-- ################################################################################################ --> 
  </div>
</div>
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row1">
  <header id="header" class="clear"> 
    <!-- ################################################################################################ -->
    <div id="logo" class="fl_left">
      <h1><a href="index.jsp">Dhaka Interantional University</a></h1>
      <p>An Excellent Centre of Education</p>
    </div>
    <div class="fl_right">
      <form class="clear" method="post" action="#">
        <fieldset>
          <legend>Search:</legend>
          <input type="text" value="" placeholder="Search Here">
          <button class="fa fa-search" type="submit" title="Search"><em>Search</em></button>
        </fieldset>
      </form>
    </div>
    <!-- ################################################################################################ --> 
  </header>
</div>
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row2">
  <div class="rounded">
    <nav id="mainav" class="clear"> 
      <!-- ################################################################################################ -->
      <ul class="clear">
        <li class="active"><a href="index.jsp">Home</a></li>
        <li><a class="drop" href="#">About OF Prime Unversity</a>
          <ul>
            <li><a href="">Message from  Chairman</a></li>
            <li><a href="">Message from Vice Chancellor</a></li>
            <li><a href="">Former Vice Chancellor</a></li>
            <li><a href="">Introduction</a></li>
            <li><a href="">The Campus</a></li>
            <li><a href="">Mission</a></li>
            <li><a href="">Vision</a></li>
          </ul>
        </li>
        <li><a class="drop" href="#">Academic Programs</a>
          <ul>
            <li><a href="#">Faculty of Engineering</a></li>
                <li><a href="#">Faculty of Business Studies</a></li>
                <li><a href="#">Faculty of LAW</a></li>
				<li><a href="#">Faculty of Arts $ Social Science</a></li>
              
            </li>
          </ul>
        </li>
       
        <li><a href="#">Admission</a></li>
        <li><a href="web_mail.html">Web Mail</a></li>
        <li><a href="#">About Prime</a></li>
      </ul>
      <!-- ################################################################################################ --> 
    </nav>
  </div>
</div>
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 



<!-- ################################################################################################ -->

<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row3">
  <div class="rounded">
    <main class="container clear"> 
      <!-- main body --> 
      <!-- ################################################################################################ -->
    
       
          <!-- ################################################################################################ -->
 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->

<span class="style1">
 <br><br><br>
 
  <center>
            <h1>Login</h1>
    <form action="Login_ser" method="Get">  
        
          <table>
                <tr>
    <td> Name: <input type="text" name="name"> </td> 
                
                <tr/>
                <tr>
    <td> Password: <input type="password" name="pass"> </td>
    </tr>
    <tr>
     <td><input type="submit" value="login">   <td>
    </tr>
          </table>
      
           <%
            String dd= (String) request.getAttribute("login_show");
if (null == dd) {
    
}else{%>

<span class="style1"><% out.print(dd);%> </span>

        <%}
%>
<br><br><br>
    </form>
    </center>
</div>   

 <br><br><br>	
 <br><br><br>	
 <br><br><br>	   
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->

  
      <!-- ################################################################################################ --> 
      <!-- / main body -->
      <div class="clear"></div>
    </main>
  </div>
</div>
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row4">
  <div class="rounded">
    <footer id="footer" class="clear"> 
      <!-- ################################################################################################ -->
      <div class="one_third first">
        <figure class="center"><img class="btmspace-15" src="images/demo/worldmap.png" alt="">
          <figcaption><a href="https://www.google.com.bd/maps/dir/''/prime+university+google+map/@23.7988352,90.3435672,14.25z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3755c0e8ff9d1d0b:0xa1e57123d915fbc5!2m2!1d90.3536916!2d23.795929">Find Us With Google Maps &raquo;</a></figcaption>
        </figure>
      </div>
      <div class="one_third">
        <address>
        2A/1, North East of Darus Salam Road,<br>
        Mirpur     <br>
        Dhaka 1216, Bangladesh.
     
        <br>
        <i class="fa fa-phone pright-10"></i>01687-191986, 01939-425030, 01776-234984, 01712-675595<br>
        <i class="fa fa-envelope-o pright-10"></i> <a href="#">info@primeuniversity.edu.bd</a>
        </address>
      </div>
      <div class="one_third">
        <p class="nospace btmspace-10">Stay Up to Date With What's Happening</p>
        <ul class="faico clear">
          <li><a class="faicon-twitter" href="#"><i class="fa fa-twitter"></i></a></li>
          <li><a class="faicon-linkedin" href="#"><i class="fa fa-linkedin"></i></a></li>
          <li><a class="faicon-facebook" href="#"><i class="fa fa-facebook"></i></a></li>
          <li><a class="faicon-flickr" href="#"><i class="fa fa-flickr"></i></a></li>
          <li><a class="faicon-rss" href="#"><i class="fa fa-rss"></i></a></li>
        </ul>
        <form class="clear" method="post" action="#">
          <fieldset>
            <legend>Subscribe To Our Newsletter:</legend>
            <input type="text" value="" placeholder="Enter Email Here&hellip;">
            <button class="fa fa-sign-in" type="submit" title="Sign Up"><em>Sign Up</em></button>
          </fieldset>
        </form>
      </div>
      <!-- ################################################################################################ --> 
    </footer>
  </div>
</div>


 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row5">
  <div id="copyright" class="clear"> 
    <!-- ################################################################################################ -->
    <p class="fl_left">Copyright &copy; 2015 - All Rights Reserved - <a href="#">Prime Unversity</a></p>
  
    <!-- ################################################################################################ --> 
  </div>
</div>
<div id="ime"> 
<!-- ################################################################################################ --> 

 <a href="#" onClick="scrollWindow()" value="Scroll">
<img src="arrow1.png" alt=""></a>
 </div>
 <!-- ################################################################################################ --> 
 
    


<!-- JAVASCRIPTS --> 
<script>
function scrollWindow() {
    window.scrollTo(-2000,-2000);
}
</script>
<script src="layout/scripts/jquery.min.js"></script> 
<script src="layout/scripts/jquery.fitvids.min.js"></script> 
<script src="layout/scripts/jquery.mobilemenu.js"></script> 
<script src="layout/scripts/tabslet/jquery.tabslet.min.js"></script>




</body>
</html>