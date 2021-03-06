<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <#--<link rel="icon" href="img/favicon.ico">-->

    <title>Signin</title>

    <style type="text/css">

    <#-- Bootstrap core CSS -->
    /*<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">*/
    <#include "css/bootstrap.min.css">
    <#-- Custom styles for this template -->
    /*<link rel="stylesheet" type="text/css" href="assets/css/style.css">*/
    <#include "css/style.css">

    </style>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body class="text-center">

<form class="form-signin" action="login" method="post">
    <img class="mb-4" src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/Logo-Tinder.svg/1200px-Logo-Tinder.svg.png" alt="" width="150"
         height="75">
    <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
    <label for="inputEmail" class="sr-only">Email address</label>
    <input type="email" name="login" id="inputEmail" class="form-control" placeholder="Email address"
           required autofocus>
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password"
           required>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    <div class="mt-4">
        <div class="d-flex justify-content-center links">
            Don't have an account? <a href="/register" class="ml-2">Sign Up</a>
        </div>
    </div>
    <#if IsAnybodyLogged == true>
    <div class="mt-1">
        <div class="d-flex justify-content-center links">
            <a href="/logout" class="ml-2">Logout</a>
        </div>
    </div>
</#if>
    <p class="mt-5 mb-3 text-muted">&copy; FS12 Group 2021</p>
</form>


</body>
</html>