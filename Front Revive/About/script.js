
//Mostrar modal del header tras clicar en la flecha del header o el icono del usuario
const img_usr = document.querySelector(".img_user");
const arr_usr = document.querySelector(".arrow_user");
const modal_header = document.querySelector(".modal_header");

//Flecha del header hacia arriba
const up_arr = "arrow-toggle-up-svgrepo-com.svg";
//Flecha del header hacia abajo
const down_arr = "arrow-toggle-down-svgrepo-com.svg";
//Hamburguesa del header cuando está para móvil
const brg_black = document.querySelector(".burguer_black");
//Menú móvil
const head_smll = document.querySelector(".head_small");


(function () {
    //Cambio de imagen de la flecha del header a su opuesto cuando clicamos la imagen del usuario
    img_usr.addEventListener("click", function () {
        modal_header.classList.toggle("modal_header--show");

        if (arr_usr.src.includes(up_arr)) {
            arr_usr.setAttribute("src", "arrow-toggle-down-svgrepo-com.svg");

        } else {
            arr_usr.setAttribute("src", "arrow-toggle-up-svgrepo-com.svg");

        }
    });

    //Cambio de color de la imagen del usuario cuando situamos el cursor encima de ella
    img_usr.addEventListener("mouseenter", function(){
        img_usr.setAttribute("src", "img_user_darker.png");
    });

    img_usr.addEventListener("mouseleave", function(){
        img_usr.setAttribute("src", "img_user.png");

    });
})();



//Cambio de imagen de la flecha del header a su opuesto cuando clicamos la imagen de la flecha
(function () {
    arr_usr.addEventListener("click", function () {
        modal_header.classList.toggle("modal_header--show");

        if (arr_usr.src.includes(up_arr)) {
            arr_usr.setAttribute("src", "arrow-toggle-down-svgrepo-com.svg");

        } else {
            arr_usr.setAttribute("src", "arrow-toggle-up-svgrepo-com.svg");

        }
    });
})();

//Mostrar menú del header en formato móvil
(function () {
    brg_black.addEventListener("click", function(){
        head_smll.classList.toggle("head_small--show");
    });
        
})();


(function () {
    mag_glass.addEventListener("mouseenter", () => {
        mag_glass.classList.toggle("glass--over");
    });
})();