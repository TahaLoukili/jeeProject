/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.95
 * Generated at: 2023-12-16 12:25:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.Projet;
import Models.Client;
import Models.Methodologie;
import Models.Chef;
import java.util.List;

public final class edit_002dproject_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("Models.Chef");
    _jspx_imports_classes.add("Models.Projet");
    _jspx_imports_classes.add("Models.Methodologie");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Models.Client");
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
      out.write("<title>Edit Project</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
 Projet project = (Projet) request.getAttribute("project");
	List<Methodologie> methodologies = (List<Methodologie>) request.getAttribute("methodologies");
	List<Chef> chefs = (List<Chef>) request.getAttribute("chefs");
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- component -->\r\n");
if(project !=null){ 
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"editproject\" method=\"post\">\r\n");
      out.write("<div class=\"min-h-screen p-6 bg-gray-100 flex items-center justify-center\">\r\n");
      out.write("  <div class=\"container max-w-screen-lg mx-auto\">\r\n");
      out.write("    <div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"bg-white rounded shadow-lg p-4 px-4 md:p-8 mb-6 ml-6\">\r\n");
      out.write("        <div class=\"grid gap-4 gap-y-2 text-sm grid-cols-1 lg:grid-cols-3\">\r\n");
      out.write("          <div class=\"text-gray-600\">\r\n");
      out.write("            <p class=\"font-medium text-lg\">Détails du projet</p>\r\n");
      out.write("            <p>Please fill out all the fields.</p>\r\n");
      out.write("          </div>\r\n");
      out.write("			<input type=\"hidden\" name=\"projectId\" value=\"");
      out.print(project.getId() );
      out.write("\" >\r\n");
      out.write("          <div class=\"lg:col-span-2\">\r\n");
      out.write("            <div class=\"grid gap-4 gap-y-2 text-sm grid-cols-1 md:grid-cols-5\">\r\n");
      out.write("              <div class=\"md:col-span-5\">\r\n");
      out.write("                <label for=\"full_name\">Nom du projet</label>\r\n");
      out.write("                <input type=\"text\" name=\"nomProject\" id=\"full_name\" value=\"");
      out.print(project.getNom() );
      out.write("\" class=\"h-10 border mt-1 rounded px-4 w-full bg-gray-50\"  />\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"md:col-span-5\">\r\n");
      out.write("                <label for=\"description\" >Description du projet</label>\r\n");
      out.write("                <input type=\"text\" name=\"projectDescription\" value=\"");
      out.print(project.getDescription() );
      out.write("\" class=\"h-10 border mt-1 rounded px-4 w-full bg-gray-50\" value=\"test\" />\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"md:col-span-3\">\r\n");
      out.write("                <label for=\"date_demarrage\">Date de démarrage</label>\r\n");
      out.write("                <input type=\"date\" name=\"dateDemarrage\" value=\"");
      out.print(project.getDateDemarage() );
      out.write("\" id=\"address\" class=\"h-10 border mt-1 rounded px-4 w-full bg-gray-50\" />\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"md:col-span-2\">\r\n");
      out.write("                <label for=\"date_livraison\">Date de livraison</label>\r\n");
      out.write("                <input type=\"date\" name=\"dateLivraison\" value=\"");
      out.print(project.getDateLivraison() );
      out.write("\" id=\"date_livraison\" class=\"h-10 border mt-1 rounded px-4 w-full bg-gray-50\"/>\r\n");
      out.write("              </div>\r\n");
      out.write("	\r\n");
      out.write("			  ");
      out.write("\r\n");
      out.write("              \r\n");
      out.write("             <div class=\"md:col-span-2\">       \r\n");
      out.write("             	<div class=\"font-medium text-lg\" >Informations client</div> \r\n");
      out.write("             	<input type=\"hidden\" name=\"idClient\" value=\"");
      out.print(project.getClient().getId() );
      out.write("\">        \r\n");
      out.write("				 <label for=\"nom-client\">Nom</label>\r\n");
      out.write("                <input type=\"text\" name=\"nom-client\" value=\"");
      out.print(project.getClient().getNom() );
      out.write("\" id=\"nom-client\" class=\"h-10 border mt-1 rounded px-4 w-full bg-gray-50\" />                              \r\n");
      out.write("               <label for=\"tel-client\">Tél</label>\r\n");
      out.write("                <input type=\"text\" name=\"tel-client\" value=\"");
      out.print(project.getClient().getTel() );
      out.write("\" id=\"tel-client\" class=\"h-10 border mt-1 rounded px-4 w-full bg-gray-50\" />      \r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"md:col-span-2\">                \r\n");
      out.write("				<label for=\"chefs\" class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Chef du projet</label>\r\n");
      out.write("				<select id=\"chefs\" class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500\">\r\n");
      out.write("				  ");
 for (Chef chef : chefs) { 
      out.write("\r\n");
      out.write("				  <option ");
if(chef.getId() == project.getChef().getId()){ 
      out.write(" selected ");
} 
      out.write(" value=\"");
      out.print(chef.getId() );
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(chef.getUsername() );
      out.write("</option>\r\n");
      out.write("				  ");
 } 
      out.write("\r\n");
      out.write("				  \r\n");
      out.write("				</select>                                \r\n");
      out.write("              </div> \r\n");
      out.write("      			\r\n");
      out.write("              <div class=\"md:col-span-5 text-right\">\r\n");
      out.write("                <div class=\"inline-flex items-end\">\r\n");
      out.write("				<!-- infos client -->\r\n");
      out.write("                  <input type=\"submit\" value=\"Submit\" class=\"bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
 }else{ 
      out.write("\r\n");
      out.write("<h1>Project est null</h1>\r\n");
 } 
      out.write("\r\n");
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
