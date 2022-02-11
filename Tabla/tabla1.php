<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Consulta de Pacientes</title>
    <link rel="shortcut icon" href="../favicon.PNG" type="image/x-icon">
    <link href="../estilo.css" rel="stylesheet" type="text/css">
  </head>
  <body>
  <div class="cuerpo">
  
  <br>
   <table border="1">
   	<tr>
   		<td>ID del paciente</td>
   		<td>Nombre del paciente</td>
   		<td>Enfermedad del paciente</td>
   		<td>Tipo de Sangre del paciente</td>
   		<td>Ciudad de nacimiento del paciente</td>
   	</tr>
    <?php 
            $servername = "localhost";
            $username = "id15715936_emmabau11";
            $password = "aNdroid2021*";
            $conn = mysqli_connect($servername, $username, $password);
            mysqli_select_db($conn,"id15715936_prueba");
            $sql=("SELECT * FROM Paciente");
            $result=mysqli_query($conn, $sql);

            while($mostrar=mysqli_fetch_array($result)){
            ?>
         
    
   	<tr>
   		<td><?php echo $mostrar['pac_ID'] ?></td>
   		<td><?php echo $mostrar['pac_Nombre'] ?></td>
   		<td><?php echo $mostrar['pac_Enf'] ?></td>
   		<td><?php echo $mostrar['pac_San'] ?></td>
   		<td><?php echo $mostrar['pac_Ciudad'] ?></td>
   	</tr>
    <?php
     } 
     mysqli_close($conn);
     ?>
   </table>
  </div>
  <center><input type="button" onclick="location.href='../index.html';" value="Volver" /></center>
  </body>
  </html>