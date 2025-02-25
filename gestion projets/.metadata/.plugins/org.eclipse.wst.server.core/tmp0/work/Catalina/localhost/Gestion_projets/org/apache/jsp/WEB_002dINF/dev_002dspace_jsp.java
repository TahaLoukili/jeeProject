/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.95
 * Generated at: 2023-12-16 22:01:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.Tache;
import Models.Dev;
import Models.Service;
import Models.Projet;
import java.util.List;

public final class dev_002dspace_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Models.Service");
    _jspx_imports_classes.add("Models.Projet");
    _jspx_imports_classes.add("Models.Dev");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Models.Tache");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Developer space</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- <div id=\"dev-space\"></div> -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("<ul class=\"bg-white shadow overflow-hidden sm:rounded-md max-w-full mx-auto mt-16 p-4\" style=\"width: 900px;\">\r\n");
      out.write("    ");

    List<Projet> devProjects = (List<Projet>) session.getAttribute("devProjects");
    List<Service> projectServices = (List<Service>) session.getAttribute("projectServices");
    Dev dev = (Dev) session.getAttribute("dev");
    
    Integer clickedProjectId=(Integer)request.getAttribute("clickedProjectId");
    
    if (devProjects != null) {
        for(Projet project : devProjects) {
	
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("                <div class=\"px-4 py-5 sm:px-6 mb-3\">\r\n");
      out.write("                    <div class=\"flex items-center justify-between\">\r\n");
      out.write("                        <h3 class=\"text-lg leading-6 font-medium text-gray-900\">");
      out.print( project.getNom() );
      out.write("</h3>\r\n");
      out.write("                        <p class=\"mt-1 max-w-2xl text-sm text-gray-500\">");
      out.print( project.getDescription() );
      out.write("</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mt-4 flex items-center justify-between\">\r\n");
      out.write("                    <div class=\"grid-row\">\r\n");
      out.write("                        <p class=\"text-sm font-medium text-gray-500\">Date démarrage: <div class=\"text-green-500 text-sm\">");
      out.print( project.getDateDemarage() );
      out.write("</div></p>\r\n");
      out.write("                        <p class=\"text-sm font-medium text-gray-500\">Date livraison: <div class=\"text-green-500 text-sm\">");
      out.print( project.getDateLivraison() );
      out.write("</div></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("	                    ");
      out.write("\r\n");
      out.write("		                    ");
      out.write("\r\n");
      out.write("		                    ");
      out.write("\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					<!-- ***********consulter servicce*********************************** -->\r\n");
      out.write("					<form action=\"devServlet\" method=\"post\">\r\n");
      out.write("	                   \r\n");
      out.write("	                    ");
      out.write("\r\n");
      out.write("	                    \r\n");
      out.write("	                    <input type=\"hidden\" value=\"");
      out.print( project.getId() );
      out.write("\" name=\"idProjet\">\r\n");
      out.write("	                    <input type=\"hidden\" value=\"");
      out.print( dev.getId() );
      out.write("\" name=\"idDev\">\r\n");
      out.write("	                    <input type=\"hidden\" value=\"");
      out.print( dev.getUsername() );
      out.write("\" name=\"usernameDev\">\r\n");
      out.write("	                    <input type=\"submit\" class=\"bg-black text-white rounded-md p-1 hover:bg-gray-700\" value=\"Services\" name=\"consulterServices\"/>\r\n");
      out.write("	                   \r\n");
      out.write("	                    </a></div>\r\n");
      out.write("					</form>\r\n");
      out.write("		                    \r\n");
      out.write("                    </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("                        \r\n");
      out.write("            ");

            	if(projectServices != null  && clickedProjectId !=null && clickedProjectId == project.getId() ){            		
            	for(Service service : projectServices){
            		//List<Tache> serviceTaches = (List<Tache>) session.getAttribute("serviceTaches");
            		if(clickedProjectId == project.getId()){
            		
      out.write("\r\n");
      out.write("            		\r\n");
      out.write("             		<div class=\"bg-black text-white rounded-md p-1 mb-2\">");
      out.print(service.getDescription() );
      out.write("</div>\r\n");
      out.write("					\r\n");
      out.write("					");
 
					
					
					for(Tache tache : service.getTaches()){
						
						if(tache.getIdDev() == dev.getId() && tache.getIdService() == service.getId()){
						
      out.write("\r\n");
      out.write("					\r\n");
      out.write("					<form action=\"devServlet\" method=\"post\">\r\n");
      out.write("					<div class=\"flex items-center space-x-4 mt-2 mb-2\">\r\n");
      out.write("					  <button class=\"bg-white border border-black rounded-md px-4 py-2\" value=\"");
      out.print( tache.getNom() );
      out.write("\">\r\n");
      out.write("					    ");
      out.print(tache.getNom() );
      out.write("\r\n");
      out.write("					  </button>\r\n");
      out.write("					  \r\n");
      out.write("					  <input type=\"hidden\" name=\"tacheId\" value=\"");
      out.print( tache.getId() );
      out.write("\" />\r\n");
      out.write("					  \r\n");
      out.write("					  ");
if(tache.getAvancement() == 100){ 
      out.write("\r\n");
      out.write("					  	<div class=\"bg-green-500 rounded-md text-white p-1\">Finished</div>\r\n");
      out.write("					  ");
}else{ 
      out.write("\r\n");
      out.write("					  <select class=\"border border-black rounded-md px-2 py-1\"  name=\"percentAvancement\">\r\n");
      out.write("					  ");
if(tache.getAvancement() == 0){ 
      out.write("\r\n");
      out.write("					    <option ");
if(tache.getAvancement() == 0){ 
      out.write(" selected ");
} 
      out.write(" value=\"0\">0%</option>\r\n");
      out.write("					    <option ");
if(tache.getAvancement() == 25){ 
      out.write(" selected ");
} 
      out.write(" value=\"25\">25%</option>\r\n");
      out.write("					    <option ");
if(tache.getAvancement() == 50){ 
      out.write(" selected ");
} 
      out.write(" value=\"50\">50%</option>\r\n");
      out.write("					    <option ");
if(tache.getAvancement() == 75){ 
      out.write(" selected ");
} 
      out.write(" value=\"75\">75%</option>\r\n");
      out.write("					    <option ");
if(tache.getAvancement() == 100){ 
      out.write(" selected ");
} 
      out.write(" value=\"100\">100%</option>					  \r\n");
      out.write("					  ");
}else if(tache.getAvancement() == 25){ 
      out.write("\r\n");
      out.write("					  <option ");
if(tache.getAvancement() == 25){ 
      out.write(" selected ");
} 
      out.write(" value=\"25\">25%</option>\r\n");
      out.write("					    <option ");
if(tache.getAvancement() == 50){ 
      out.write(" selected ");
} 
      out.write(" value=\"50\">50%</option>\r\n");
      out.write("					    <option ");
if(tache.getAvancement() == 75){ 
      out.write(" selected ");
} 
      out.write(" value=\"75\">75%</option>\r\n");
      out.write("					    <option ");
if(tache.getAvancement() == 100){ 
      out.write(" selected ");
} 
      out.write(" value=\"100\">100%</option>\r\n");
      out.write("					  ");
}else if(tache.getAvancement() == 50){ 
      out.write("\r\n");
      out.write("					  	<option ");
if(tache.getAvancement() == 50){ 
      out.write(" selected ");
} 
      out.write(" value=\"50\">50%</option>\r\n");
      out.write("					    <option ");
if(tache.getAvancement() == 75){ 
      out.write(" selected ");
} 
      out.write(" value=\"75\">75%</option>\r\n");
      out.write("					    <option ");
if(tache.getAvancement() == 100){ 
      out.write(" selected ");
} 
      out.write(" value=\"100\">100%</option>\r\n");
      out.write("					  ");
}else if(tache.getAvancement() == 75){ 
      out.write("\r\n");
      out.write("					  	<option ");
if(tache.getAvancement() == 75){ 
      out.write(" selected ");
} 
      out.write(" value=\"75\">75%</option>\r\n");
      out.write("					    <option ");
if(tache.getAvancement() == 100){ 
      out.write(" selected ");
} 
      out.write(" value=\"100\">100%</option>\r\n");
      out.write("					  ");
} 
      out.write("\r\n");
      out.write("					  </select>\r\n");
      out.write("					  ");
} 
      out.write("\r\n");
      out.write("					  ");
if(tache.getAvancement() != 100){ 
      out.write("\r\n");
      out.write("					  <input type=\"submit\" name=\"addAvancement\" value=\"Submit\" class=\"bg-black rounded-md text-white p-1\">\r\n");
      out.write("						");
} 
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					</form>\r\n");
      out.write("\r\n");
      out.write("					");
} } 
      out.write("\r\n");
      out.write("            	\r\n");
      out.write("            ");
}}} 
      out.write('\r');
      out.write('\n');

        }
    } else { 
      out.write("\r\n");
      out.write("        <!-- Handle case where projects are null or empty -->\r\n");
      out.write("    	<h1>No Projects</h1>\r\n");
      out.write(" ");
  }

      out.write("\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("        // Trigger an immediate request to fetch director projects\r\n");
      out.write("        var xhttp = new XMLHttpRequest();\r\n");
      out.write("        xhttp.onreadystatechange = function() { \r\n");
      out.write("            if (this.readyState == 4 && this.status == 200) {\r\n");
      out.write("                // Handle the response and update the HTML content with projects\r\n");
      out.write("                document.getElementById(\"dev-space\").innerHTML = this.responseText;\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        xhttp.open(\"GET\", \"DevServlet\", true);\r\n");
      out.write("        xhttp.send();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
