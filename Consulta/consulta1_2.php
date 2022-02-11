<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Consulta de Pacientes</title>
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
   $sql_stmt = ("select * from Paciente where pac_ID=$paciente");
    $registros=mysqli_query ($conn, $sql_stmt);
    if ($reg=mysqli_fetch_array($registros)){
        ?>
        <div class="cuerpo">
        <h1>SE ENCONTRÓ PACIENTE <?php echo $paciente;?></h1>
<form action="consulta1_1.html" method="post">
ID DEL PACIENTE:
<input type="text" readonly="readonly" name="pacienteid"value="<?php echo $paciente; ?>"><br>
<br>
NOMBRE DEL PACIENTE:
<input type="text" readonly="readonly" name="nombre" value="<?php echo $reg['pac_Nombre'] ?>"><br>
<br>
ENFERMEDAD:
<input type="text" readonly="readonly" name="enfermedad" value="<?php echo $reg['pac_Enf'] ?>"><br>
<br>
TIPO DE SANGRE:
<input type="text" readonly="readonly" name="sangre" value="<?php echo $reg['pac_San'] ?>"><br>
<br>
CIUDAD DE NACIMIENTO:
<input type="text" readonly="readonly" name="ciudad" value="<?php echo $reg['pac_Ciudad'] ?>"><br>
<br>
</form>
<br>
<input type="button" onclick="location.href='consulta1_1.html';" value="Cancelar" />
      </div>
    <?php
    mysqli_close($conn);
    }else {
        ?>
    <div class="cuerpo">
    <h2>NO EXISTE PACIENTE INGRESADO</h2>
    <input type="button" onclick="location.href='consulta1_1.html';" value="OTRO PACIENTE" />
  </div>
    <?php
      mysqli_close($conn);  
    }

?>
</body>
</html>