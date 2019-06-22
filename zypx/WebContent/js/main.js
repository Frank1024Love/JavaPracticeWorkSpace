var a=angular.module("main",[]);

a.controller("mainctrl",function($scope,$http){
    $scope.urealname="";
    $scope.menus=[];
    $scope.sss=[];

    $scope.fun1=function(){
        $scope.urealname=window.localStorage.getItem("realname");
        var uid=window.localStorage.getItem("uid");
        var f=$http.get("menus.jspx?uid="+uid);
        f.success(function(data){
            $scope.menus=data;
            $scope.sss=[];
            for(var i=0;i<$scope.menus.length;i++){
                $scope.sss.push(false);
            }
            $scope.sss[0]=true;

        });
    };

    $scope.fun2=function(ind){
        for(var i=0;i<$scope.sss.length;i++){
            $scope.sss[i]=false;
        }
        $scope.sss[ind]=true;
    };

    $scope.fun1();


});