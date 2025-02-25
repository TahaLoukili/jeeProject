<%@page import="Models.Projet"%>
<%@page import="Models.Client"%>
<%@page import="Models.Methodologie"%>
<%@page import="Models.Chef"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Project</title>
<link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">

</head>
<body>

<% Projet project = (Projet) request.getAttribute("project");
	List<Methodologie> methodologies = (List<Methodologie>) request.getAttribute("methodologies");
	List<Chef> chefs = (List<Chef>) request.getAttribute("chefs");
	
%>

<!-- component -->
<%if(project !=null){ %>

<jsp:include page="header.jsp" />
<jsp:include page="sidebar.jsp" />

<form action="editproject" method="post">
<div class="min-h-screen p-6 bg-gray-100 flex items-center justify-center">
  <div class="container max-w-screen-lg mx-auto">
    <div>

      <div class="bg-white rounded shadow-lg p-4 px-4 md:p-8 mb-6 ml-6">
        <div class="grid gap-4 gap-y-2 text-sm grid-cols-1 lg:grid-cols-3">
          <div class="text-gray-600">
            <p class="font-medium text-lg">Détails du projet</p>
            <p>Please fill out all the fields.</p>
          </div>
			<input type="hidden" name="projectId" value="<%=project.getId() %>" >
          <div class="lg:col-span-2">
            <div class="grid gap-4 gap-y-2 text-sm grid-cols-1 md:grid-cols-5">
              <div class="md:col-span-5">
                <label for="full_name">Nom du projet</label>
                <input type="text" name="nomProject" id="full_name" value="<%=project.getNom() %>" class="h-10 border mt-1 rounded px-4 w-full bg-gray-50"  />
              </div>

              <div class="md:col-span-5">
                <label for="description" >Description du projet</label>
                <input type="text" name="projectDescription" value="<%=project.getDescription() %>" class="h-10 border mt-1 rounded px-4 w-full bg-gray-50" value="test" />
              </div>

              <div class="md:col-span-3">
                <label for="date_demarrage">Date de démarrage</label>
                <input type="date" name="dateDemarrage" value="<%=project.getDateDemarage() %>" id="address" class="h-10 border mt-1 rounded px-4 w-full bg-gray-50" />
              </div>

              <div class="md:col-span-2">
                <label for="date_livraison">Date de livraison</label>
                <input type="date" name="dateLivraison" value="<%=project.getDateLivraison() %>" id="date_livraison" class="h-10 border mt-1 rounded px-4 w-full bg-gray-50"/>
              </div>
	
			  <%-- <div class="md:col-span-2">
                <label for="date_livraison">Date de réunion</label>
                <input type="date" name="dateReunion" value="<%=project.getDateReunion() %>" id="date_livraison" class="h-10 border mt-1 rounded px-4 w-full bg-gray-50"/>
              </div> --%>
              
             <div class="md:col-span-2">       
             	<div class="font-medium text-lg" >Informations client</div> 
             	<input type="hidden" name="idClient" value="<%=project.getClient().getId() %>">        
				 <label for="nom-client">Nom</label>
                <input type="text" name="nom-client" value="<%=project.getClient().getNom() %>" id="nom-client" class="h-10 border mt-1 rounded px-4 w-full bg-gray-50" />                              
               <label for="tel-client">Tél</label>
                <input type="text" name="tel-client" value="<%=project.getClient().getTel() %>" id="tel-client" class="h-10 border mt-1 rounded px-4 w-full bg-gray-50" />      
              </div>

              <div class="md:col-span-2">                
				<label for="chefs" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Chef du projet</label>
				<select id="chefs" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500">
				  <% for (Chef chef : chefs) { %>
				  <option <%if(chef.getId() == project.getChef().getId()){ %> selected <%} %> value="<%=chef.getId() %>"> <%=chef.getUsername() %></option>
				  <% } %>
				  
				</select>                                
              </div> 
      			
              <div class="md:col-span-5 text-right">
                <div class="inline-flex items-end">
				<!-- infos client -->
                  <input type="submit" value="Submit" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded"/>
                </div>
              </div>

            </div>
          </div>
        </div>
      </div>
    </div>
 
  </div>
</div>
</div>
</div>





</form>
<% }else{ %>
<h1>Project est null</h1>
<% } %>

</body>
</html>