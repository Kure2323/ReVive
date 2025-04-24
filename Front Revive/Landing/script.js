const revive_static = document.querySelector(".revive_estatico");
const modal_static = document.querySelector(".modal_revive_estatico");

(function(){
    revive_static.addEventListener("mouseenter", function(){
        modal_static.classList.add("modal_revive_estatico--show");
    });

    revive_static.addEventListener("mouseleave", function(){
        modal_static.classList.remove("modal_revive_estatico--show");
    });
})();