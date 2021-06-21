'use strict'
angular.module('demo.services', []).factory('UserService', ["$http", "CONSTANTS", function($http, CONSTANTS) {
    let service = {};
    service.getUserById = function(userId) {
        let url = CONSTANTS.getUserByIdUrl + userId;
        return $http.get(url);
    }
    service.getAllUsers = function() {
        return $http.get(CONSTANTS.getAllUsers);
    }
    service.saveUser = function(userDto) {
        return $http.post(CONSTANTS.saveUser, userDto);
    }
    return service;
}]);