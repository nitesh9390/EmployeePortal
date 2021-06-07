<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        body {
            margin: 0;
            padding: 0;
        }
        .container {
            display: flex;
        }
        input {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
            font-size: 18px;
            
            margin-bottom: 20px;
        }

        form {
            border: 3px solid #f1f1f1;
            background-color: lavender;
        }

        label{
            display: block;
            font-size: 20px;
            color: #e91010;
            text-align: center;
        }

        #left {
            float: left;
            width: 25%;
            display: flex;
            flex-direction: column;
            height: 100vh;
            justify-content: center;
            background-color: grey;
        }

        #right {
            width: 80%;
            float: right;
        }

        #upper {

            height: 20vh;
            background-color: rgb(105,105,105);
        }
        

        #lower {

            height: 80vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 500px;
            padding-left: 30%;
            
        }

        h2 {
            display: inline-block;
            float: right;
            padding-right: 280px;
            padding-top: 80px;
            color:red;
        }

        .btn {
            background-color: rgb(160,90,90);
            color: white;
            padding: 16px 0px;
            border: none;
            cursor: pointer;
            width: 100%;
            font-size: 18px;
            border-bottom: 1px solid wheat;
        }

        .btn:hover {
            background-color:  rgb(71,3,3);
            opacity: 0.8;
        }



    </style>

</head>

<body >
    <div class="container">
        <div id="left">

            <div style="padding-bottom:50px; padding-left: 10px;" >
                
                <img src="images/logo.jpg" alt="photo" height="250" width="300" >
            </div>

            <div>
                <div>
					<a href="/backtohome"><button class="btn">Home</button> </a>
				</div>
                <div>
                    <a href="/salarypage"><button class="btn">Salary</button> </a>
                </div>
                <div>
                    <a href="leavepage"><button class="btn">Leave</button> </a>
                </div>
                <div>
                    <a href="leavedetails"><button class="btn">Leave Details</button> </a>
                </div>
                <div>
                    <a href="appraisalpage"><button class="btn">Appraisel</button> </a>
                </div>
                <div>
                    <a href="/"><button class="btn">Logout</button> </a>
                </div>
            </div>


        </div>

        <div id="right">
            <div id="upper">
                 <h1 style="display: inline-block;  padding-left: 315px; color:white;">welcome to employee portal</h1>
                <h2 style="display: inline-block; padding-right: 241px;   padding-top: 80px;">${name}</h2>
            </div>
            <div id="lower" >
            
            <h1>Total leave available: ${leaves}  </h1> 
            
            
            <h3>Apply for leave</h3>
                <div style="width: 500px;">
                    <form action="leavesuccess">
                        <label for="date"><b>Date:</b></label>
                        <input type="date" name="date" required><br><br>
                        <label for="description"><b>Description:</b></label>
                        <textarea name="description" rows="2" cols="50" required></textarea>
                        <br>
                        <br>
                        <br>
                        <button type="submit" class="btn">Submit</button>
                        
    
                    </form>
                   <h3> ${leavemsg}</h3>
                </div>
            </div>
        </div>
    </div>
</body>

</html>