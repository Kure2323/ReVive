//Imagen de abajo a la derecha del logo
const revive_static = document.querySelector(".revive_estatico");
//Modal escondido al pasar el ratón por encima de revive estático
const modal_static = document.querySelector(".modal_revive_estatico");

//Función para mostrar el modal al pasar el ratón por encima de revive estático
// y ocultarlo al salir del área del ratón
(function () {
    revive_static.addEventListener("mouseenter", function () {
        modal_static.classList.add("modal_revive_estatico--show");
    });

    revive_static.addEventListener("mouseleave", function () {
        modal_static.classList.remove("modal_revive_estatico--show");
    });


})();

/*

(function () {
    const title = document.querySelector("#title");
    const title_pc = document.querySelector("#title").innerHTML;
    const title_mobile = title_pc.replace("-", " ");


    window.addEventListener("resize", function () {

        let win_width = window.screen.width;
        let win_height = window.screen.height;

        if (win_width <= 768) {
            title.innerHTML = title_mobile;
        } else {
            title.innerHTML = title_pc;
        }
    });

})();*/
