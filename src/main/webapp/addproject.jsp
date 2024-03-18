<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link type="text/css" rel="stylesheet" href="css/style.css">
 
  
    <meta charset='utf-8'>
    <title>Add Project</title>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">

    <style>
      body {
    font-family: 'Lato', sans-serif;
}

h1 {
    margin-bottom: 40px;
}

label {
    color: #333;
}

.btn-send {
    font-weight: 300;
    text-transform: uppercase;
    letter-spacing: 0.2em;
    width: 80%;
    margin-left: 3px;
    }
.help-block.with-errors {
    color: #ff5050;
    margin-top: 5px;

}

.card{
  margin-left: 10px;
  margin-right: 10px;
}

    </style>
</head>

<body>
 <%@ include file="adminnavbar.jsp" %>
  <div class="container">
    <div class=" text-center mt-5 ">

        <h1 >Add Project</h1>
            
        <h3>${message}</h3>
    </div>


<div class="row ">
  <div class="col-lg-7 mx-auto">
    <div class="card mt-2 mx-auto p-4 bg-light">
        <div class="card-body bg-light">
   
        <div class = "container">
                         <form id="contact-form" role="form" method="post" action="insertproject">

        

        <div class="controls">
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label for="form_name">Project ID *</label>
                        <input id="form_name" type="text" name="id" class="form-control" placeholder="Please enter project ID *" required="required" data-error="Firstname is required.">
                        
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label for="form_lastname">Project Name *</label>
                        <input id="form_lastname" type="text" name="name" class="form-control" placeholder="Please enter Project Name *" required="required" data-error="Lastname is required.">
                                                        </div>
                </div>
            </div>
        
            <div class="row">
                <div class="col-md-12">
                    <div class="form-group">
                        <label for="form_message">Project Description *</label>
                        <textarea id="form_message" name="desc" class="form-control" placeholder="Write Project Description here." rows="4" required="required" data-error="Please, leave us a message."></textarea
                            >
                        </div>

                    </div>


                <div class="col-md-12">
                    
                    <input type="submit" class="btn btn-success btn-send  pt-2 btn-block
                        " value="Add Project" >
                
            </div>
      
            </div>
            
         
    </div>
     </form>
    </div>
        </div>


</div>
    <!-- /.8 -->

</div>
<!-- /.row-->

</div>
</div>

</body>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


</html>