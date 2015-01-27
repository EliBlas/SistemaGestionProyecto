angular.module("loginController",[])
    .controller("LoginController",['$scope',function($scope){

        $scope.login = function(){
            console.log($scope.user);
        }
    }])