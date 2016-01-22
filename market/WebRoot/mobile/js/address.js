/**
 * Created by Fish on 2016/1/20.
 */
var frm = {};
frm.name = $('.frm-name');
frm.tel = $('.frm-tel');
frm.province = $('.frm-province');
frm.city = $('.frm-city');
frm.county = $('.frm-county');
frm.address = $('.frm-address');
frm.submit = $('.frm-btn');
/*
frm.province.attr("disabled", "disabled");
frm.city.attr("disabled", "disabled");
frm.county.attr("disabled", "disabled");
frm.address.attr("disabled", "disabled");
*/
frm.submit.on('touchstart', function () {
    if(frm.name.val() == ''){
        dialog('信息缺漏','请填写收货人姓名',2000);
        return false;
    }
    else if (frm.tel.val() == ''){
        dialog('信息缺漏','请填写联系方式',2000);
        return false;
    }
    else if (frm.province.val() == 0){
        dialog('信息缺漏','请选择省份',2000);
        return false;
    }
    else if (frm.city.val() == 0){
        dialog('信息缺漏','请选择城市',2000);
        return false;
    }
    else if (frm.county.val() == 0){
        dialog('信息缺漏','请选择县/区',2000);
        return false;
    }
    else if (frm.address.val() == ''){
        dialog('信息缺漏','请填写具体收货地址',2000);
        return false;
    }
});