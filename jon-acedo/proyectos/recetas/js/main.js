var counter = 1;

function main() {
    $('.menu_bar').click(function() {
        if (counter == 1) {
            $('nav').animate({
                left: '0'
            });
            counter = 0;
        } else {
            counter = 1;
            $('nav').animate({
                left: '-100%'
            });
        }
    });


    $('.submenu').click(function() {
        $(this).children('.children').slideToggle();
    });
}
