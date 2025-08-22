function goBack(){
    let result = document.getElementById("retorno")
    result = window.location.href = "lista4.html"
}
function goQ1(){
let result = document.getElementById("q1").
result = window.location.href = "questao1.html"
}
function goQ2(){
let result = document.getElementById("q2").
result = window.location.href = "questao2.html"
}
function goQ3(){
let result = document.getElementById("q3").
result = window.location.href = "questao3.html"
}
function goQ4(){
let result = document.getElementById("q4").
result = window.location.href = "questao4.html"
}
function goQ5(){
alert("Caixa de alerta antes da renderização da página\nQuestão realizada")
let result = document.getElementById("q5").
result = window.location.href = "questao5.html"
}
function goQ6(){
let result = document.getElementById("q6").
result = window.location.href = "questao6.html"
}
function goQ7(){
let result = document.getElementById("q7").
result = window.location.href = "questao7.html"
}
function goQ8(){
let result = document.getElementById("q8").
result = window.location.href = "questao8.html"
}
function goQ9(){
let result = document.getElementById("q9").
result = window.location.href = "questao9.html"
}
function goQ10(){
let result = document.getElementById("q10").
result = window.location.href = "questao10.html"
}
function goQ11(){
let result = document.getElementById("q11").
result = window.location.href = "questao11.html"
}
function myQ3(){
    onclick=alert("Questão 3 realizada")
}
function myQ4(){
    document.getElementById("q4").innerHTML = "<p>Questão 4 realizada</p>"
    document.getElementById("b4").style.display = "none"
}
function myQ6(){
    const status = document.createTextNode("Realizada")
    const name = document.createTextNode("Gabriel R.")
    h.appendChild(status)
    p.appendChild(name)
    button = document.getElementById("b6")
    button.style.display = "none"

}
function myQ7(){
    let objQ7 = document.getElementById('h3')
    objQ7.style.color = "red"
    objQ7.innerHTML = "<h3>Questão 7 realizada</h3>"
    let button = document.getElementById("b7")
    button.style.display = "none"
    return this.objQ7
}
function myQ8(){
    const m1 = document.createElement("li")
    const m1a = document.getElementById("web1")
    const m2a = document.getElementById("web2")
    m1.appendChild(m1a)
    m1.appendChild(m2a)
    document.getElementById("list").appendChild(m1)
    document.getElementById("b8").style.display = "none"
    document.getElementById("finish").innerHTML = "<h4>Questão Realizada</h4>"
}
function myQ9(){
    const fahrenheit = parseFloat(document.getElementById("tempF").value)
    const celsius = (5/9)*(fahrenheit-32)
    document.getElementById("tempC").innerHTML = celsius.toFixed(2)+" C°"
    document.getElementById("tempF").value = null;

}
function myQ9b(){
    const result = document.getElementById("tempC");
    const b9 = document.getElementById("b9")
    const finish = document.getElementById("finish")
    
        if (result.style.display === "none"){
            result.style.display = "block";
        }
        else{
            result.style.display = "none";
            finish.innerHTML = "<b>Questão 9 Finalizada</b>";
            b9.style.display = "none";
        }

}
function myQ10(sheet1, sheet2){
    let objQ10 = document.getElementById('q10')
    objQ10.innerHTML = "<h3>Questão 10 realizada</h3>"
    document.getElementById("stylesheet").setAttribute("href", sheet1)
    document.getElementById("button").innerHTML = "Voltar ao CSS antigo"

    function myQ10a(){
        const retorno = document.getElementById("stylesheet").setAttribute("href", sheet2)
        objQ10.innerHTML = "<h3>CSS Retornado</h3>"
        document.getElementById("button").style.display = "none"
    }
    document.getElementById("button").addEventListener('click', myQ10a)

}
function myQ11(){
    const raio = parseFloat(document.getElementById("raio").value);
    const area = 3.14 * (raio**2)
    const areaf = area/100
    document.getElementById("result").innerHTML = areaf+" metros"
    document.getElementById("raio").value = null;
    document.getElementById("conclusao").innerHTML = "<h3>Questão Realizada</h3>"
}