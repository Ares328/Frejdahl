"use strict";

const fireMin = 40;
const firemax = 190;
let currentFire = fireMin;

document.addEventListener("DOMContentLoaded", init);


function init(){

    setInterval(function(){
        if(currentFire >= firemax || (randomBool() && currentFire > fireMin)) currentFire-=5
        else currentFire+=5;
        document.getElementById("question").style.color = `rgb(255,${currentFire}, 0)`;
    }, 10)

}

async function startFire(){
    let currentFire = fireMin;
    while(true){
        if(random(0,1) === 1 && currentFire > fireMin ) currentFire--
        else currentFire ++;
        document.getElementById("question").style.color = `rgb(255,${currentFire}, 0)`;
        await sleep(100);
    }
    
}


function randomBool(){
    return Math.random() >= 0.5;
}