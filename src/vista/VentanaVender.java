/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ProductoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author Cristóbal
 */
public class VentanaVender extends javax.swing.JFrame {

    /**
     * Creates new form VentanaVender
     */
    public VentanaVender() {
        initComponents();
    }
    
    public void limpiarTabla()
    {
       DefaultTableModel dtm=(DefaultTableModel)tblMostrar.getModel();
       int n=tblMostrar.getRowCount()-1;
       for (int i = 0; i <=n; i++) {
           dtm.removeRow(dtm.getRowCount()-1);
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonVolver = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        buttonCrearPedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        editTextIdProducto = new javax.swing.JTextField();
        editTextCantidadProducto = new javax.swing.JTextField();
        buttonAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonVolver.setText("VOLVER");
        buttonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVolverActionPerformed(evt);
            }
        });

        buttonLimpiar.setText("LIMPIAR");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        buttonCrearPedido.setText("CREAR PEDIDO");
        buttonCrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearPedidoActionPerformed(evt);
            }
        });

        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Tipo Producto", "Sub TIpo Producto", "Precio", "cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMostrar);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Formulario de nuevo pedido");

        editTextIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextIdProductoActionPerformed(evt);
            }
        });

        editTextCantidadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextCantidadProductoActionPerformed(evt);
            }
        });

        buttonAgregar.setText("AGREGAR");
        buttonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese el id del producto que desea añadir al carrito");

        jLabel3.setText("Ingrese Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(buttonCrearPedido)
                .addGap(16, 16, 16)
                .addComponent(buttonLimpiar)
                .addGap(16, 16, 16)
                .addComponent(buttonVolver)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(editTextIdProducto)
                                    .addComponent(jLabel3)
                                    .addComponent(editTextCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonAgregar))
                            .addComponent(jLabel2))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(editTextIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(buttonAgregar))
                .addGap(4, 4, 4)
                .addComponent(editTextCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCrearPedido)
                    .addComponent(buttonLimpiar)
                    .addComponent(buttonVolver))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVolverActionPerformed

    private void editTextCantidadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextCantidadProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextCantidadProductoActionPerformed

    private void buttonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarActionPerformed
        String id, nombre, tipoProducto, subTipoProducto;
        int  precio, cantidad;
        Producto nuevoProducto;
        ProductoDAO productoDAO = new ProductoDAO();
        Producto producto = productoDAO.buscarProducto(editTextIdProducto.getText());
        if(producto == null)//No existe
        {
            JOptionPane.showMessageDialog(this, "El codigo ingresado no esta asignado a ningun producto");
        }
        else //Existe
        {
            DefaultTableModel dtm = (DefaultTableModel)tblMostrar.getModel();
            String [] datos = new String[6];
            datos[0] = producto.getId();
            datos[1] = producto.getNombre();
            datos[2] = producto.getTipoProducto();
            datos[3] = producto.getSubTipoProducto();
            datos[4] = String.valueOf(producto.getPrecio());
            datos[5] = editTextCantidadProducto.getText();
            dtm.addRow(datos);
            tblMostrar.setModel(dtm);
        } 
        
        editTextIdProducto.setText("");
        editTextCantidadProducto.setText("");
        
    }//GEN-LAST:event_buttonAgregarActionPerformed

    private void editTextIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextIdProductoActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        limpiarTabla();
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void buttonCrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearPedidoActionPerformed
        ProductoDAO productoDAO = new ProductoDAO();
        
        JOptionPane.showInputDialog("Ingrese RUT del Vendedor");
        DefaultTableModel dtm = (DefaultTableModel)tblMostrar.getModel();
        int aux = dtm.getRowCount();
        for(int i = 0; i < aux ; i++){
            String cantidad = dtm.getValueAt(i, 5).toString();
            System.out.println("cantidad: "+cantidad);
            int cantidadAux = Integer.parseInt(cantidad);
            Producto producto = productoDAO.buscarProducto(dtm.getValueAt(i, 0).toString());
            System.out.println("cantidad: "+producto.getCantidad());
            if((producto.getCantidad() - cantidadAux) > 0){
                producto.setCantidad(producto.getCantidad() - cantidadAux);
                productoDAO.modificarProducto(producto);
            }else{
                JOptionPane.showMessageDialog(this, "La cantidad ingresada del producto: "+
                        productoDAO.buscarProducto(dtm.getValueAt(i, 0).toString()).getNombre()+
                        " es mayor al stock disponible");
            }
        }
        limpiarTabla();
    }//GEN-LAST:event_buttonCrearPedidoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregar;
    private javax.swing.JButton buttonCrearPedido;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JTextField editTextCantidadProducto;
    private javax.swing.JTextField editTextIdProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMostrar;
    // End of variables declaration//GEN-END:variables
}
