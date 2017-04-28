function saludar() {
    alert('aloha!');
    document.write('bienvenido')
}
window.onload = saludar;

for (var n = 1; n <= 10; n++) {
    console.log("For:" + n);
    document.write("For:" + n);
}
