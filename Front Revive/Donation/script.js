//Formulario de donación
const btn = document.querySelector(".form_boton");
//Título del formulario
const greatement_text = document.querySelector(".greatement_text");


function cambioAProyectos(callback){
    setTimeout(callback, 1500);
}


document.form.addEventListener("submit", function(evento){

    btn.classList.toggle("form_boton--hide");
    greatement_text.classList.toggle("greatement_text");

    let donat = document.form.donat;
    let user = document.form.user;

    if (donat.value.trim() !== "" && user.value.trim() !== ""){
        evento.preventDefault(); //Le dice al evento que no siga con su función para encargarte tú, como programador, más adelante.
        cambioAProyectos( () => {
            window.location.href ="../Projects/Projects.html?user=" + user.value
        });
    } 
});