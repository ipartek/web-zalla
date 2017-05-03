function show() {
    var mediaquery = window.matchMedia("(max-width: 640px)");
    var vinculos = document.getElementsByClassName("vinculos");
    if (mediaquery.matches || vinculos[0].style.display === 'none') {
        // mediaquery es 640
        vinculos[0].style.display = 'block';
        vinculos[1].style.display = 'block';
        vinculos[2].style.display = 'block';
        vinculos[3].style.display = 'block';
    } else {
        // mediaquery no es 640
        vinculos[0].style.display = 'none';
        vinculos[1].style.display = 'none';
        vinculos[2].style.display = 'none';
        vinculos[3].style.display = 'none';
    }

}
