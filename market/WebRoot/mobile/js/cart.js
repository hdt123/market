/**
 * Created by Fish on 2016/2/23.
 */

var content = [];
content.content = $('.content');
content.goods = $('.goods');
//    touchstart
content.goods.on('click', function (e) {
    var button = e.target.className;
    var input = $(this).find('input[type = text]');
    var money = $(this).find('.subtotal span');
    var price = $(this).find('.unit-price span').html();
    var val = parseInt(input.val());
    switch (button) {
        case 'reduce':
            if(val > 1){
                input.val(val -  1);
                getTotal();
            } else {
                $(this).disabled = true;
            }
            break;
        case 'add':
            input.val(val + 1);
            getTotal();
            break;
        case 'delete':
            var conf = confirm('È·¶¨ÒªÉ¾³ýÂð£¿');
            if(conf) {
                $(this).next().remove();
                $(this).remove();
            }
            break;
    }
});
content.content.on('click','.check',function () {
    if($(this).find($("input[class='checked']")).is(':checked')){
        $(this).find('.checked').attr('checked',false);
        $(this).find('.checked-icon').removeClass('checked-active')
    }else{
        $(this).find('.checked').attr('checked',true);
        $(this).find('.checked-icon').addClass('checked-active');
    }
    check();
    getTotal();
});
function getTotal(){
    var all_money = 0;
    for(var i = 0; i < content.goods.length; i++){
        if(content.goods.eq(i).find($("input[class='checked']")).is(':checked')){
            all_money += parseFloat(content.goods.eq(i).find('.unit-price span').html());
            $('.total-price span').html(all_money.toFixed(2));
        } else {
            $('.total-price span').html('0');
        }
    }
    if(content.goods.length == 0){
        $('.total-price span').html('0');
    }
}
function check() {
    if($('input[class="checked"]:checked').length == $('.checked').length){
        $('.all-checked').attr('checked',true);
        $('.all-check i').addClass('checked-active');
    } else {
        $('.all-checked').attr('checked',false);
        $('.all-check i').removeClass('checked-active');
    }
}

$('.all-check').on('click', function () {
    if($("input[class='all-checked']").is(':checked')){
        $('.all-checked').attr('checked',false);
        $('.all-check i').removeClass('checked-active');
        $('.checked').each(function () {
            $(this).attr('checked',$('.all-checked').is(':checked'));
            $(this).nextAll('.checked-icon').removeClass('checked-active');
        })
    } else {
        $('.all-checked').attr('checked',true);
        $('.all-check i').addClass('checked-active');
        $('.checked').each(function () {
            $(this).attr('checked',$('.all-checked').is(':checked'));
            $(this).nextAll('.checked-icon').addClass('checked-active');
        })
    }
    getTotal();
});
