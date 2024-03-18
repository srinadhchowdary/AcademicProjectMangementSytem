<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>APMS SDP PROJECT</title>
  <style>
    /* Reset and common styles */
    body, h1, h2, h3, p {
      margin: 0;
      padding: 0;
    }
    body {
      font-family: Arial, sans-serif;
      line-height: 1.6;
    }
    /* Header styles */
    header {
      background-color: #35424a;
      color: white;
      text-align: center;
      padding: 20px 0;
    }
    /* Navigation styles */
    nav ul {
      list-style: none;
      display: flex;
      justify-content: center;
      background-color: #35424a;
      padding: 10px 0;
    }
    nav a {
      color: white;
      text-decoration: none;
      margin: 0 15px;
      font-weight: bold;
      transition: color 0.3s;
    }
    nav a:hover {
      color: #e74c3c;
    }
    /* Main content styles */
    .main-content {
      padding: 40px;
    }
    .highlight-box {
      background-color: #e74c3c;
      color: white;
      padding: 20px;
      border-radius: 10px;
      margin-bottom: 20px;
    }
    .feature-list {
      list-style-type: disc;
      padding-left: 20px;
    }
    .feature-list-item {
      margin-bottom: 10px;
    }
    /* Footer styles */
    footer {
      background-color: #35424a;
      color: white;
      text-align: center;
      padding: 20px 0;
    }
    .dropdown {
      float: left;
      overflow: hidden;
    }
    .dropdown .dropbtn {
      font-size: 16px;
      border: none;
      outline: none;
      color: white;
      padding: 14px 16px;
      background-color: inherit;
      font-family: inherit;
      margin: 0;
    }
    .navbar a:hover,
    .dropdown:hover .dropbtn {
      background-color: red;
    }
    .dropdown-content {
      display: none;
      position: absolute;
      background-color: #f9f9f9;
      min-width: 160px;
      box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
      z-index: 1;
    }
    .dropdown-content a {
      float: none;
      color: black;
      padding: 12px 16px;
      text-decoration: none;
      display: block;
      text-align: left;
    }
    .dropdown-content a:hover {
      background-color: #ddd;
    }
    .dropdown:hover .dropdown-content {
      display: block;
    }
  </style>
  <link rel="stylesheet" href="dark.css" />
  <script
      src="https://kit.fontawesome.com/81d73e8e4d.js"
      crossorigin="anonymous"
    ></script>
</head>
<body>
  <!-- Header -->
  <header>
    <h1>Academic Project Management System</h1>
    <p>Streamline project management within educational institutions.</p>
  </header>

  <nav>
    <ul>
      
      <li><a href="facultyhome">Home</a></li>
  	  <li><a href="updateprofile">Update Profile</a></li>
  	  <li><a href="facultylogout">Logout</a></li>
    </ul>
  </nav>
  <br>
   <script src="dark.js"></script>
</body>
</html>