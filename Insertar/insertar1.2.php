<!DOCTYPE html>
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
  $paciente=$_POST["id"];
  $sql_stmt = ("select pac_ID from Paciente where pac_ID=$paciente");
  $registros=mysqli_query ($conn, $sql_stmt);
  if ($reg=mysqli_fetch_array($registros))
    {
      ?>
      <div class="cabecera">
       <h2>YA EXISTE UN PACIENTE <?php echo $paciente;?></h2>
       <input type="button" onclick="location.href='insertar1.1.html';" value="NUEVO PACIENTE" />
     </div>
  <?php
      mysqli_close($conn);
    }else {
      ?>
<div class="cuerpo">
<form action="insertar1.3.php" method="post">
PACIENTE A INGRESAR:
<input type="text" readonly="readonly" name="idpac"value="<?php echo $paciente; ?>"><br>
NOMBRE DEL PACIENTE:
<input type="text" name="nombre"><br>
<br>
ENFERMEDAD:
<input type="text" name="enfermedad"><br>
<br>
TIPO DE SANGRE:
<input type="text" name="sangre"><br>
<br>
CIUDAD DE NACIMIENTO:
<input type="text" name="ciudad"><br>
<br>
<input type="submit" value="Registrar" >
</form>
<input type="button" onclick="location.href='insertar1.2.php';" value="Borrar" />
<input type="button" onclick="location.href='insertar1.1.html';" value="Cancelar" />
</div>
      <?php
      mysqli_close($conn);
  }
  ?>
  </body>
  </html>
