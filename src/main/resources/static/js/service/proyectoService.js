app.factory("proyectoService", function($q, $http) {
	return {
		save: function(proyecto){			
			return $http.post('http://localhost:8080/registrarproyecto', proyecto).then(function(data){
				var received=angular.fromJson(data);				
				return received;
			}).catch(function(data){
				console.log(data);
			});
		},
		init: function(){
			return $http.get('http://localhost:8080/obtenerProyectos').then(function(data){
				var received = angular.fromJson(data);			
				return received;
			}).catch(function(data){
				console.log(data);
			});
		},
		saveActivo: function(activo){
			return $http.post('http://localhost:8080/registrarActivos', activo).then(function(data){
				var received=angular.fromJson(data);				
				return received;
			}).catch(function(data){
				console.log(data);
			});
		},
		getProyecto: function(codigoProyecto){
			return $http.post('http://localhost:8080/obtenerProyecto', codigoProyecto).then(function(data){
				var received=angular.fromJson(data);				
				return received;
			}).catch(function(data){
				console.log(data);
			});
		},
		getActivos: function(codigoProyecto){
			return $http.post('http://localhost:8080/obtenerActivos', codigoProyecto).then(function(data){
				var received=angular.fromJson(data);				
				return received;
			}).catch(function(data){
				console.log(data);
			});
		}
	}
});