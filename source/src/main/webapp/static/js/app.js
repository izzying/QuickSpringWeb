var gender = Array();
gender['m'] = "男";
gender['f'] = "女";

var status = Array();
status['active'] = "激活";
status['inactive'] = "未激活";


jQuery(document).ready(function () {
    $('#nav-side a').click(function () {
        $("#content-main").load($(this).attr('href'), {onlybody: 'yes'});
        /*$.ajax({
         url:$(this).attr('href'),
         data:{'onlybody':'yes'},
         success:function(resp){
         console.log(resp);
         $("#content-main").html(resp);
         }
         });*/
        return false;
    });
})
