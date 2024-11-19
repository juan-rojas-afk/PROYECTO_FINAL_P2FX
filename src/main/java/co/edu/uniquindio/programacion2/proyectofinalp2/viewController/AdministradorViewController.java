package co.edu.uniquindio.programacion2.proyectofinalp2.viewController;

import co.edu.uniquindio.programacion2.proyectofinalp2.Service.IReporte;
import co.edu.uniquindio.programacion2.proyectofinalp2.controller.AdministradorController;
import co.edu.uniquindio.programacion2.proyectofinalp2.decorator.*;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.VendedorDto;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Administrador;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.ReporteBase;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Usuario;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import static co.edu.uniquindio.programacion2.proyectofinalp2.utils.PrestamoConstantes.*;

public class AdministradorViewController {
    AdministradorController administradorController;
    List<Usuario> listaUsuarios=new ArrayList<>();
    ObservableList<VendedorDto> listaVendedoresDto = FXCollections.observableArrayList();
    VendedorDto vendedorSeleccionado;
    private MarketPlaceViewController marketplaceController;
    StringBuilder contenidoReporte = new StringBuilder();
    Administrador administrador=new Administrador();
    ObservableList<String> listaObservableUsuarios = FXCollections.observableArrayList();


    public void setMarketplaceController(MarketPlaceViewController marketplaceController) {
        this.marketplaceController = marketplaceController;
    }



    @FXML
    private DatePicker DatepikerAdmin;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Tab AdminVendedor;

    @FXML
    private Tab Estadisticas;

    @FXML
    private Button bntActualizarVendedor;

    @FXML
    private Button bntAgragarVendedor;

    @FXML
    private Button btnEliminarVendedor;

    @FXML
    private Button btnExportar;


    @FXML
    private RadioButton rbntCantidadFecha;

    @FXML
    private RadioButton rbtnCantidadMensajes2Ven;

    @FXML
    private RadioButton rbtnCantidadPorVendedor;

    @FXML
    private RadioButton rbtnContactosPorVendedor;

    @FXML
    private RadioButton rbtnTopProductos;

    @FXML
    private ChoiceBox<String> chbNombreVendedores;

    @FXML
    private TableView<VendedorDto> tableVendedores;

    @FXML
    private TableColumn<VendedorDto, String> tbNombreVendedor;

    @FXML
    private TableColumn<VendedorDto, String> tbApellidoVendedor;

    @FXML
    private TableColumn<VendedorDto, String> tbCedulaVendedor;

    @FXML
    private TableColumn<VendedorDto, String> tbDireccionVendedor;

    @FXML
    private TableColumn<VendedorDto, String> tbUsuarioVendedor;

    @FXML
    private TableColumn<VendedorDto, String> tbContrasenaVendedor;

    @FXML
    private TextField txtApellidoVendedor;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtContrasenaVendedor;

    @FXML
    private TextField txtDireccionVendedor;

    @FXML
    private TextField txtNombreVendedor;

    @FXML
    private TextField txtUsuarioVendedor;

    @FXML
    void onActualizarVendedor(ActionEvent event) {
        actualizarVendedor();
    }

    @FXML
    void onAgregarVendedor(ActionEvent event) {
        agregarVendedor();
    }

    @FXML
    void onEliminarVendedor(ActionEvent event) {
        eliminarVendedor();
    }

    @FXML
    void onExportar(ActionEvent event) {
        exportar ();
    }

    @FXML
    void initialize() {
        administradorController = new AdministradorController();
        administrador=administradorController.obtenerAdmin();
        initView();
        chbNombreVendedores.setItems(listaStringVendedores(listaUsuarios));
    }

    private ObservableList<String> listaStringVendedores(List<Usuario> listaUsuarios) {
        for(Usuario usuario:listaUsuarios){
            listaObservableUsuarios.add(usuario.getNickUsuario());
        }
        listaObservableUsuarios.remove("admin");
        return listaObservableUsuarios;
    }

    private void initView() {
        initDataBinding();
        obtenerVendedores();
        tableVendedores.getItems().clear();
        tableVendedores.setItems(listaVendedoresDto);
        limpiarCampos();
        listenerSelection();
    }

    private void obtenerVendedores() {
        listaVendedoresDto.addAll(administradorController.obtenerVendedores());
        listaUsuarios.addAll(administradorController.obtenerUsuarios());
    }

    private void initDataBinding() {
        tbNombreVendedor.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombre()));
        tbApellidoVendedor.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().apellido()));
        tbCedulaVendedor.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().cedula()));
        tbDireccionVendedor.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().direccion()));
        tbUsuarioVendedor.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().usuario().getNickUsuario()));
        tbContrasenaVendedor.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().usuario().getContrasena()));
    }



    private void listenerSelection() {
        //Sirve la dar la seleccion de la tabla cada que se seleccione se va guardar en una variable cliente seleccionado
        tableVendedores.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            vendedorSeleccionado = newSelection;
            //Cada que se seleccione de hace una nueva seleccion y se va mostrar el seleccionado
            mostrarInformacionCliente(vendedorSeleccionado);
        });
    }
    private void mostrarInformacionCliente(VendedorDto vendedorSeleccionado) {
        //Verificar que el cliente exista
        if(vendedorSeleccionado !=null){
            //Mostrar en los texFiel los datos que se selecciono
            txtNombreVendedor.setText(vendedorSeleccionado.nombre());
            txtApellidoVendedor.setText(vendedorSeleccionado.apellido());
            txtCedula.setText(vendedorSeleccionado.cedula());
            txtDireccionVendedor.setText(vendedorSeleccionado.direccion());
            txtUsuarioVendedor.setText(vendedorSeleccionado.usuario().getNickUsuario());
            txtContrasenaVendedor.setText(vendedorSeleccionado.usuario().getContrasena());
        }
    }

    private void agregarVendedor() {
        VendedorDto vendedorDto = crearVendedorDto();
        if(datosValidosDto(vendedorDto)){

            if(administradorController.agregarVendedor(vendedorDto)){
                listaVendedoresDto.add(vendedorDto);
                listaUsuarios.add(vendedorDto.usuario());
                listaObservableUsuarios.add(vendedorDto.usuario().getNickUsuario());
                chbNombreVendedores.getItems().clear();
                chbNombreVendedores.setItems(listaObservableUsuarios);
                marketplaceController.agregarTabVendedor(vendedorDto.usuario().getNickUsuario());
                limpiarCampos();
                mostrarMensaje(TITULO_VENDEDOR_AGREGADO, HEADER, BODY_VENDEDOR_AGREGADO, Alert.AlertType.INFORMATION);
            }else{
                mostrarMensaje(TITULO_VENDEDOR_NO_AGREGADO, HEADER, BODY_VENDEDOR_NO_AGREGADO,Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje(TITULO_INCOMPLETO, HEADER, BODY_INCOMPLETO,Alert.AlertType.WARNING);

        }
    }

    private void limpiarCampos() {
        txtNombreVendedor.setText("");
        txtApellidoVendedor.setText("");
        txtCedula.setText("");
        txtDireccionVendedor.setText("");
        txtUsuarioVendedor.setText("");
        txtContrasenaVendedor.setText("");
        vendedorSeleccionado=crearVendedorDto();
    }

    private boolean datosValidosDto(VendedorDto vendedorDto) {
        if(vendedorDto.nombre().isEmpty() ||
                vendedorDto.apellido().isEmpty() ||
                vendedorDto.cedula().isEmpty() ||
                vendedorDto.direccion().isEmpty() ||
                vendedorDto.usuario().getNickUsuario().isEmpty() ||
                vendedorDto.usuario().getContrasena().isEmpty()){
            return false;
        }else {
            return true;
        }
    }

    private VendedorDto crearVendedorDto() {
        Usuario usuario=new Usuario(txtUsuarioVendedor.getText(), txtContrasenaVendedor.getText(),txtCedula.getText());

        return new VendedorDto(txtNombreVendedor.getText(),
                txtApellidoVendedor.getText(),
                txtCedula.getText(),
                txtDireccionVendedor.getText(),
                usuario);
    }

    private void actualizarVendedor() {

        VendedorDto vendedorOld = datosViejos(vendedorSeleccionado);
        VendedorDto vendedorActualizado = crearVendedorDto();
        if (datosValidosDto(vendedorActualizado)){
            if(administradorController.actualizarVendedor(vendedorOld,vendedorActualizado)){
                for (int i=0; i<listaVendedoresDto.size(); i++){
                    VendedorDto vendedorDto = listaVendedoresDto.get(i);
                    if(vendedorDto.cedula().equalsIgnoreCase(vendedorOld.cedula())){
                        listaVendedoresDto.set(i,vendedorActualizado);
                        listaUsuarios.set(i,vendedorActualizado.usuario());
                    }
                }

                limpiarCampos();
                mostrarMensaje(TITULO_VENDEDOR_ACTUALIZADO, HEADER, BODY_VENDEDOR_ACTUALIZADO,Alert.AlertType.INFORMATION);
            }else{
                mostrarMensaje(TITULO_VENDEDOR_NO_ACTUALIZADO, HEADER, BODY_VENDEDOR_NO_ACTUALIZADO,Alert.AlertType.ERROR);
            }

        }else {
            mostrarMensaje(TITULO_INCOMPLETO, HEADER, BODY_INCOMPLETO,Alert.AlertType.WARNING);

        }
    }

    private VendedorDto datosViejos(VendedorDto vendedorSeleccionado) {

        return new VendedorDto(vendedorSeleccionado.nombre(),
                vendedorSeleccionado.apellido(),
                vendedorSeleccionado.cedula(),
                vendedorSeleccionado.direccion(),
                vendedorSeleccionado.usuario());
    }

    private void eliminarVendedor() {
        VendedorDto vendedorDto = vendedorSeleccionado;
        if(vendedorDto != null){
            if(administradorController.eliminarVendedor(vendedorDto)){
                listaVendedoresDto.remove(vendedorDto);
                listaUsuarios.remove(vendedorDto.usuario());
                limpiarCampos();
                mostrarMensaje(TITULO_VENDEDOR_ELIMINADO, HEADER, BODY_VENDEDOR_ELIMINADO,Alert.AlertType.INFORMATION);
            }else {
                mostrarMensaje(TITULO_VENDEDOR_NO_ELIMINADO, HEADER, BODY_VENDEDOR_NO_ELIMINADO,Alert.AlertType.ERROR);
            }
        }else {
            mostrarMensaje(TITULO_INCOMPLETO, HEADER, BODY_INCOMPLETO,Alert.AlertType.WARNING);
        }

    }

    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType) {
        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();
    }

    @FXML
    private Label mensajeLabel;


    public void exportar(){
            contenidoReporte.setLength(0);
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Guardar Reporte");
            fileChooser.setInitialFileName("reporte_seleccion.txt");
            File archivo = fileChooser.showSaveDialog(new Stage());
            if (archivo != null) {
                String contenido = generarContenidoReporte();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {

                    writer.write(contenido);
                    mensajeLabel.setText("Reporte exportado exitosamente a: " + archivo.getAbsolutePath());
                } catch (IOException e) {
                    mensajeLabel.setText("Error al exportar el reporte: " + e.getMessage());
                }
            } else {
                mensajeLabel.setText("Exportación cancelada.");
            }
        }

    private String generarContenidoReporte() {
        IReporte reporte = new ReporteBase();
        if (rbtnCantidadMensajes2Ven.isSelected()) {
            reporte = new ReporteCantidadMensajesEntreVendedor(reporte);
        }
        if (rbntCantidadFecha.isSelected()) {
            reporte = new ReporteFechaProductosPublicados(reporte,DatepikerAdmin.getValue());
        }
        if (rbtnCantidadPorVendedor.isSelected()) {
            reporte = new ReporteCantidadProductosPublicados(reporte,chbNombreVendedores.getValue().toString());
        }
        if (rbtnContactosPorVendedor.isSelected()) {
            reporte = new ReporteContactosVendedor(reporte);
        }
        if (rbtnTopProductos.isSelected()) {
            reporte = new ReporteProductosTop(reporte);
        }
        return reporte.getReporte();
    }


    private void mensajesEnviados() {
            String mensaje = "Reporte: Cantidad de mensajes enviados entre dos vendedores.\n";
            contenidoReporte.append(mensaje);
        }
        private void cantidadPorFecha() {
            String mensaje = "Reporte: Cantidad de productos publicados en determinada fecha.\n";
            contenidoReporte.append(mensaje);
        }
        private void cantidadPorVendedor(String vendedor) {
            String mensaje =  "Reporte: Cantidad de productos publicados por " + vendedor + ".\n";
            contenidoReporte.append(mensaje);
        }
        private void topProductos() {
            String mensaje = "Reporte: Top 10 de los productos con más me gusta.\n";
            contenidoReporte.append(mensaje);
        }
    }






