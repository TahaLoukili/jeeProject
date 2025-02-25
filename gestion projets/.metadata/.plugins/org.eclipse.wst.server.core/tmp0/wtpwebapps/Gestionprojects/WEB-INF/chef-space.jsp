<%@page import="Models.Equipe"%>
<%@page import="Models.Chef"%>
<%@page import="Models.Projet"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Chef space</title>
</head>
<body>






<div id="ChefProjects">
<jsp:include page="header.jsp" />

<% Chef chef = (Chef) session.getAttribute("chef");
Equipe equipe=(Equipe) request.getAttribute("equipe");

%>






<ul class="bg-white shadow overflow-hidden sm:rounded-md max-w-full mx-auto mt-16 p-4" style="width: 900px;">
    <%
    List<Projet> projects = (List<Projet>) request.getAttribute("projects");

    if (projects != null) {
        for (Projet project : projects) {
%>
            <li>
                <div class="px-4 py-5 sm:px-6">
                    <div class="flex items-center justify-between">
                        <h3 class="text-lg leading-6 font-medium text-gray-900"><%= project.getNom() %></h3>
                        <p class="mt-1 max-w-2xl text-sm text-gray-500"><%= project.getDescription() %></p>
                    </div>
                    <div class="mt-4 flex items-center justify-between">
                    <div class="grid-row">
                        <p class="text-sm font-medium text-gray-500">Date démarrage: <div class="text-green-500 text-sm"><%= project.getDateDemarage() %></div></p>
                        <p class="text-sm font-medium text-gray-500">Date livraison: <div class="text-green-500 text-sm"><%= project.getDateLivraison() %></div></p>
                    </div>
                    <div class="space-y-4">
	                   <form action="chefServlet" method="post" >
	                   
	                    <div>
	                    
	                    <input type="hidden" value="<%= project.getId() %>" name="idProjet">
	                    <input type="hidden" value="<%= chef.getId() %>" name="idChef">
	                    <input type="submit" value="Modifier Projet" name="consulterProject" class="font-medium text-indigo-600 hover:text-indigo-500 bg-white"/>
	                    
	                    
	                   
	                    </div>
	                    
	                   
	                    
	                   </form>
	                   
	                   <form action="ajouterrServicesServlet" method="post">
	                   
	                    <div>
	                    
	                    <input type="hidden" value="<%= project.getId() %>" name="ProjetId">
	                    <input type="hidden" value="<%= chef.getId() %>" name="ChefId">
	                    <input type="submit" value="Affecter service" name="affecterServiceProject" class="font-medium text-green-600 hover:text-green-500 bg-white"/>
	                    
	                    
	                   
	                    </div>
	                    
	                   
	                    
	                   </form>
	                   
	                     <form action="voirAvancementServlet" method="post">
	                   
	                    <div>
	                    
	                    <input type="hidden" value="<%= project.getId() %>" name="ProjetId">
	                    <input type="hidden" value="<%= chef.getId() %>" name="ChefId">
	                    <input type="submit" value="Voir Avancement" name="VoirAvancementProjet" class="font-medium text-yellow-600 hover:text-yellow-500 bg-white"/>
	                    
	                    
	                   
	                    </div>
	                    
	                   
	                    
	                   </form>
	                    
                    </div>
                    </div>
                </div>
            </li>
<%
        }
    } else { %>
        <!-- Handle case where projects are null or empty -->
    	<h1>No Projects</h1>
 <%  }
%>
    <% request.setAttribute("chef", chef);
    %>
   
</ul>

</div>
<!-- <script>
        // Trigger an immediate request to fetch director projects
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() { 
            if (this.readyState == 4 && this.status == 200) {
                // Handle the response and update the HTML content with projects
                document.getElementById("ChefProjects").innerHTML = this.responseText;
            }
        };
        xhttp.open("GET", "ChefServlet", true);
        xhttp.send();
    </script> -->
</body>
</html>