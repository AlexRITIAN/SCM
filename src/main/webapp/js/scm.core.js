function tableLoad(path){
	$.ajax({
		type : 'post',
		url : '/app/getAll.do',
		data : {},
		dataType : 'json',
		success : function(data) {
			alert("abc" + data[0].system);
			for(var i = 0;i<data.length;i++){
				$("#app_tbody").append("<tr><td class=\"center\"><label><input type=\"checkbox\" class=\"ace\" /><span class=\"lbl\"></span></label></td>"
						+"<td><a href=\"#\">"+ data[i].system +"</a></td>"
						+"<td>" + data[i].enviroment + "</td>"
						+"<td class=\"hidden-480\">" + data[i].app + " " + data[i].role + "</td>"
						+"<td>" + data[i].ip + "</td>"
						+"<td>" + data[i].owner + "</td>"
						+"<td>Nov 17 2017</td>"
						+"<td class=\"hidden-480\"><span class=\"label label-sm label-warning\">Expiring</span></td>"
						+"<td>"
						+"<div class=\"visible-md visible-lg hidden-sm hidden-xs action-buttons\">"
						+"<a class=\"blue\" href=\"#\">"
						+"<i class=\"icon-zoom-in bigger-130\"></i>"
						+"</a><a class=\"green\" href=\"#\"><i class=\"icon-pencil bigger-130\"></i></a>"
						+"<a class=\"red\" href=\"#\"><i class=\"icon-trash bigger-130\"></i></a></div>"
						+"<div class=\"visible-xs visible-sm hidden-md hidden-lg\">"
						+"<div class=\"inline position-relative\">"
						+"<button class=\"btn btn-minier btn-yellow dropdown-toggle\" data-toggle=\"dropdown\">"
						+"<i class=\"icon-caret-down icon-only bigger-120\"></i>"
						+"</button>"
						+"<ul class=\"dropdown-menu dropdown-only-icon dropdown-yellow pull-right dropdown-caret dropdown-close\">"
						+"<li>"
						+"<a href=\"#\" class=\"tooltip-info\" data-rel=\"tooltip\" title=\"View\">"
						+"<span class=\"blue\">"
						+"<i class=\"icon-zoom-in bigger-120\"></i>"
						+"</span>"
						+"</a>"
						+"</li>"
						+"<li>"
						+"<a href=\"#\" class=\"tooltip-success\" data-rel=\"tooltip\" title=\"Edit\">"
						+"<span class=\"green\">"
						+"<i class=\"icon-edit bigger-120\"></i>"
						+"</span>"
						+"</a>"
						+"</li>"
						+"<li>"
						+"<a href=\"#\" class=\"tooltip-error\" data-rel=\"tooltip\" title=\"Delete\">"
						+"<span class=\"red\"><i class=\"icon-trash bigger-120\"></i></span></a></li></ul></div></div></td></tr>");
			}
		}
	});
}



/*<tr>
<td class="center">
	<label>
		<input type="checkbox" class="ace" />
		<span class="lbl"></span>
	</label>
</td>
<td>
	<a href="#">ELois</a>
</td>
<td>PRE</td>
<td class="hidden-480">Windchill Master</td>
<td>10.99.231.85</td>
<td>yuhao5</td>
<td>Nov 17 2017</td>
<td class="hidden-480">
	<span class="label label-sm label-warning">Expiring</span>
</td>
<td>
	<div class="visible-md visible-lg hidden-sm hidden-xs action-buttons">
		<a class="blue" href="#">
			<i class="icon-zoom-in bigger-130"></i>
		</a>
		<a class="green" href="#">
			<i class="icon-pencil bigger-130"></i>
		</a>
		<a class="red" href="#">
			<i class="icon-trash bigger-130"></i>
		</a>
	</div>
	<div class="visible-xs visible-sm hidden-md hidden-lg">
		<div class="inline position-relative">
			<button class="btn btn-minier btn-yellow dropdown-toggle" data-toggle="dropdown">
				<i class="icon-caret-down icon-only bigger-120"></i>
			</button>

			<ul class="dropdown-menu dropdown-only-icon dropdown-yellow pull-right dropdown-caret dropdown-close">
				<li>
					<a href="#" class="tooltip-info" data-rel="tooltip" title="View">
						<span class="blue">
							<i class="icon-zoom-in bigger-120"></i>
						</span>
					</a>
				</li>

				<li>
					<a href="#" class="tooltip-success" data-rel="tooltip" title="Edit">
						<span class="green">
							<i class="icon-edit bigger-120"></i>
						</span>
					</a>
				</li>

				<li>
					<a href="#" class="tooltip-error" data-rel="tooltip" title="Delete">
						<span class="red">
							<i class="icon-trash bigger-120"></i>
						</span>
					</a>
				</li>
			</ul>
		</div>
	</div>
</td>
</tr>*/