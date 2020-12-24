async function fetch_students() {

    let response = await fetch('api/students/getpaid')
    let commits = await response.json();
    console.log(commits);
    let table_data = document.getElementById("paid_id_data");
    table_data.innerHTML = '';
    for (let i = 0; i<commits.length; i++) {
        let tr_data = document.createElement('tr');
        tr_data.innerHTML = '<th scope="row">'+(i+1)+'</th>\n' +
            '            <td>'+commits[i]['student_id']+'</td>\n' +
            '            <td>'+commits[i]['first_name']+'</td>\n' +
            '            <td>'+commits[i]['last_name']+'</td>' +
            '            <td>'+commits[i]['Bill description']+'</td>' +
            '            <td>'+commits[i]['Payment date']+'</td>';
        table_data.appendChild(tr_data);
    }
}