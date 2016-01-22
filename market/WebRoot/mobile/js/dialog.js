/**
 * Created by Fish on 2016/1/20.
 */
function dialog(title,content,time) {
    var test = '<div class="weui_dialog_alert">' +
        '<div class="weui_mask"></div>' +
        '<div class="weui_dialog"><div class="weui_dialog_hd"><strong class="weui_dialog_title">'+ title +'</strong></div>' +
        '<div class="weui_dialog_bd">'+ content +'</div>' +
        '<div class="weui_dialog_ft">' +
        '<a href="javascript:;" class="weui_btn_dialog primary" id="dealogDrop">确定</a>' +
        '</div>' +
        '</div>' +
        '</div>';
    $('body').append(test);
    $('body').on('touchstart','#dealogDrop', function () {
        $('.weui_dialog_alert').remove();
        test = null;
    });
    setTimeout(function () {
        $('.weui_dialog_alert').remove();
        test = null;
    },time);
}