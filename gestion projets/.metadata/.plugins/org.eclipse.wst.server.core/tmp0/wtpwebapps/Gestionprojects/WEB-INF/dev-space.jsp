<%@page import="Models.Tache"%>
<%@page import="Models.Dev"%>
<%@page import="Models.Service"%>
<%@page import="Models.Projet"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Developer space</title>
<link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>
<!-- <div id="dev-space"></div> -->
<jsp:include page="header.jsp" />
<ul class="bg-white shadow overflow-hidden sm:rounded-md max-w-full mx-auto mt-16 p-4" style="width: 900px;">
    <%
    List<Projet> devProjects = (List<Projet>) session.getAttribute("devProjects");
    List<Service> projectServices = (List<Service>) session.getAttribute("projectServices");
    Dev dev = (Dev) session.getAttribute("dev");
    
    Integer clickedProjectId=(Integer)request.getAttribute("clickedProjectId");
    
    if (devProjects != null) {
        for(Projet project : devProjects) {
	%>
            <li>
                <div class="px-4 py-5 sm:px-6 mb-3">
                    <div class="flex items-center justify-between">
                        <h3 class="text-lg leading-6 font-medium text-gray-900"><%= project.getNom() %></h3>
                        <p class="mt-1 max-w-2xl text-sm text-gray-500"><%= project.getDescription() %></p>
                    </div>
                    <div class="mt-4 flex items-center justify-between">
                    <div class="grid-row">
                        <p class="text-sm font-medium text-gray-500">Date démarrage: <div class="text-green-500 text-sm"><%= project.getDateDemarage() %></div></p>
                        <p class="text-sm font-medium text-gray-500">Date livraison: <div class="text-green-500 text-sm"><%= project.getDateLivraison() %></div></p>
                    </div>
                    <div>
	                    <%-- <div><a href="editProject?id=<c:out value='${project.getId()}' />" class="font-medium text-indigo-600 hover:text-indigo-500">Edit</a></div> --%>
		                    <%-- <div><a href="editProject?id=<%= project.getId() %>" name="editProject" class="font-medium text-indigo-600 hover:text-indigo-500">Edit</a></div> --%>
		                    <%-- <div><a href="deleteProject?id=<%= project.getId() %>" name="deleteProject"class="font-medium text-red-600 hover:text-red-500">Delete</a></div> --%>
					
					
					<!-- ***********consulter servicce*********************************** -->
					<form action="devServlet" method="post">
	                   
	                    <%-- <div><a href="consulterServices?id=<%= project.getId() %>" name="consulterServices" class="font-medium text-indigo-600 hover:text-indigo-500"> --%>
	                    
	                    <input type="hidden" value="<%= project.getId() %>" name="idProjet">
	                    <input type="hidden" value="<%= dev.getId() %>" name="idDev">
	                    <input type="hidden" value="<%= dev.getUsername() %>" name="usernameDev">
	                    <input type="submit" class="bg-black text-white rounded-md p-1 hover:bg-gray-700" value="Services" name="consulterServices"/>
	                   
	                    </a></div>
					</form>
		                    
                    </div>
                    </div>
                </div>
            </li>
            
                        
            <%
            	if(projectServices != null  && clickedProjectId !=null && clickedProjectId == project.getId() ){            		
            	for(Service service : projectServices){
            		//List<Tache> serviceTaches = (List<Tache>) session.getAttribute("serviceTaches");
            		if(clickedProjectId == project.getId()){
            		%>
            		
             		<div class="bg-black text-white rounded-md p-1 mb-2"><%=service.getDescription() %></div>
					
					<% 
					
					
					for(Tache tache : service.getTaches()){
						
						if(tache.getIdDev() == dev.getId() && tache.getIdService() == service.getId()){
						%>
					
					<form action="devServlet" method="post">
					<div class="flex items-center space-x-4 mt-2 mb-2">
					  <button class="bg-white border border-black rounded-md px-4 py-2" value="<%= tache.getNom() %>">
					    <%=tache.getNom() %>
					  </button>
					  
					  <input type="hidden" name="tacheId" value="<%= tache.getId() %>" />
					  
					  <%if(tache.getAvancement() == 100){ %>
					  	<div class="bg-green-500 rounded-md text-white p-1">Finished</div>
					  <%}else{ %>
					  <select class="border border-black rounded-md px-2 py-1"  name="percentAvancement">
					  <%if(tache.getAvancement() == 0){ %>
					    <option <%if(tache.getAvancement() == 0){ %> selected <%} %> value="0">0%</option>
					    <option <%if(tache.getAvancement() == 25){ %> selected <%} %> value="25">25%</option>
					    <option <%if(tache.getAvancement() == 50){ %> selected <%} %> value="50">50%</option>
					    <option <%if(tache.getAvancement() == 75){ %> selected <%} %> value="75">75%</option>
					    <option <%if(tache.getAvancement() == 100){ %> selected <%} %> value="100">100%</option>					  
					  <%}else if(tache.getAvancement() == 25){ %>
					  <option <%if(tache.getAvancement() == 25){ %> selected <%} %> value="25">25%</option>
					    <option <%if(tache.getAvancement() == 50){ %> selected <%} %> value="50">50%</option>
					    <option <%if(tache.getAvancement() == 75){ %> selected <%} %> value="75">75%</option>
					    <option <%if(tache.getAvancement() == 100){ %> selected <%} %> value="100">100%</option>
					  <%}else if(tache.getAvancement() == 50){ %>
					  	<option <%if(tache.getAvancement() == 50){ %> selected <%} %> value="50">50%</option>
					    <option <%if(tache.getAvancement() == 75){ %> selected <%} %> value="75">75%</option>
					    <option <%if(tache.getAvancement() == 100){ %> selected <%} %> value="100">100%</option>
					  <%}else if(tache.getAvancement() == 75){ %>
					  	<option <%if(tache.getAvancement() == 75){ %> selected <%} %> value="75">75%</option>
					    <option <%if(tache.getAvancement() == 100){ %> selected <%} %> value="100">100%</option>
					  <%} %>
					  </select>
					  <%} %>
					  <%if(tache.getAvancement() != 100){ %>
					  <input type="submit" name="addAvancement" value="Submit" class="bg-black rounded-md text-white p-1">
						<%} %>
					</div>
					</form>

					<%} } %>
            	
            <%}}} %>
<%
        }
    } else { %>
        <!-- Handle case where projects are null or empty -->
    	<h1>No Projects</h1>
 <%  }
%>
    
   
</ul>

<script>
        // Trigger an immediate request to fetch director projects
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() { 
            if (this.readyState == 4 && this.status == 200) {
                // Handle the response and update the HTML content with projects
                document.getElementById("dev-space").innerHTML = this.responseText;
            }
        };
        xhttp.open("GET", "DevServlet", true);
        xhttp.send();
</script>

</body>
</html>