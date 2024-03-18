<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%> 
<%@ taglib uri="jakarta.tags.core" prefix="c"%> 

<html> 
<head> 

  <link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css"> 
  <link type="text/css" rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"> 
  <link type="text/css" rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css"> 
  <style> 
    body {
      min-height: 100vh;
      background-color: #FFE53B;
      background-image: linear-gradient(147deg, #FFE53B 0%, #FF2525 100%);
    }
  </style> 
</head> 
<body> 
  <%@ include file="adminnavbar.jsp" %>
  <br> 
  <h3 align="center"><u>View All faculties</u></h3> 

  <div class="container py-5">
    <div class="row py-5">
      <div class="col-lg-10 mx-auto">
        <div class="card rounded shadow border-0">
          <div class="card-body p-5 bg-white rounded">
            <div class="table-responsive">
              <table id="example" style="width:100%" class="table table-striped table-bordered">
                <!-- Table headers -->
                <thead>
                  <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Department</th>
                    <th>Email</th>
                    <th>Location</th>
                    <th>Contact</th>
                    <th>Experience</th>
                  </tr>
                </thead>

                <tbody>
                  <c:forEach items="${fdata}" var="f">
                    <!-- Table rows -->
                    <tr>
                      <td>${f.id}</td>
                      <td>${f.name}</td>
                      <td>${f.department}</td>
                      <td>${f.email}</td>
                      <td>${f.location}</td>
                      <td>${f.contact}</td>
                      <td>${f.experience}</td>
                    </tr>
                  </c:forEach>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
  <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
  <script src="https://cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.bundle.min.js"></script>
  <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>

  <script>
    // JavaScript to set active class for the dropdown based on the current page URL
    $(document).ready(function() {
      var url = window.location.href;
      $('nav a').filter(function() {
        return this.href === url;
      }).addClass('active');
    });
  </script>
</body> 
</html>
