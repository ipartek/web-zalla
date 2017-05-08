'use strict';

// Este código no debería de poder funcionar en Internet Explorer 11
// porque las funciones lambda no funcionan en él

// Necesita un servidor, porque no permite Cross-Origin :(
const getMessage = () => 'Hola desde Babbel';
alert(getMessage());