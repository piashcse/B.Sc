<!DOCTYPE html>
<!--
Template Name: Academic Education V2
Author: <a href="http://www.os-templates.com/">OS Templates</a>
Author URI: http://www.os-templates.com/
Licence: Free to use under our free template licence terms
Licence URI: http://www.os-templates.com/template-terms

-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Dhaka International University</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
<link href="css/bootstrap.min.css" rel="stylesheet">
<style> .style {color: #5cb85c;}</style>
</head>
<body id="top" style="background:#06213F">
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
        <li><a href="#">Student Login</a></li>
        <li><a href="#">Staff Login</a></li>
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
      <h1><a href="index.jsp">Dhaka International University</a></h1>
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
        <li><a class="drop" href="#">Pages</a>
          <ul>
            <li><a href="pages/gallery.html">Gallery</a></li>
            <li><a href="pages/portfolio.html">Portfolio</a></li>
            <li><a href="pages/full-width.html">Full Width</a></li>
            <li><a href="pages/sidebar-left.html">Sidebar Left</a></li>
            <li><a href="pages/sidebar-left-2.html">Sidebar Left 2</a></li>
            <li><a href="pages/sidebar-right.html">Sidebar Right</a></li>
            <li><a href="pages/sidebar-right-2.html">Sidebar Right 2</a></li>
            <li><a href="pages/basic-grid.html">Basic Grid</a></li>
          </ul>
        </li>
        <li><a class="drop" href="#">Dropdown</a>
          <ul>
            <li><a href="#">Level 2</a></li>
            <li><a class="drop" href="#">Level 2 + Drop</a>
              <ul>
                <li><a href="#">Level 3</a></li>
                <li><a href="#">Level 3</a></li>
              </ul>
            </li>
          </ul>
        </li>
        <li><a href="#">Link Text</a></li>
        <li><a href="result.html">Result</a></li>
        <li><a href="#">This a very long link</a></li>
        <li><a href="#">This is the last</a></li>
      </ul>
      <!-- ################################################################################################ --> 
    </nav>
  </div>
</div>
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper">
  <div style="border:1px solid black;padding:100px;margin-top:30px;background:#fff">  
    
      <%
            String d1= (String) request.getAttribute("data1");
             String d2= (String) request.getAttribute("data2");
              String d3= (String) request.getAttribute("data3");
               String d4= (String) request.getAttribute("data4");
                String d5= (String) request.getAttribute("data5");
if (null == d1) {
    
}else{%>


<table border="2">
    <thead>
        <tr>
            <th>Name</th>
            <th> Data</th>
        </tr>
    </thead>
    <tbody>
         <tr>
            <th>Roll</th>
            <th><% out.print(d1);%> </th>
        </tr>
        <tr>
            <td>Name</td>
            <td><% out.print(d2);%> </td>
        </tr>
        <tr>
            <td>Batch</td>
            <td><% out.print(d3);%></td>
        </tr
        <tr>
            <td>Shift</td>
            <td><% out.print(d4);%> </td>
        </tr>
        <tr>
            <td>GPA</td>
            <td><% out.print(d5);%> </td>
        </tr>
       
    </tbody>
</table>
        <%}
%>
      </div>
      <!-- ################################################################################################ --> 
    
  </div>
</div>
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row5">
  <div id="copyright" class="clear"> 
    <!-- ################################################################################################ -->
    <p class="fl_left">Copyright &copy; 2014 - All Rights Reserved - <a href="#">Domain Name</a></p>
    <p class="fl_right">Template by <a target="_blank" href="http://www.os-templates.com/" title="Free Website Templates">OS Templates</a></p>
    <!-- ################################################################################################ --> 
  </div>
</div>
<!-- JAVASCRIPTS --> 
<script src="layout/scripts/jquery.min.js"></script> 
<script src="layout/scripts/jquery.fitvids.min.js"></script> 
<script src="layout/scripts/jquery.mobilemenu.js"></script> 
<script src="layout/scripts/tabslet/jquery.tabslet.min.js"></script>
</body>
</html>