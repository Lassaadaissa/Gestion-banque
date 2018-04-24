
var app=angular.module("Banqueapp",[]);
app.controller("Banquecontroller", function($scope,$http) {
	
	$scope.codecompte=null;
	$scope.compte={};
	$scope.operation={type : "versement",montant : 0};
	$scope.pageoperations = [];
	$scope.pagecourant=0;
	$scope.pagesize=3;
	$scope.page=[];
	
	
	$scope.chargeroperation=function(){
		$http.get("/operations?codecompte="+$scope.codecompte+"&page="+$scope.pagecourant+"&size=" +
				$scope.pagesize)
		 .then(function(response){
			    $scope.pageoperations = response.data;			
			  
			  });
	};
	
	
	$scope.chargercompte=function(){
		$http.get("/comptes?codecpte="+$scope.codecompte)
		 .then(function(response){
			    $scope.compte = response.data;		
			    $scope.chargeroperation();
			  });
	};
	
	
	
	

	
	
	
	
	
	
	$scope.saveOperation=function(){
		$http({
			method :'PUT',
			url : $scope.operation.type,
			data : "codecompte="+$scope.codecompte+"&montant="+$scope.operation.montant+"&codeemp=1",
			headers : {'content-Type' : 'application/x-www-form-urlencoded'}
				
		})
		
		 .then(function(response){
			    $scope.chargercompte();		 
			  });
	};
	
	
	
	
	
	
	
	
	
});


	
	
	
	
	
	
	
	
	
	
	


