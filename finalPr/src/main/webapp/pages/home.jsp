<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>home</title>
    <style>
        body {
            font-family: Cambria;
            background-image: url("/images/loginphoto.jpg");
           
      
        }

            
  

        #main-container {
            display: flex;
            flex-direction: column;
            
            justify-content: center;
            align-items: center;
            height: 500px;

        }
        }

        form {
            border: 3px solid #f1f1f1;
        }

        label{
            display: block;
            font-size: 20px;
            color: #e91010;
            text-align: center;
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

        .container {
            padding: 16px 40px;
            background-color: rgb(94, 169, 255);
        }

        h2{
            font-size: 50px; 
            font-weight: 300;
            color:white;
        }

        button {
            background-color: #e01235fa;
            color: white;
            padding: 12px 0px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            font-size: 18px;
        }

        button:hover {
            background-color: #011d33;
            opacity: 0.8;
        }
        #fail{
        font-size:30px;
        color:red;
        padding-left: 100px;
        }

    </style>
</head>

<body  >

    <div id="main-container">
        <div>
            <h2>Login Form</h2>
        </div>
        <div style="width: 490px;">
            <form action="/welcome" method="post">

                <div class="container">
                    <label for="name"><b>User Name</b></label>
                    <input type="text" placeholder="Enter User Name " name="name" required>

                    <label for="password"><b>Password</b></label>
                    <input type="password" placeholder="Enter Password" name="password" required>

                    <button type="submit">Login</button>

                </div>

            </form>
            <div id="fail">${failmsg}</div>
        </div>
    </div>

</body>

</html>