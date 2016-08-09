var WebPage = WebPage || {};
var CategoriesController = function () {
    var obj = {};

    function onDataLoaded(data) {
        var $tableBody = $("#allCategoriesTable");
        $tableBody.empty();
        data.forEach(function (value) {
            var $row = $("<tr>");
            $row.append($("<td>").text(value.categoryName));
            $tableBody.append($row);
        });

        var $selectBody = $("#categories");
        data.forEach(function(value) {
            var $s = '<option value="' + value.categoryId + '">' + value.categoryName + '</option>';
            $selectBody.append($s);
        })
    }

    function loadData() {
        $.get("loadListOfAllCategories", onDataLoaded);
    }

    obj.init = function () {
        loadData();
    };

    return obj;
};

$(function () {
    WebPage.categoriesController = CategoriesController();
    WebPage.categoriesController.init();
});