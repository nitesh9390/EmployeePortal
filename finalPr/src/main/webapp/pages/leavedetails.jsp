<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Leave Details</title>

    <style>
        body {
            margin: 0;
            padding: 0;
        }
        .container {
            display: flex;
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
            padding-left: 30%;
            padding-top: 50px;
            
            
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
            background-color: rgb(71,3,3);
            opacity: 0.8;
        }

        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 50%;
            
        }

        td,
        th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        th {
            padding-top: 12px;
            padding-bottom: 12px;
            background-color: #4dbb93;
            color: white;
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
                    <a href="appraisalpage"><button class="btn">Appraisal</button> </a>
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
            <div id="lower"  >
            
            


                <table>
			<caption>Leave Histroy</caption>
			<tr>
				<th>date</th>
				<th>Reason</th>
			</tr>
			<c:forEach var="user" items="${viewLeave}">
				<tr>
					<td>${user.date} </td>
					<td>${user.description}</td>
				</tr>
			</c:forEach>
		</table>


            </div>

            

        </div>
    </div>
</body>

</html>