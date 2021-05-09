

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            *{
                margin: 0;
                padding: 0;
            }
            body{
                background-color: lightgreen;
            }
            a{
                text-decoration: none;
                color: darkblue;
            }  
            div.register{
                width: 600px;
                height: 800px;
                position: absolute;
                background-color: aquamarine;
                left: 450px;
            }
            h1{
                text-align: center;
            }
            input{
                border: navy;
                width: 250px;
                padding: 12px;
                border-radius: 3px;
            }
            #register,label{
                font-size: 20px;                
            }
           
        </style>
    </head>
    <body>
        <div class="register">
        <form method="post" action="RegisterController">
        
        <h1><b><u>Registration Form</u></b></h1>
        <p></p><br><br>
        <label>Name:</label>
        <br>
        <input type="text" name="name" placeholder="Enter Your Name" size="30">
        <br><br>
        <label>Email:</label>
        <br>
        <input type="email" name="email" placeholder="Enter Your Email" size="30"><br><br>
        <label>Moblie No. :</label>
        <br>
        <input type="number" name="mobileno" maxlength="10" placeholder="Enter Your Mobile No." size="30">
        <br><br>
        <label>Create Password :</label><br>
        <input type="password" name='password' placeholder="Enter Password" size="30">
        <br> <br>
        
       
        <label>Block :</label>
        <br>
        <select name="block"> 
        <option value="A">A</option>
        <option value="B">B</option>
        <option value="C">C</option>
        <option value="D">D</option>
        <option value="E">E</option>
        <option value="F">F</option>
        <option value="G">G</option>
        <option value="H">H</option>
        <option value="I">I</option>
        </select>
        
        <br><br>
          
        <label>Floor no.:</label>
        <br>
        <select name="floorno"> 
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        <option value="6">6</option>
        <option value="7">7</option>
        <option value="8">8</option>
        </select>
           <br>
           <br>
        <label>Flat no.:</label><br>
        <input type="number" name="flatno" maxlength="3" size="30"><br>
        <label>Flat type:</label>
        <br>
        <input type="number" name="flattype" min="1" max="3" maxlength="1" placeholder="1 , 2 or 3" size="30">BHK
        <br><br>
        <input type="submit" name="submit_btn" value="submit">
           <br>
           <br>
           <br>
           <h1>Already Registered..<a href="login.jsp">Login</a></h1>
        
       
        </form>
        </div>
     </body>
</html>
 