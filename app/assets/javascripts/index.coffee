$ ->
  $.get "/sprints", (data) ->
    $.each data, (index, sprint) ->
      $("#sprints").append $("<li>").text sprint.name