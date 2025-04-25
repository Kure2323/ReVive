const revive_static = document.querySelector(".revive_estatico");
const modal_static = document.querySelector(".modal_revive_estatico");


(function () {
    revive_static.addEventListener("mouseenter", function () {
        modal_static.classList.add("modal_revive_estatico--show");
    });

    revive_static.addEventListener("mouseleave", function () {
        modal_static.classList.remove("modal_revive_estatico--show");
    });


})();

(function () {
    const title = document.querySelector("#title");
    const title_pc = document.querySelector("#title").innerHTML;
    const title_mobile = title_pc.replace("-", "");


    window.addEventListener("resize", (() => {

        let win_width = window.screen.width;
        let win_height = window.screen.height;

        if (win_width <= 768) {
            title.innerHTML = title_mobile;
        } else {
            title.innerHTML = title_pc;
        }
    }));

})();
