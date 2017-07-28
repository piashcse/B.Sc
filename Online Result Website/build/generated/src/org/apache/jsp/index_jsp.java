package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("Template Name: Academic Education V2\r\n");
      out.write("Author: <a href=\"http://www.os-templates.com/\">OS Templates</a>\r\n");
      out.write("Author URI: http://www.os-templates.com/\r\n");
      out.write("Licence: Free to use under our free template licence terms\r\n");
      out.write("Licence URI: http://www.os-templates.com/template-terms\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Dhaka International University</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("<link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"top\">\r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<div class=\"wrapper row0\">\r\n");
      out.write("  <div id=\"topbar\" class=\"clear\"> \r\n");
      out.write("    <!-- ################################################################################################ -->\r\n");
      out.write("    <nav>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("        <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("        <li><a href=\"#\">A - Z Index</a></li>\r\n");
      out.write("        <li><a href=\"#\">Student Login</a></li>\r\n");
      out.write("        <li><a href=\"#\">Staff Login</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!-- ################################################################################################ --> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<div class=\"wrapper row1\">\r\n");
      out.write("  <header id=\"header\" class=\"clear\"> \r\n");
      out.write("    <!-- ################################################################################################ -->\r\n");
      out.write("    <div id=\"logo\" class=\"fl_left\">\r\n");
      out.write("      <h1><a href=\"index.jsp\">Dhaka International University</a></h1>\r\n");
      out.write("      <p>An Excellent Centre of Education</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"fl_right\">\r\n");
      out.write("      <form class=\"clear\" method=\"post\" action=\"#\">\r\n");
      out.write("        <fieldset>\r\n");
      out.write("          <legend>Search:</legend>\r\n");
      out.write("          <input type=\"text\" value=\"\" placeholder=\"Search Here\">\r\n");
      out.write("          <button class=\"fa fa-search\" type=\"submit\" title=\"Search\"><em>Search</em></button>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- ################################################################################################ --> \r\n");
      out.write("  </header>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<div class=\"wrapper row2\">\r\n");
      out.write("  <div class=\"rounded\">\r\n");
      out.write("    <nav id=\"mainav\" class=\"clear\"> \r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("      <ul class=\"clear\">\r\n");
      out.write("        <li class=\"active\"><a href=\"index.html\">Home</a></li>\r\n");
      out.write("        <li><a class=\"drop\" href=\"#\">Pages</a>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li><a href=\"pages/gallery.html\">Gallery</a></li>\r\n");
      out.write("         \r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a class=\"drop\" href=\"#\">Dropdown</a>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li><a href=\"#\">Level 2</a></li>\r\n");
      out.write("            <li><a class=\"drop\" href=\"#\">Level 2 + Drop</a>\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li><a href=\"#\">Level 3</a></li>\r\n");
      out.write("                <li><a href=\"#\">Level 3</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"\">Search</a></li>\r\n");
      out.write("        <li><a href=\"search.jsp\">Result</a></li>\r\n");
      out.write("        <li><a href=\"#\">This a very long link</a></li>\r\n");
      out.write("        <li><a href=\"login.jsp\">login</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <!-- ################################################################################################ --> \r\n");
      out.write("    </nav>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("  <div id=\"slider\">\r\n");
      out.write("    <div id=\"slide-wrapper\" class=\"rounded clear\"> \r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("      <figure id=\"slide-1\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/a_1.jpg\" alt=\"\"></a>\r\n");
      out.write("        <figcaption>\r\n");
      out.write("          <h2>Nullamlacus dui ipsum</h2>\r\n");
      out.write("          <p>Attincidunt vel nam a maurisus lacinia consectetus magnisl sed ac morbi. Inmaurisus habitur pretium eu et ac vest penatibus id lacus parturpis.</p>\r\n");
      out.write("          <p class=\"right\"><a href=\"#\">Continue Reading &raquo;</a></p>\r\n");
      out.write("        </figcaption>\r\n");
      out.write("      </figure>\r\n");
      out.write("      <figure id=\"slide-2\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/b.jpg\" alt=\"\"></a>\r\n");
      out.write("        <figcaption>\r\n");
      out.write("          <h2>Aliquatjusto quisque nam</h2>\r\n");
      out.write("          <p>Attincidunt vel nam a maurisus lacinia consectetus magnisl sed ac morbi. Inmaurisus habitur pretium eu et ac vest penatibus id lacus parturpis.</p>\r\n");
      out.write("          <p class=\"right\"><a href=\"#\">Continue Reading &raquo;</a></p>\r\n");
      out.write("        </figcaption>\r\n");
      out.write("      </figure>\r\n");
      out.write("      <figure id=\"slide-3\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/3.png\" alt=\"\"></a>\r\n");
      out.write("        <figcaption>\r\n");
      out.write("          <h2>Aliquatjusto quisque nam</h2>\r\n");
      out.write("          <p>Attincidunt vel nam a maurisus lacinia consectetus magnisl sed ac morbi. Inmaurisus habitur pretium eu et ac vest penatibus id lacus parturpis.</p>\r\n");
      out.write("          <p class=\"right\"><a href=\"#\">Continue Reading &raquo;</a></p>\r\n");
      out.write("        </figcaption>\r\n");
      out.write("      </figure>\r\n");
      out.write("      <figure id=\"slide-4\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/b.jpg\" alt=\"\"></a>\r\n");
      out.write("        <figcaption>\r\n");
      out.write("          <h2>Aliquatjusto quisque nam</h2>\r\n");
      out.write("          <p>Attincidunt vel nam a maurisus lacinia consectetus magnisl sed ac morbi. Inmaurisus habitur pretium eu et ac vest penatibus id lacus parturpis.</p>\r\n");
      out.write("          <p class=\"right\"><a href=\"#\">Continue Reading &raquo;</a></p>\r\n");
      out.write("        </figcaption>\r\n");
      out.write("      </figure>\r\n");
      out.write("      <figure id=\"slide-5\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/5.png\" alt=\"\"></a>\r\n");
      out.write("        <figcaption>\r\n");
      out.write("          <h2>Dapiensociis temper donec</h2>\r\n");
      out.write("          <p>Attincidunt vel nam a maurisus lacinia consectetus magnisl sed ac morbi. Inmaurisus habitur pretium eu et ac vest penatibus id lacus parturpis.</p>\r\n");
      out.write("          <p class=\"right\"><a href=\"#\">Continue Reading &raquo;</a></p>\r\n");
      out.write("        </figcaption>\r\n");
      out.write("      </figure>\r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("      <ul id=\"slide-tabs\">\r\n");
      out.write("        <li><a href=\"#slide-1\">All About The University</a></li>\r\n");
      out.write("        <li><a href=\"#slide-2\">Why You Should Study With Us</a></li>\r\n");
      out.write("        <li><a href=\"#slide-3\">Education And Student Experience</a></li>\r\n");
      out.write("        <li><a href=\"#slide-4\">Alumni And Its Donors</a></li>\r\n");
      out.write("        <li><a href=\"#slide-5\">Latest University News &amp; Events</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <!-- ################################################################################################ --> \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<div class=\"wrapper row3\">\r\n");
      out.write("  <div class=\"rounded\">\r\n");
      out.write("    <main class=\"container clear\"> \r\n");
      out.write("      <!-- main body --> \r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("      <div class=\"group btmspace-30\"> \r\n");
      out.write("        <!-- Left Column -->\r\n");
      out.write("        <div class=\"one_quarter first\"> \r\n");
      out.write("          <!-- ################################################################################################ -->\r\n");
      out.write("          <ul class=\"nospace\">\r\n");
      out.write("            <li class=\"btmspace-15\"><a href=\"#\"><em class=\"heading\">Prospective Students</em> <img class=\"borderedbox\" src=\"images/demo/220x95.gif\" alt=\"\"></a></li>\r\n");
      out.write("            <li class=\"btmspace-15\"><a href=\"#\"><em class=\"heading\">Current Students</em> <img class=\"borderedbox\" src=\"images/demo/220x95.gif\" alt=\"\"></a></li>\r\n");
      out.write("            <li class=\"btmspace-15\"><a href=\"#\"><em class=\"heading\">International Students</em> <img class=\"borderedbox\" src=\"images/demo/220x95.gif\" alt=\"\"></a></li>\r\n");
      out.write("            <li><a href=\"#\"><em class=\"heading\">Alumni</em> <img class=\"borderedbox\" src=\"images/demo/220x95.gif\" alt=\"\"></a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <!-- ################################################################################################ --> \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- / Left Column --> \r\n");
      out.write("        <!-- Middle Column -->\r\n");
      out.write("        <div class=\"one_half\"> \r\n");
      out.write("          <!-- ################################################################################################ -->\r\n");
      out.write("          <h2>Latest News &amp; Events</h2>\r\n");
      out.write("          <ul class=\"nospace listing\">\r\n");
      out.write("            <li class=\"clear\">\r\n");
      out.write("              <div class=\"imgl borderedbox\"><img src=\"images/demo/120x120.gif\" alt=\"\"></div>\r\n");
      out.write("              <p class=\"nospace btmspace-15\"><a href=\"#\">Sentumquisque morbi dui congue.</a></p>\r\n");
      out.write("              <p>This is a W3C compliant free website template from <a href=\"http://www.os-templates.com/\" title=\"Free Website Templates\">OS Templates</a>. This template is distributed using a <a href=\"http://www.os-templates.com/template-terms\">Website Template Licence</a></p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"clear\">\r\n");
      out.write("              <div class=\"imgl borderedbox\"><img src=\"images/demo/120x120.gif\" alt=\"\"></div>\r\n");
      out.write("              <p class=\"nospace btmspace-15\"><a href=\"#\">Sentumquisque morbi dui congue.</a></p>\r\n");
      out.write("              <p>You can use and modify the template for both personal and commercial use. You must keep all copyright information and credit links in the template and associated files.</p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"clear\">\r\n");
      out.write("              <div class=\"imgl borderedbox\"><img src=\"images/demo/120x120.gif\" alt=\"\"></div>\r\n");
      out.write("              <p class=\"nospace btmspace-15\"><a href=\"#\">Sentumquisque morbi dui congue.</a></p>\r\n");
      out.write("              <p>For more CSS templates visit <a href=\"http://www.os-templates.com/\">Free Website Templates</a>. Attincidunt vel nam a maurisus lacinia consectetus magnisl sed ac morbi. Inmaurisus habitur pretium eu et ac vest penatibus id lacus parturpis.</p>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <p class=\"right\"><a href=\"#\">Click here to view all of the latest news and events &raquo;</a></p>\r\n");
      out.write("          <!-- ################################################################################################ --> \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- / Middle Column --> \r\n");
      out.write("        <!-- Right Column -->\r\n");
      out.write("        <div class=\"one_quarter sidebar\"> \r\n");
      out.write("          <!-- ################################################################################################ -->\r\n");
      out.write("          <div class=\"sdb_holder\">\r\n");
      out.write("            <h6>Virtual Tour</h6>\r\n");
      out.write("            <div class=\"mediacontainer\"><img src=\"images/demo/video.gif\" alt=\"\">\r\n");
      out.write("              <p><a href=\"#\">View More Tour Videos Here</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"sdb_holder\">\r\n");
      out.write("            <h6>Quick Information</h6>\r\n");
      out.write("            <ul class=\"nospace quickinfo\">\r\n");
      out.write("              <li class=\"clear\"><a href=\"#\"><img src=\"images/demo/80x80.gif\" alt=\"\"> Make An Application</a></li>\r\n");
      out.write("              <li class=\"clear\"><a href=\"#\"><img src=\"images/demo/80x80.gif\" alt=\"\"> Order A Prospectus</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- ################################################################################################ --> \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- / Right Column --> \r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- ################################################################################################ --> \r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("      <div id=\"twitter\" class=\"group btmspace-30\">\r\n");
      out.write("        <div class=\"one_quarter first center\"><a href=\"#\"><i class=\"fa fa-twitter fa-3x\"></i><br>\r\n");
      out.write("          Follow Us On Twitter</a></div>\r\n");
      out.write("        <div class=\"three_quarter bold\">\r\n");
      out.write("          <p>Inteligula congue id elis donec sce sagittis intes id laoreet aenean. Massawisi condisse leo sem ac tincidunt nibh quis dui fauctor et donecnibh elis velit <a href=\"#\">@name</a> - 10:15 AM yesterday</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- ################################################################################################ --> \r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("      <div class=\"group\">\r\n");
      out.write("        <h2>Quickly Find What You Are Looking For</h2>\r\n");
      out.write("        <div class=\"one_quarter first\"> \r\n");
      out.write("          <!-- ################################################################################################ -->\r\n");
      out.write("          <ul class=\"nospace\">\r\n");
      out.write("            <li><a href=\"#\">Academic Advisory</a></li>\r\n");
      out.write("            <li><a href=\"#\">Academic Assistance</a></li>\r\n");
      out.write("            <li><a href=\"#\">Academic Calendars</a></li>\r\n");
      out.write("            <li><a href=\"#\">Academics Office</a></li>\r\n");
      out.write("            <li><a href=\"#\">Administration</a></li>\r\n");
      out.write("            <li><a href=\"#\">Adult Learners</a></li>\r\n");
      out.write("            <li><a href=\"#\">Alumni Chapters</a></li>\r\n");
      out.write("            <li><a href=\"#\">Alumni Events</a></li>\r\n");
      out.write("            <li><a href=\"#\">Athletics</a></li>\r\n");
      out.write("            <li><a href=\"#\">Campus Life At a Glance</a></li>\r\n");
      out.write("            <li><a href=\"#\">Campus Recreation</a></li>\r\n");
      out.write("            <li><a href=\"#\">Campus Safety &amp; Security</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <!-- ################################################################################################ --> \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"one_quarter\"> \r\n");
      out.write("          <!-- ################################################################################################ -->\r\n");
      out.write("          <ul class=\"nospace\">\r\n");
      out.write("            <li><a href=\"#\">Class Schedules</a></li>\r\n");
      out.write("            <li><a href=\"#\">Counselling Center</a></li>\r\n");
      out.write("            <li><a href=\"#\">Course Descriptions &amp; Catalogue</a></li>\r\n");
      out.write("            <li><a href=\"#\">Department Directory</a></li>\r\n");
      out.write("            <li><a href=\"#\">Departments &amp; Programs</a></li>\r\n");
      out.write("            <li><a href=\"#\">Fellowships</a></li>\r\n");
      out.write("            <li><a href=\"#\">Finals Schedules</a></li>\r\n");
      out.write("            <li><a href=\"#\">Financial Aid</a></li>\r\n");
      out.write("            <li><a href=\"#\">Fitness and Recreation Facilities</a></li>\r\n");
      out.write("            <li><a href=\"#\">Global Learning</a></li>\r\n");
      out.write("            <li><a href=\"#\">Graduate</a></li>\r\n");
      out.write("            <li><a href=\"#\">Graduate Admissions</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <!-- ################################################################################################ --> \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"one_quarter\"> \r\n");
      out.write("          <!-- ################################################################################################ -->\r\n");
      out.write("          <ul class=\"nospace\">\r\n");
      out.write("            <li><a href=\"#\">Graduate Health Services</a></li>\r\n");
      out.write("            <li><a href=\"#\">Graduate Housing</a></li>\r\n");
      out.write("            <li><a href=\"#\">Graduate Programs</a></li>\r\n");
      out.write("            <li><a href=\"#\">Graduate Student Association</a></li>\r\n");
      out.write("            <li><a href=\"#\">Graduate Studies</a></li>\r\n");
      out.write("            <li><a href=\"#\">Honours Program</a></li>\r\n");
      out.write("            <li><a href=\"#\">Interactive Schedule</a></li>\r\n");
      out.write("            <li><a href=\"#\">International Programs</a></li>\r\n");
      out.write("            <li><a href=\"#\">International Students</a></li>\r\n");
      out.write("            <li><a href=\"#\">Intramural Sports</a></li>\r\n");
      out.write("            <li><a href=\"#\">Language Resources</a></li>\r\n");
      out.write("            <li><a href=\"#\">Maps and Directions</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <!-- ################################################################################################ --> \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"one_quarter\"> \r\n");
      out.write("          <!-- ################################################################################################ -->\r\n");
      out.write("          <ul class=\"nospace\">\r\n");
      out.write("            <li><a href=\"#\">Office of the Registrar</a></li>\r\n");
      out.write("            <li><a href=\"#\">Online Learning</a></li>\r\n");
      out.write("            <li><a href=\"#\">Parent Information</a></li>\r\n");
      out.write("            <li><a href=\"#\">Residence Life</a></li>\r\n");
      out.write("            <li><a href=\"#\">Residential Colleges</a></li>\r\n");
      out.write("            <li><a href=\"#\">Schools and Colleges</a></li>\r\n");
      out.write("            <li><a href=\"#\">Student Activities</a></li>\r\n");
      out.write("            <li><a href=\"#\">Student Affairs</a></li>\r\n");
      out.write("            <li><a href=\"#\">Student Development</a></li>\r\n");
      out.write("            <li><a href=\"#\">Student Financial Services</a></li>\r\n");
      out.write("            <li><a href=\"#\">Student Group Directory</a></li>\r\n");
      out.write("            <li><a href=\"#\">Student Life</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <!-- ################################################################################################ --> \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- ################################################################################################ --> \r\n");
      out.write("      <!-- / main body -->\r\n");
      out.write("      <div class=\"clear\"></div>\r\n");
      out.write("    </main>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<div class=\"wrapper row4\">\r\n");
      out.write("  <div class=\"rounded\">\r\n");
      out.write("    <footer id=\"footer\" class=\"clear\"> \r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("      <div class=\"one_third first\">\r\n");
      out.write("        <figure class=\"center\"><img class=\"btmspace-15\" src=\"images/demo/worldmap.png\" alt=\"\">\r\n");
      out.write("          <figcaption><a href=\"#\">Find Us With Google Maps &raquo;</a></figcaption>\r\n");
      out.write("        </figure>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"one_third\">\r\n");
      out.write("        <address>\r\n");
      out.write("        Long Educational Facility Name<br>\r\n");
      out.write("        Address Line 2<br>\r\n");
      out.write("        Town/City<br>\r\n");
      out.write("        Postcode/Zip<br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <i class=\"fa fa-phone pright-10\"></i> xxxx xxxx xxxxxx<br>\r\n");
      out.write("        <i class=\"fa fa-envelope-o pright-10\"></i> <a href=\"#\">contact@domain.com</a>\r\n");
      out.write("        </address>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"one_third\">\r\n");
      out.write("        <p class=\"nospace btmspace-10\">Stay Up to Date With What's Happening</p>\r\n");
      out.write("        <ul class=\"faico clear\">\r\n");
      out.write("          <li><a class=\"faicon-twitter\" href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("          <li><a class=\"faicon-linkedin\" href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("          <li><a class=\"faicon-facebook\" href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("          <li><a class=\"faicon-flickr\" href=\"#\"><i class=\"fa fa-flickr\"></i></a></li>\r\n");
      out.write("          <li><a class=\"faicon-rss\" href=\"#\"><i class=\"fa fa-rss\"></i></a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <form class=\"clear\" method=\"post\" action=\"#\">\r\n");
      out.write("          <fieldset>\r\n");
      out.write("            <legend>Subscribe To Our Newsletter:</legend>\r\n");
      out.write("            <input type=\"text\" value=\"\" placeholder=\"Enter Email Here&hellip;\">\r\n");
      out.write("            <button class=\"fa fa-sign-in\" type=\"submit\" title=\"Sign Up\"><em>Sign Up</em></button>\r\n");
      out.write("          </fieldset>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- ################################################################################################ --> \r\n");
      out.write("    </footer>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<div class=\"wrapper row5\">\r\n");
      out.write("  <div id=\"copyright\" class=\"clear\"> \r\n");
      out.write("    <!-- ################################################################################################ -->\r\n");
      out.write("    <p class=\"fl_left\">Copyright &copy; 2014 - All Rights Reserved - <a href=\"#\">Domain Name</a></p>\r\n");
      out.write("    <p class=\"fl_right\">Template by <a target=\"_blank\" href=\"http://www.os-templates.com/\" title=\"Free Website Templates\">OS Templates</a></p>\r\n");
      out.write("    <!-- ################################################################################################ --> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- JAVASCRIPTS --> \r\n");
      out.write("<script src=\"layout/scripts/jquery.min.js\"></script> \r\n");
      out.write("<script src=\"layout/scripts/jquery.fitvids.min.js\"></script> \r\n");
      out.write("<script src=\"layout/scripts/jquery.mobilemenu.js\"></script> \r\n");
      out.write("<script src=\"layout/scripts/tabslet/jquery.tabslet.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
