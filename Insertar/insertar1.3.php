<html>
  <head>
    <meta charset="utf-8">
    <title>Alta de Pacientes</title>
    <link rel="shortcut icon" href="../favicon.PNG" type="image/x-icon">
    <link href="../estilo.css" rel="stylesheet" type="text/css">
  </head>
  <body>
  <?php
  $servername = "localhost";
  $username = "id15715936_emmabau11";
  $password = "aNdroid2021*";
  $conn = mysqli_connect($servername, $username, $password);
  mysqli_select_db($conn,"id15715936_prueba");
  $id=$_POST['idpac'];
  $nombrep=$_POST['nombre'];
  $enfermedadp=$_POST['enfermedad'];
  $sangrep=$_POST['sangre'];
  $ciudadp=$_POST['ciudad'];
  $sql_stmt = ("INSERT INTO Paciente (pac_ID, pac_Nombre, pac_Enf, pac_San, pac_Ciudad) values ('$id','$nombrep','$enfermedadp','$sangrep', '$ciudadp')");
  if(mysqli_query ($conn, $sql_stmt)){
      ?>
 <div class="cuerpo">
 <h1>REGISTRO COMPLETADO</h1>
  <input type="button" onclick="location.href='insertar1.1.html';" value="NUEVO PACIENTE" />
</div>
 <?php
      mysqli_close($conn);
  }else{
      ?>
      <div class="cuerpo">
      <h1>HUBO UN ERROR, INTENTE DE NUEVO</h1>
       <input type="button" onclick="location.href='insertar1.1.html';" value="NUEVO PACIENTE" />
    </div>
      <?php
      mysqli_close($conn);
  }
  ?>
</body>
</html>
