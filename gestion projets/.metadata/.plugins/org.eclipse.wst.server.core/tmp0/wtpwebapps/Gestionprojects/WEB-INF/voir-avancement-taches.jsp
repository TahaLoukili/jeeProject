<%@page import="Models.Service"%>
<%@page import="Models.Tache"%>
<%@page import="java.util.List"%>
<%@page import="Models.Dev"%>
<%@page import="Models.Chef"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Voir avancement taches</title>
<link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>
<% 
int ProjetId = (int) request.getAttribute("ProjetId"); 

Chef chef=(Chef) request.getAttribute("chef");
List<Tache> listeTaches=(List<Tache> )request.getAttribute("listeTaches");
List<Dev> listDevs=(List<Dev>)request.getAttribute("listDevs");
List<Service> listServices=(List<Service>)request.getAttribute("listServices");
%>



 
  <div class="flex flex-col items-center justify-center px-6 py-8 mx-auto md:h-screen lg:py-0">
    <a href="#" class="flex items-center mb-6 text-2xl font-semibold text-gray-900 dark:text-white">
        <img class="w-8 h-8 mr-2" src="https://flowbite.s3.amazonaws.com/blocks/marketing-ui/logo.svg" alt="logo">
        Espace Chef  
    </a>
  <div class="w-full bg-white rounded-lg shadow dark:border md:mt-0 sm:max-w-3xl xl:p-0 dark:bg-gray-800 dark:border-gray-700 xl:w-4/5">
    <div class="p-6 space-y-4 md:space-y-6 sm:p-8">
  <!-- Table to display tasks -->
<table class="min-w-full divide-y divide-gray-200">
  <thead class="bg-gray-50">
    <tr>
      <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Service Name</th>
      <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Nom Tache</th>
      <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Nom Developpeur</th>
      <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Avancement</th>
      <!-- Add other table headers based on your Tache model -->
      <!-- Example: <th class="...">ID Dev</th> -->
    </tr>
  </thead>
  <tbody class="bg-white divide-y divide-gray-200">
    <% 
    String currentService = "";
    for (Tache tache : listeTaches) {
        for (Service service : listServices) {
            if (service.getId() == tache.getIdService() && !service.getDescription().equals(currentService)) {
                currentService = service.getDescription();
    %>
    <tr class="bg-gray-100"><!-- Add your preferred color class for service line -->
      <td class="px-6 py-4 font-semibold" colspan="4"><%= currentService %></td>
    </tr>
    <% 
            }
        } 
    %>
    <tr>
      <td class="px-6 py-4 whitespace-nowrap"></td>
      <td class="px-6 py-4 whitespace-nowrap"><%= tache.getNom() %></td>
      <% 
      boolean devFound = false;
      for (Dev dev : listDevs) { 
        if (dev.getId() == tache.getIdDev()) {
          devFound = true;
      %>
          <td class="px-6 py-4 whitespace-nowrap"><%= dev.getUsername() %></td>
      <% 
      break;
        }
      } 
      if (!devFound) { %>
          <td class="px-6 py-4 whitespace-nowrap">No Dev Assigned</td>
      <% } %>
      <td class="px-6 py-4 whitespace-nowrap">
        <!-- Display progress bar for advancement -->
        <div class="bg-gray-200 h-4 w-32 rounded-full overflow-hidden">
          <div class="bg-blue-500 h-full text-xs text-center text-white" style="width:<%= tache.getAvancement() %>%;"> <%= tache.getAvancement() %>%</div>
        </div>
      </td>
      <!-- Display other tache attributes within table cells -->
      <!-- Example: <td><%= tache.getIdDev() %></td> -->
    </tr>
    <% } %>
  </tbody>
</table>



    </div>
</div>
</div>







</body>
</html>