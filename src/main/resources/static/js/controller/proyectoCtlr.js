app.controller("proyectoCtrl",  ["$scope",  "proyectoService", function proyectoCtrl($scope, proyectoService) {
	$scope.proyectoIn= {};
	$scope.proyecto={};
	$scope.save=function(proyectoIn){		
		proyecto={"marcador":proyectoIn.marcador,"nombre": proyectoIn.nombre,"sectorTecnologico":proyectoIn.sectorTecnologico,
				"grupoInvestigacion":proyectoIn.grupoInvestigacion,"quienDiligencia":proyectoIn.quienDiligencia,
				"descripcion":proyectoIn.descripcion};		
		proyectoService.save(proyecto).then(function(message){
			alert(message.data+" El proyecto ha sido registrado");
		})
	}
	$scope.proyectoSelect={};
	$scope.ActivoIn={};
	$scope.init=function(){
		proyectoService.init().then(function(message){			
			$scope.proyectoSelect=message.data;		
		})
	}
	
	$scope.saveActivo=function(ActivoIn){
		activo={"nombre":ActivoIn.nombre,"estadoDeDesarrollo":ActivoIn.estadoDeDesarrollo,"tipoActivo":ActivoIn.tipoActivo,
				"idProyecto":ActivoIn.proyecto};
		proyectoService.saveActivo(activo).then(function(message){
			alert(message.data+" El activo ha sido registrado");
		})
	}
	
	$scope.proyectoOut={}
	$scope.getProyecto=function(codigoProyecto){
		proyectoService.getProyecto(codigoProyecto).then(function(message){			
			$scope.proyectoOut=message.data;		
		})
	}
	
	$scope.activoslist={}
	$scope.getActivos=function(codigoProyecto){
		proyectoService.getActivos(codigoProyecto).then(function(message){			
			$scope.activoslist=message.data;		
		})
	}
	
}]);