<?php

//connect to the server

$con = mysqli_connect('127.0.0.1','root','','signup');

//check if it is connectedSS
if(!$con)
{
    
    echo "Error Connecting to the server";
}

elseif(!mysqli_select_db($con,'signup'))
{
    echo "Database not found";
}

//now sql commands


$uname= $_POST['uname'];
$pwd= $_POST['pwd'];

$sql = "select uname,pwd from signup where uname = '$uname' and pwd ='$pwd'";


			
if(!mysqli_query($con,$sql))
{
    die("Query Failes!".mysqli_error($con));
}
else
{
    echo "Congrats logged in successfully";
    echo "PLease wait opening login page";			
}
			

header("refresh:5;url=car.html");

?>
