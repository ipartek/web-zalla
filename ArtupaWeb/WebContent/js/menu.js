/**
 * menu
 */
function direccionar(opcion) {
	switch (opcion) {
	case 'clientes':
		alert('Clientes');
		document.form1.action = 'SrvClientes';
		document.form1.submit();
		break;

	case 'pedidos':
		alert('Pedidos');
		document.form1.action = 'SrvPedidos';
		document.form1.submit();
		break;
	}
};