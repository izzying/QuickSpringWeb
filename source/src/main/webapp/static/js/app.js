jQuery(document).ready(function () {
    $('#nav-side a').click(function () {
        console.log("click sider a");
        console.log($(this).attr('href'));
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
