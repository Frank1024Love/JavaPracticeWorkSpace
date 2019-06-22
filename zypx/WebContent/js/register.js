var a=angular.module("register",[]);
a.controller("lctrl",function($scope,$http){
    $scope.un="";
    $scope.up="";
    $scope.up1="";

    $scope.cl1=function(){
    	if($scope.up==""||$scope.un==""){
        	 alert("密码不能为空");
         }
         else{
        	 var f=$http.get("register.jspx?un="+$scope.un+"&up="+$scope.up+"&up1="+$scope.up1);
             f .success(function(data){
                if(data.msg=="error"){
                     alert("该用户已被注册！");
                 }
                 else{
                     alert("注册成功，正在跳转……");
                     window.location.href="login.html";
                 }
             });
         }

    };

});

a.controller("actrl",function($scope,$http){
    $scope.aaaa="";

});
