"use strict";

document.addEventListener("DOMContentLoaded", init);

function init(){

    document.querySelectorAll(".pickpercentage").forEach(element => {
        element.innerHTML = `${random(50,100)}%`;
    });

}

function random(min,max){
    return Math.floor(min+Math.random()*(max-min)+1);
}