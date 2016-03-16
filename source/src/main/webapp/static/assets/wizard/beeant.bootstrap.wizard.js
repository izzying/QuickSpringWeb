;(function ($) {
    var methods = {
        init: function (options) {
            options = $.extend({}, $.fn.wizard.defaults, options);

            var obj = this;
            var tab = obj.find('.nav-tabs');
            var li = obj.find('li');

            obj.data('wizard.index', 0);
            obj.data('wizard.total', li.length);
            obj.data('wizard.setting', options);

            li.each(function(){
                $(this).children('a').addClass('step');
                $(this).css('width', 100/li.length + '%');
            })
            return obj.each(function () {
                if (options.clickableTab) {
                    li.click(function () {
                        var index = li.index($(this));
                        tab.children('li:eq(' + index + ') ').children(options.tabTag).tab('show');
                        obj.data('wizard.index', index);
                    });
                }
            });
        },
        show: function () {
            console.log('show');
        },
        next: function () {
            var obj = this;
            var tab = obj.find('.nav-tabs');
            var li = obj.find('li');
            var total = obj.data('wizard.total');
            var index = obj.data('wizard.index');
            var options = obj.data('wizard.setting');
            if (index >= total) {
                return false;
            }
            index = index + 1;
            tab.children('li:eq(' + index + ') ').children(options.tabTag).tab('show');
            obj.data('wizard.index', index);
        },
        pre: function (content) {
            var obj = this;
            var tab = obj.find('.nav-tabs');
            var li = obj.find('li');
            var total = obj.data('wizard.total');
            var index = obj.data('wizard.index');
            var options = obj.data('wizard.setting');
            if (index <= 0) {
                return false;
            }
            index = index - 1;
            tab.children('li:eq(' + index + ') ').children(options.tabTag).tab('show');
            obj.data('wizard.index', index);
        },
        last: function () {
            console.log('last');
        },
        first: function () {
            console.log('first');
        }
    };

    $.fn.wizard = function (method) {
        // 方法调用
        if (methods[method]) {
            return methods[method].apply(this, Array.prototype.slice.call(arguments, 1));
        } else if (typeof method === 'object' || !method) {
            return methods.init.apply(this, arguments);
        } else {
            console.log('Method' + method + 'does not exist on jQuery.wizard');
            $.error('Method' + method + 'does not exist on jQuery.wizard');
        }
    }

    // expose options
    $.fn.wizard.defaults = {
        clickableTab: false,
        onNext: null,
        tabTag: 'a',
    };
})(jQuery);