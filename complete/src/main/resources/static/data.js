var BASE_URL = "http://54.164.72.10:8080";

var ADD_CONTESTS_URL = BASE_URL + "/savecontests";
var LIST_CONTESTS_URL = BASE_URL + "/listcontests";

var DELETE_CONTESTS_URL = BASE_URL + "/deletecontests/%s";
var UPDATE_CONTESTS_URL = BASE_URL + "/updatecontests/%s";
var GET_CONTESTS_URL = BASE_URL + "/getcontests/%s";


async function getContests(id) {
	return JSON.parse(await get(GET_CONTESTS_URL.replace("%s", id)).catch((reason) => reason));
}

async function deleteContests(id) {
	await get(DELETE_CONTESTS_URL.replace("%s", id)).catch((reason) => reason);
}

async function updateContests(id, contest) {
	await post(UPDATE_CONTESTS_URL.replace("%s", id), contest).catch((reason) => reason);
}

async function saveContests(contest) {
	await post(ADD_CONTESTS_URL, contest).catch((reason) => reason);
}

async function listContests() {

    return JSON.parse(await get(LIST_CONTESTS_URL).catch((reason) => reason));
}

function get(url) {
	var http = new XMLHttpRequest();
	
	return new Promise(function(resolve, reject) {
		
		http.onreadystatechange = function() {
			if (http.readyState == 4) {
				if (http.status == 200) {
					resolve(http.responseText);
				} else if (http.status == 404 || http.status == 0) {
					reject('{"error":"404 or 0 error"}');
				} else {
					reject('{"error":"Error, status code = ' + http.status + '"}');
				}	
			}
		}
		
		http.open("GET", url, true);
		http.overrideMimeType("application/json");
		http.send();
	});
}

function post(url, parameters) {
	var http = new XMLHttpRequest();
	
	return new Promise(function(resolve, reject) {
		
		http.onreadystatechange = function() {
			if (http.readyState == 4) {
				if (http.status == 200) {
					resolve(http.responseText);
				} else if (http.status == 404 || http.status == 0) {
					reject('{"error":"404 or 0 error"}');
				} else {
					reject('{"error":"Error, status code = ' + http.status + '"}');
				}	
			}
		}
		
		http.open("POST", url, true);
		http.overrideMimeType("application/json");
		http.setRequestHeader("Content-Type", "application/json");
		http.send(parameters);
	});
}

