<?php

//connect to the server

$con = mysqli_connect('127.0.0.1','root','');

//check if it is connected
if(!$con)
{
    
    echo "Error Connecting to the server";
}

elseif(!mysqli_select_db($con,'car'))
{
    echo "Database not found";
}

//now sql commands
$name = $_POST['name'];
$bname= $_POST['bname'];
$author= $_POST['md'];
$public= $_POST['public'];
$year= $_POST['year'];
$cond= $_POST['cond'];
$comment= $_POST['comment'];
$phone= $_POST['phone'];
		
$sql = "insert into detail (name, bname, md, public, year, cond, comment, phone )"." values ('$name','$bname','$author','$public','$year','$cond','$comment','$phone')";


			
if(!mysqli_query($con,$sql))
{
    die("Query Failes!".mysqli_error($con));
}
else
{
    echo "Data inserted successfully";
    echo "PLease wait opening login page";			
}
			

header("refresh:5;url=car.html");

?>
